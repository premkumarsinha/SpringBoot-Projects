<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
       table,td,th{
        border: 2px solid white; 
        border-collapse: collapse;
        
       }
       th{
        border-collapse: collapse;
        color:white;
        padding: 20px 10px;
        width: 20vw;
        text-align:center; 
        background-color: grey;
        /* border-bottom:2px solid blue; */
        font-size: larger;
      
       }
        td{
        
        color: white;
        padding: 20px 10px;
        width: 20vw;
        text-align:center; 
        background-color: black;
        /* border-bottom:2px solid blue; */
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
    <h1>Product Details</h1>
    <table>
        <tbody>
            <tr>
                <th>Product Name</th>
                <td>${Product.getName()}</td>
            </tr>
            <tr>
                <th>Product Type</th>
                <td>${Product.getType()}</td>
            </tr>
            <tr>
                <th>Location</th>
                <td>${Product.getPlace()}</td>
            </tr>
            <tr>
                <th>Warranty</th>
                <td>${Product.getWarranty()}</td>
            </tr>
        </tbody>
    </table>
</div>
    
   <footer>
        Copyright | Product Management | All rights reserved
   </footer> 
        
        
        
    
</body>
</html>