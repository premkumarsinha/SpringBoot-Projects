<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>*{
        margin: 0;
        padding: 0;
        font-family: 'Poppins', sans-serif;
    }

    .navbar{
        display: flex;
        justify-content: space-between;
        height: 60px;
        background-color: black;
        color: white;
       
    }

    ul{
        margin-right: 10px;
    }

    .navbar ul li{
        display: inline-block;
        margin-top: 20px;
        margin-left: 25px;
        margin-right: 10px;
    }

    .main{
        height: 85vh;
        /* background-color:azure; */
        display: flex;
        justify-content:center;
        align-items: center;
        margin-left: 10vw;
        margin-right: 10vw;
       }

       footer{
        height: 6vh;
        background-color: black;
        color: white;
        text-align: center;
        padding-top: 15px;
       }
       
       .logo {
            
            margin-top: 10px;
            margin-left: 20px;
       }
       .logo span{
        margin-left: 4px;
        position: relative;
        bottom: 11px;
        font-size: 22px;
       }

       .container{
        width: 70vw;
        height: 60vh;
        background-color: rgb(209, 207, 207);
        box-sizing: border-box;
        padding: 20px 40px;
        border-radius: 10px;
        box-shadow: 0px 0px 5px 5px lightgray;
        border: 2px solid grey;
       }
       .container h2{
        text-align: center;
        margin-top: 30px;
       }
       .description{
        margin-top: 40px;
       }
        a{
      text-decoration:none;
      color:white;
      } 
    </style>
</head>
<body>
    <div class="navbar">
        <div class="logo">
            <img src="images/logo.svg" alt="product" width="40px" height="40px"><span>Product Management</span>
        </div>
            <ul>
                <li><a href="/">Home</a></li>
            	<li><a href="about">About us</a></li>
            	<li><a href="contact">Contact</a></li>
            </ul>
            
            
            
           
    </div>
    <div class="main">
        <div class="container">
            <h2>About Us</h2>
            <div class="description">
            <p>I am a Java FullStack developer, who aims to work in an environment that challenges my problem solving ability and logical thinking. I am 25 years old and has previously worked in Wipro as a BW/BI developer, also quite handy with BO development work.
            <br><br>
            </p>
            <p>Java has been my core skill from the very start and I have been building projects ever since I started learning Java. 
                I was trained as a J2EE developer in my initial days in Wipro, where I build a project with the help of my teammates which was for a banking domain. The website was designed to provide users with the ability to apply for loan and also carry various other bank related work. I worked mainly as a backend developer in that project writing all the business logic and the database end of it as well. Also during that I learned to work on front end as well. 
            </p>
            <br><br>
            <p>
                This project which is named as Product Management has been solely built by me from the frontend to backend to the database end. The project is aimed to help user organise his/her products within their confined residence. They can add new products, view all the products, as well as look for details of a particular product. In this project we have made use of Spring MVC for handling requests, used Spring Data JPA for working with the Database and we have used MySQL as our database.
            </p>
        </div>
        </div>
    </div>

    <footer>
        Copyright | Product Management | All rights reserved
   </footer>   
</body>
</html>