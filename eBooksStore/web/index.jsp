<!DOCTYPE html>
<!--
    Document   : index
    Author     : Gheorghe Aurel Pacurar
    Copyright  : a-sti.ro
-->
<html>
    <head>
        <title>Electronic Books Store</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="./eBooksStore.css">        
    </head>
    <body>
        <h3> eBooks Store</h3>  
        <br>
        <form action="${pageContext.request.contextPath}/index" method="post">
            <table class="tablewithborder">
                <tr><td class="tdc"><input type="submit" class="citybutton" name="mainpage_newebook" value="Record new eBook"></td></tr>
                <tr><td class="tdc"><input type="submit" class="citybutton" name="mainpage_updateebook" value="Update an eBook"></td></tr>
                <tr><td class="tdc"><input type="submit" class="citybutton" name="mainpagedeleteebook" value="Delete an eBook"></td></tr>
                <tr><td class="tdc"><input type="submit" class="citybutton" name="mainpage_displayebooks" value="Display all eBooks" size="30"></td></tr>
                <tr><td class="tdc"><input type="submit" class="citybutton" name="mainpage_exit" value=" Exit from eBooks" size="40"></td></tr>
            </table>
            <br>
        </form>
    </body>
</html>