<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
        *{
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
        
        
        .main h1{
            text-align: center;
            padding-top: 100px;
            color: rgb(51, 51, 251);
        }
        
       .main{
        height: 85vh;
        background-color:azure;
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
       table{
        margin: auto;
        margin-top: 80px;
        
        /* width: 80vw; */
       }
       table,tr,th{
        border: 2px solid white;
        border-collapse: collapse;
        
       }

       th,td{
        background-color: #96D4D4;
        color: white;
        padding: 20px 10px;
        width: 20vw; 
       }

       form{
       margin-top: 60px;
        
       }
       .searchbox{
       margin-left: 25vw;
        width: 50vw;
        padding: 10px 20px;
        border-radius: 40px;
        /* text-align: center; */
       }
       .btn{
        width: 6vw;
        padding:5px 0px;
        margin-left: 47vw;
        margin-top: 5vh;
        background-color: white;
        border-radius: 10px;
        font-size: 15px;
        color: white;
        background-color: blue;
        border: 1px solid blue;
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
        <img src="/images/logo.svg" alt="product" width="40px" height="40px"><span>Product Management</span>
    </div>
        <ul>
            <li><a href="/">Home</a></li>
            <li><a href="about">About us</a></li>
            <li><a href="contact">Contact</a></li>
        </ul>
</div>
<div class="main">
    <h1>Search a Product</h1>
    <form action="pro_details" method="get">
        <input class="searchbox" type="text" name="name" placeholder="Enter product name here"><br><br>
        <input class="btn" type="submit" value="search">
    </form>
</div>
    
   <footer>
        Copyright | Product Management | All rights reserved
   </footer> 
        
        
        
    
</body>
</html>