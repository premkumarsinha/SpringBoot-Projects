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

       .container{
        height: 60vh;
        width: 80vw;
        background-color: rgb(243 244 246);
        border-radius: 10px;
        box-shadow: 0px 0px 5px 5px lightgray;
        padding: 10px;
        box-sizing: border-box;
       }

       h2{
        text-align: center;
        font-size: 30px;
        margin-top: 50px;
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
       .photo{
        margin: auto;
        display: block;
        margin-top: 40px;
        border-radius: 80px;
        border: 2px solid black;
       }

       .icons{
        display:flex;
        justify-content: center;
        margin-top: 30px;
       }
       .icons img{
        width: 40px;
        height: 40px;
        padding: 20px
       }

       .icons img:hover{
        cursor: pointer;
        fill:purple;
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
            <h2>
                Feel free to contact me!
            </h2>
            <img class="photo" src="images/final_photo.png" alt="prem" width="150px" height="150px">
            <div class="icons">
                <a href="https://www.facebook.com/premkumar.sinha.90" target="_blank"><img src="images/facebook.png" alt="facebook"></a>
                <a href="https://www.instagram.com/singham_pk/" target="_blank"><img src="images/instagram.png" alt="instagram"></a>
            </div>
        </div>
    </div>

    <footer>
        Copyright | Product Management | All rights reserved
   </footer>
</body>
</html>