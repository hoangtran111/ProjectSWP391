<%-- 
    Document   : editbook
    Created on : Jul 21, 2022, 9:57:19 PM
    Author     : Hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
       
        <style>
            img{
                width: 200px;
                height: 120px;
            }
        </style>
    <body>
        
                    <form action="editbook2" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">edit Book</h4>

                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label>bookID</label>
                                <input value="${b.bookID}" name="bookid" type="text" class="form-control" readonly required>
                            </div>
                            <div class="form-group">
                                <label>bookName</label>
                                <input value=" ${b.bookname}" name="name" type="text" class="form-control" required>
                               
                            </div>
                            <div class="form-group">
                                <label>Image</label>
                                <input value=" ${b.image}" name="image" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Authorid</label>
                                <input value=" ${b.authorID}" name="auid" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>cateoid</label>
                             <input value=" ${b.categoryID}" name="cateo" type="text" class="form-control" required>
                            </div>
                            
                            <div class="form-group">
                                <label>Review</label>
                                <textarea name="review" type="text" class="form-control" required >${b.review}</textarea>
                                
                            </div>
                            

                        </div>
                        <div >
                            
                            <input type="submit" class="btn btn-success" value="Edit">
                        </div>
                                                   
                    </form>
        
    </body>
</html>
