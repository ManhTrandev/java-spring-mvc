
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>List User</title>

<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

</head>
<body>
    <div class="container mt-5">
    <div class="row">
    <div class="col-12 mx-auto">
        <div class="d-flex justify-content-between">
            <h3>Table user</h3>
            <a href="/admin/user/create" class="btn btn-primary">Create new user</a>
            <!-- <button type="button" class="btn btn-primary">Create new user</button> -->
             </div>
        <hr/>
<table class="table table-bordered table-hover">
<thread>
    <tr>
        <th>ID</th>
        <th>Email</th>
        <th>Full Name</th>
        <th>Action</th>

    </tr>
</thread>
<tbody>
    <c:forEach var="user" items="${user1}">
<tr>
    <th>${user.id}</th>
    <th>${user.email}</th>
    <th>${user.fullName}</th>
    <td>
        <a
       href ="/admin/user/${user.id}" class="btn btn-success">View</a>
        <button class="btn btn-warning mx-2">Update</button>
        <button class="btn btn-danger">Delete</button>
    
    </td>
</tr>
</c:forEach>
    
</tbody>
</table>
    </div>
    </div>
    
</body>
</html>