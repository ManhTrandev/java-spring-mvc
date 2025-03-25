
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
    <tr>
        <th>1</th>
        <th>Mack</th>
        <th>Eot</th>
<td>
    <button class="btn btn-success">View</button>
    <button class="btn btn-warning mx-2">Update</button>
    <button class="btn btn-danger">Delete</button>

</td>
    </tr>
    <tr>
        <th>2</th>
        <th>Kack</th>
        <th>LeoEot</th>
        <td>
            <button class="btn btn-success">View</button>
            <button class="btn btn-warning mx-2">Update</button>
            <button class="btn btn-danger">Delete</button>
        
        </td>
    </tr>
</tbody>
</table>
    </div>
    </div>
    
</body>
</html>