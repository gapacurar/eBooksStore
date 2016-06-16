<%-- 
    Document   : UpdateEBook
    Author     : gheorgheaurelpacurar
    Description: Display the list of all ebooks from database using JSTL tags for DB.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./eBooksStore.css"> 
        <title>Display all eBooks</title>
    </head>
    <body>
        <h1>Display all eBooks using only Java Standard Tags Library elements for DB</h1>
        <br>
        <sql:setDataSource 
            var="snapshot" 
            driver="org.apache.derby.jdbc.ClientDriver40"
            url="jdbc:derby://localhost/ebooks;create=true;"
            user="derbyremote"  
            password="derbyremote"/>
        
        <sql:query dataSource="${snapshot}" var="result">
            SELECT * from ebooks
        </sql:query>

        <table border="1" width="100%">
            <tr>
            <th>ISBN</th>
            <th>TITLE</th>
            <th>AUTHORS</th>
            <th>DEVICES</th>
            <th>PRICE</th>
            </tr>
            <c:forEach var="row" items="${result.rows}">
            <tr>
                <td><c:out value="${row.isbn}"/></td>
                <td><c:out value="${row.title}"/></td>
                <td><c:out value="${row.authors}"/></td>
                <td><c:out value="${row.devices}"/></td>
                <td><c:out value="${row.price}"/></td>
            </tr>
            </c:forEach>
        </table>
        <form action="index.jsp" flush="true">    
            <input type="submit" class="citybutton" name="displayallebooks_exit" value="Back" size="40">
        </form>  
    </body>
</html>
