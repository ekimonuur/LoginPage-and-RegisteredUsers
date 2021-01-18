<%--
  Created by IntelliJ IDEA.
  User: burak
  Date: 31-Dec-20
  Time: 12:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
    <style>
    .section2_btn {
        border-radius: 35px;
        padding: 10px 12px;
        width: 10%;
        height: 52px;
        color: #fff;
        font-size: 16px;
        margin-bottom: 42px;
        -webkit-transition: all 0.5s;
        -o-transition: all 0.5s;
        -ms-transition: all 0.5s;
        -moz-transition: all 0.5s;
        transition: all 0.5s
    }

    .btn2 {
        background: #4285f4;
        border: 1px solid #4285f4;
        left: 9px;
    }
    .btn3 {
        background: #4285f4;
        border: 1px solid #4285f4;
        left: 9px;
    }</style>
</head>

<body>


<table>

    <tbody>
    <div class="col-lg-12 col-md-12 col-xs-12 col-sm-12">
        <div class="col-lg-2 col-md-2 col-xs-12 col-sm-6"> <a href="student/student-page" class="section2_btn btn2" type="button">+New User</a> </div>
    </div>
    <div class="container py-5">
        <header class="text-center text-white">
            <p> </p>
        </header>
        <div class="row py-5">
            <div class="col-lg-10 mx-auto">
                <div class="card rounded shadow border-0">
                    <div class="card-body p-5 bg-white rounded">
                        <div class="table-responsive">
                            <table id="example" style="width:100%" class="table table-striped table-bordered">
                                <thead class="section2_btn btn3">
                                <tr>
                                    <th>Id</th>
                                    <th>User Name</th>
                                    <th>E-Mail </th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <c:forEach items="${kisiler}" var="kisiler">
                                <tr>
                                    <td>${kisiler.id}</td>
                                    <td>${kisiler.userName}</td>
                                    <td>${kisiler.eMail}</td>

                                </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</table>
</body>
</html>
