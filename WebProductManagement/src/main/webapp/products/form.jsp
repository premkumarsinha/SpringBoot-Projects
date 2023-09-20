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
            padding-top: 40px;
            color: rgb(51, 51, 251);
        }
        
       .main{
        height: 85vh;
        background-color:azure;
       }

       .form-container{
        height: 60vh;
        width: 30vw;
        border: 2px solid black;
        margin-top: 30px;
        margin-left: 35vw; 
        display: flex;
        justify-content: center;
        align-items: center;
        border-radius: 40px;
        background-color: rgb(243, 201, 201);
       }

       #btn{
        width: 5vw;
        position: relative;
        left: 80px;
        border-radius: 10px;
        padding: 5px 10px;
        background-color: rgb(67, 225, 67);
        color: white;
        font-weight: bold;
        font-size: 15px;
       }

       footer{
        height: 6vh;
        background-color: black;
        color: white;
        text-align: center;
        padding-top: 15px;
       }
       .input{
        border-radius: 5px;
        padding: 5px;
        width: 15vw;
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
       a{
      text-decoration:none;
      color:white;
      } 
      
      .alert{
        margin: 20px 10px;
       }

       .alert p{
        text-align: center;
        border: 1px solid rgb(55, 148, 55);
        color: green;
        background-color: rgb(100, 244, 100);
        padding: 10px 0px;
        border-radius: 7px;
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
	<%	
		int value=(int)request.getAttribute("flag");
		if(value==1)
			{%>
				<div class="alert">
					<p>The record has been added successfully!</p>
				</div>
			<% }
	%>
    <h1> Add Products </h1>
    <div class="form-container">
        <form action="add" method="post">
            <label>Product Name :</label><br>
            <input type="text" class="input" name="name"><br><br>
            <label>Product Type :</label><br>
            <input type="text" class="input" name="type"><br><br>
            <label>Location :</label><br>
            <input type="text" class="input" name="place"><br><br>
            <label>Warranty Year :</label><br>
            <input type="text" class="input" name="warranty"><br><br><br><br>
            <input id="btn" type="submit" value="Submit">
        </form>
    </div>
</div>
    
   <footer>
        Copyright | Product Management | All rights reserved
   </footer> 
        
        
        
    
</body>
</html>