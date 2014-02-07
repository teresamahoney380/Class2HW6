<%-- 
    Document   : MainCalculator
    Created on : Feb 7, 2014, 1:39:37 PM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Geometry Calculator</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <div>
            <h1>Some Geometry Calculations</h1>
            <p id="answer">
                ${shapeMsg}${textArea} 
            </p>
            <h2>Rectangle Area</h2>
            <form id="form1" name="form1" method="POST" action="calculator?shape=rectangle">
                Enter a length: <input type="text" name="tlength" placeholder="e.g.,3.00">
                Enter a width: <input type="text" name="twidth" placeholder="e.g.,4.25">
                <center>
                    <input id="calcArea" name="calcArea" type="submit" value="Calculate Area">
                </center>
            </form>
            <h2>Circle Area</h2>
            <form id="form1" name="form1" method="POST" action="calculator?shape=circle">
                Enter a radius: <input type="text" name="tradius" placeholder="e.g.,5.23">
                <center>
                    <input id="calcArea" name="calcArea" type="submit" value="Calculate Area">
                </center>
            </form>
            <h2>Determine Side of Triangle</h2>
            <form id="form1" name="form1" method="POST" action="calculator?shape=triangle">
                Enter a side: <input type="text" name="tsideA" placeholder="e.g.,5.23">
                Enter a second side: <input type="text" name="tsideB" placeholder="e.g.,5.23">
                <center>
                    <input id="calcArea" name="calcArea" type="submit" value="Calculate Third Side">
                </center>
            </form>
        </div>
    </body>
</html>

