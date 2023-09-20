<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
       
        *{
            margin: 0;
            padding: 0;
            background-color: azure;
            font-family:Georgia, Times, 'Times New Roman', serif;
        }
        .container{
            width: 60vw;
            height: 60vh;
            background-color: black;
            margin: auto;
            margin-top: 20vh;
            color: wheat;
            padding: 30px 20px;
            box-sizing: border-box;
            background-color: azure;

        }
        h1{
            font-size: 150px;
            text-align: center;
            color: rgb(48, 24, 129);
        }

        .container p{
            margin-top: 30px;
            text-align: center;
            color: black;
        }
        .message{
            font-size:20px ;
        }
        a{
          margin-left: 372px;  
          text-decoration: none;
          border: 2px solid rgb(4, 4, 253);
          padding: 10px;
          color: white;
          border-radius: 20px;
          background-color: rgb(4, 4, 253);
          font-size: 13px;
          font-weight: bold;
        }

    </style>
</head>
<body>
    <div class="container color">
        <h1>Oops!</h1>
        <p class="message"><b>${exception.getMessage()}</b></p>
        <p>We have encountered an error.</p><br><br>
        <a href="home">GO TO HOMEPAGE</a>
    </div>
</body>
</html>