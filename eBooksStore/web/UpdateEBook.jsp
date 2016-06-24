<%-- 
    Document   : UpdateEBook
    Author     : gheorgheaurelpacurar
    Description: This is an example of calling a user defined tags library from
                 a JSP. Class behind user defined library is ebookupdate java 
                 class.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="gap" uri="WEB-INF/tlds/eBooksTags_library.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./eBooksStore.css"> 
    </head>
    <body>
        <h1>Update eBook</h1>
        <form action=UpdateEBook.jsp" method="put">
            <table>
                <tr><td>I.S.B.N.:</td><td><input type="text" name="inputform_updatebook_ISBN"></input></td><td></td></tr>
                <tr><td>Title:</td><td><input type="text" name="inputform_updatebook_title"></input></td><td></td></tr>
                <tr><td>Authors:</td><td><input type="text"name="inputform_updatebook_authors"></input></td><td></td></tr>
                <tr><td>Devices:</td><td><input type="text"name="inputform_updatebook_devices"></input></td><td></td></tr>
                <tr><td>Price:</td><td><input type="text"name="inputform_updatebook_price"></input></td><td></td></tr>
            </table>
            <input type="submit" class="citybutton" value="Update" name="inputform_updatebook_update">
        </form>
    </body> 
    <%
        if (request.getParameter("inputform_updatebook_update") != null) {
            %>
            <gap:ebookupdate isbn="<%= request.getParameter("inputform_updatebook_ISBN") %>" 
                             title="<%= request.getParameter("inputform_updatebook_title") %>" 
                             authors="<%= request.getParameter("inputform_updatebook_authors") %>" 
                             devices="<%= request.getParameter("inputform_updatebook_devices") %>" 
                             price="<%= Float.parseFloat(request.getParameter("inputform_updatebook_price")) %>"></gap:ebookupdate>
            <jsp:forward page="index.jsp"></jsp:forward>
            <%
        }
    %>
</html>
