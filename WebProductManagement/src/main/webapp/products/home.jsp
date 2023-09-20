<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

        
        
       .main{
        height: 85vh;
        /* background-color:azure; */
        display: flex;
        justify-content:space-between;
        align-items: center;
        margin-left: 10vw;
        margin-right: 10vw;
       }

       
       .first, .second, .third{
        height: 50vh;
        width: 20vw;
        border-radius: 20px;
        box-shadow: 0px 0px 5px 5px lightgray;
       
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

    .first img,.second img,.third img  {
        width: 20vw;
        height: 22vh;
        border: 1px solid lightgrey;
        border-top-right-radius: 20px;
        border-top-left-radius: 20px;
       }
       .first a,.third a{
        position:relative ;
        left:90px;
        top:30px;
        font-size: 15px;
        /*color: white;*/
        padding: 10px;
        border-radius:30px;
        background-color:purple;
        /*text-decoration: none;*/
       }

        .second a{
            position: relative;
            left:75px;
            top:30px;
            font-size: 15px;
            /*color:white;*/
            padding: 10px;
            border-radius:30px;
            background-color:purple;
            /*text-decoration: none;*/
            
        }
        
        .first a:hover,.second a:hover,.third a:hover{
            cursor:pointer;
        }
        .first p,.second p,.third p{
           text-align: center;
            margin: 70px 30px;
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
        <div class="first">
            <img src="images/add.png" alt="add">
            <a href="product"><b>Add Product</b></a>
            <p>Provides you the option add a new product with related details like type of product, location of the product and its warranty.</p>
        </div>
        <div class="second">
            <img src="images/search.jpg" alt="search">
            <a href="search"><b>Search a Product</b></a>
            <p>You can look for a particular product and its related details by providing the name of the product that you are looking for.</p>
        </div>
        <div class="third">
            <img src="images/findall.png" alt="search">
            <a href="allProducts"><b>All Products</b></a>
            <p>Provides you the list of all your products and their related details together.</p>
        </div>
    </div>

    
   <footer>
        Copyright | Product Management | All rights reserved
   </footer> 
        
        
        
    
</body>
</html>