<%-- 
    Document   : create
    Created on : Oct 14, 2021, 11:28:58 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="css/stylecreate.css" rel="stylesheet" type="text/css"/>
          <link href="	https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="add" method="post">
       <div class="card">
    <div class="text-center">
        <h3>Create an account</h3> <span class="abt">Already have an account? <a href="login.jsp">Sign In</a></span>
    </div>
    <div class="form mt-3">
        <div class="inputbox"> <input type="text" class="form-control" placeholder="Username" name="user"> </div>
        <div class="input-group inputbox"> <input type="text" placeholder="ID" class="form-control" name="id"></div>
        <div class="inputbox"> <input type="text" class="form-control" placeholder="Password" name="pass"> </div>
        <div class="inputbox"> <input type="text" class="form-control" placeholder="NAME" name="name"> </div>
        <div> <input type="text" placeholder="ADMIN" class="form-control" readonly="0" name="admin"> </div>
        <div><a> nếu bạn có nhưng cuốn sách hay muốn đóng gúp thì có thể liên hệ: 0948268746(ADMin) </a> </div>
    </div>
   
            <div class="text-right"> <button>CREATE ACCOUNT</button> </div>
           
    <div class="mt-1">
       
    </div>
</div>
            </form>
    </body>
</html>
