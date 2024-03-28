<%-- 
    Document   : nomina.jsp
    Created on : 28/03/2024, 12:55:39 a. m.
    Author     : ANDRES AVILA
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Información de Nómina</title>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
        td{
            background-color: white;
        }
        h1,h2,th,td{
            font-family: Courier, monospace;
        }
    </style>
</head>
<body style="background-color: linen;">
    <h1 style="text-align: center; text-transform: uppercase;">hola ${nombre} !</h1>
    <h2 style="text-align: center">SU INFORMACION DE NOMINA</h2>
    <table>
        <tr>
            <th>Identificación</th>
            <td>${identificacion}</td>
        </tr>
        <tr>
            <th>Sueldo Base</th>
            <td>${sueldo}</td>
        </tr>
        <tr>
            <th>Días Trabajados</th>
            <td>${cDias}</td>
        </tr>
        <tr>
            <th>pension cobrada</th>
            <td>${pension}</td>
        </tr>
         <tr>
            <th>salud cobrada</th>
            <td>${salud}</td>
        </tr>
         <tr>
            <th>auxilio de transporte</th>
            <td>${aux}</td>
        </tr>
        <tr>
            <th>Sueldo Total</th>
            <td>${total}</td>
        </tr>
    </table>
</body>
</html>
