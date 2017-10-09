<%-- 
    Document   : agregarUsuario
    Created on : 02-oct-2017, 14:52:16
    Author     : hectorsama
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" type="text/css" href="<c:url value="/css/iniciocss.css"/> ">
        <title>Home</title>
    </head>
<form action="/mavenproject1/login" method="POST">
    <input type="text" name="nickname" value="Name..." onclick="this.value=''"/><br/>  
    <input type="text" name="correo"  value="Email ID..." onclick="this.value=''"/><br/>  
    <input type="password" name="contrasenia"  value="Password..." onclick="this.value=''"/><br/>  
    <button> Registatre </button>  
    </form>  
</html>