<%-- 
    Document   : index.jsp
    Created on : 24/03/2024, 8:13:41 p. m.
    Author     : ANDRES AVILA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<style>
        .titulo{
            display: flex;
            justify-content: center;
            align-items: center;
            width: 300px;
            height: 90px;
            background-color: bisque;
        }
        div{
        display: flex;
        justify-content: center;
        align-items: center;
        }
        label,option,h1{
            font-family: Courier, monospace;
        }
</style>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SISTEMA DE NOMINA</title>
</head>
<body style="background-color: linen;">
   
    <div>
   <h1 style="text-align: center;" class="titulo">
    SISTEMA DE NOMINA
   </h1> 
    </div>
   <br>
   <form action="servletNomina" method="post">
    <div >
    <label>INGRESE SU IDENTIFICACION:  </label>
</br>
    <input type="text" name="id">
    </div>
       <br>
    <div >
    <label>INGRESE SU NOMBRE:  </label>
</br>
    <input type="text" name="nombre">
</div>
   </br>
<div>
    <label>SELECCIONE SU SALARIO ACTUAL:  </label>
</br>
    <select name="salario">
        <option value="">Seleccione su salario</option>
        <option value="300000">$3000.000</option>
        <option value="1300000">$1.300.000</option>
        <option value="1500000">$1.500.000</option>
        <option value="2000000">$2.000.000</option>
        <option value="2500000">$2.500.000</option> 
    </select>
</div>
    </br>
<div>
    <label>INGRESE LA CANTIDAD DE DIAS LABORADOS:</label>
</br>
    <input type="number" name="dias"  min="1" max="30"> 
</div>
</br>
<div>
    <input style="font-family: Courier, monospace;" type="reset" value="Borrar">
    <input style="font-family: Courier, monospace;" type="submit" value="Enviar">
</div>
   </form>
</body>
</html>