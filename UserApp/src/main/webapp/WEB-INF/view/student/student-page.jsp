<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="width" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">


<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <header class="card-header">
                    <h4 class="card-title mt-2">New User</h4>
                </header>
                <article class="card-body">
                        <f:form action="save" modelAttribute="kisiler">
                        <div class="form-row">
                            <div class="col form-group">
                                <label>Username </label>
                                <f:input type="text" path="userName"/>
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col form-group">
                                <label>Display name</label>
                                <f:input type="text" path="displayName"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Email address</label>
                            <f:input type="email" path="eMail"/>
                            <small class="form-text text-muted">We'll never share your email with anyone else.</small>
                        </div>


                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label>User Roles</label>
                                <f:select id="inputState" path="userRole">
                                    <f:option value="" label=""> Select user roles...</f:option>
                                    <f:option value="Guest" label="Guest">Guest</f:option>
                                    <f:option value="Admin" label="Admin">Admin</f:option>
                                    <f:option value="Super Admin" label="Super Admin" selected="">Super Admin</f:option>
                                </f:select>


                            </div>
                        </div>
                        <div class="form-group">
                            <f:button name="save" type="submit" class="btn btn-primary btn-block"> Save User  </f:button>

                        </div>
                    </f:form>
                </article>
            </div>
        </div>

    </div>


</div>