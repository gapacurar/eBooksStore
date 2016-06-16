<%-- 
    Document   : DeleteEBook
    Author     : gheorgheaurelpacurar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./eBooksStore.css"> 
        <title>Search and Delete an eBook</title>
    </head>
    <body>
        <h1>Search eBook using its ISBN</h1>
        <h3>You have to search first using ISBN and after identifying the eBook you can delete it.</h3>
        <br>
        <form action = "DeleteEBook.jsp" method="post">
            I.S.B.N.: <input type="text" name="inputform_searchebook_ISBN" value="replace this text with ISBN" ></input>
                      <input type="submit" value="Search" name="inputform_searchebook_search">
                      <br>
                      <input type="submit" class="citybutton" value="Delete" name="inputform_deleteebook_delete">
        </form>
        <%-- we are using ebooksstorebeans.eBookBean Java Bean Class to identify the record based on ISBN and to load values in bean 
        when Search button is pushed--%>
        <% // this code - Scriptlet - is used to analyse push of buttons in DeleteEBook.JSP servlet
            if (request.getParameter("inputform_searchebook_search")!= null) {
                %>
                        <jsp:useBean id="eBookBean" class="ebooksstorebeans.eBookBean" scope="session">
                            <jsp:setProperty name="eBookBean" property="isbn" value= "<%= request.getParameter("inputform_searchebook_ISBN") %>" /> 
                            ISBN: <jsp:getProperty name="eBookBean" property="isbn"/><br>
                            TITLE: <jsp:getProperty name="eBookBean" property="title"/><br>
                            AUTHORS: <jsp:getProperty name="eBookBean" property="authors"/><br>
                            DEVICES: <jsp:getProperty name="eBookBean" property="devices"/><br>
                            PRICE: <jsp:getProperty name="eBookBean" property="price"/> <br>
                        </jsp:useBean>    
                <%
            }
            if (request.getParameter("inputform_deleteebook_delete") != null) {
                %> 
                    <jsp:setProperty name="eBookBean"
                    property="delete" value="true"/>
                    <jsp:forward page="index.jsp"></jsp:forward>
                <%                         
            }
        %>
    </body>
</html>
