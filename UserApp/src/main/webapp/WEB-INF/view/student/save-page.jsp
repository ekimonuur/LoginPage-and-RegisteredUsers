<%--
  Created by IntelliJ IDEA.
  User: burak
  Date: 01-Jan-21
  Time: 6:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <title>Congratulations</title></head>
<body>

<div class="container" style="width: 36rem;">
    <div class="card-body">
        <h3 class="card-title">User registration successfully completed</h3>
        <p class="card-text text-center">Congratulations!</p>
    </div>
    <div>
        <ul class="list-group">
            <li class="list-group-item d-flex justify-content-between active align-items-center">
                ID:
                <span class="badge badge-primary badge-pill "> ${kisiler.id} </span>
            </li>
            <li class="list-group-item d-flex justify-content-between active align-items-center">
                USERNAME:
                <span class="badge badge-primary badge-pill"> ${kisiler.userName} </span>
            </li>
            <li class="list-group-item d-flex justify-content-between active align-items-center">
                DISPLAYNAME:
                <span class="badge badge-primary badge-pill">${kisiler.displayName}</span>
            </li>
            <li class="list-group-item d-flex justify-content-between active align-items-center">
                PHONE:
                <span class="badge badge-primary badge-pill">${kisiler.phone}</span>
            </li>
            <li class="list-group-item d-flex justify-content-between active align-items-center">
                E-mail:
                <span class="badge badge-primary badge-pill">${kisiler.eMail}</span>
            </li>

        </ul>
    </div>
</div>


</body>
</html>
