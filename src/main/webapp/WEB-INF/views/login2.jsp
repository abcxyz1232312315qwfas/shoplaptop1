<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/15/2020
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <form class="login100-form validate-form" action="/j_spring_security_check" id="formLogin" method="post">
                <c:if test="${param.incorrectAccount != null}">
                    <div class="alert alert-danger">
                        Username or password is incorrect
                    </div>
                </c:if>
                <c:if test="${param.accessDenied != null}">
                    <div class="alert alert-danger">
                        you Not authorize
                    </div>
                </c:if>


					<span class="login100-form-title p-b-34">
						Account Login
					</span>
                <div class="wrap-input100 rs1-wrap-input100 validate-input m-b-20" data-validate="Type user name">
                    <input id="first-name" class="input100" type="text" id="userName" name="j_username" placeholder="User name">
                    <span class="focus-input100"></span>
                </div>
                <div class="wrap-input100 rs2-wrap-input100 validate-input m-b-20" data-validate="Type password">
                    <input class="input100" type="password" id="password" name="j_password" placeholder="Password">
                    <span class="focus-input100"></span>
                </div>

                <div class="container-login100-form-btn">
                    <button class="login100-form-btn">
                        Sign in
                    </button>
                </div>

                <div class="w-full text-center p-t-27 p-b-239">
						<span class="txt1">
							Forgot
						</span>

                    <a href="#" class="txt2">
                        User name / password?
                    </a>
                </div>

                <div class="w-full text-center">
                    <a href="#" class="txt3">
                        Sign Up
                    </a>
                </div>
            </form>

            <div class="login100-more" style="background-image: url('<c:url value='/template/login/images/bg-01.jpg' />');"></div>
        </div>
    </div>
</div>

<div id="dropDownSelect1"></div>
</body>
</html>
