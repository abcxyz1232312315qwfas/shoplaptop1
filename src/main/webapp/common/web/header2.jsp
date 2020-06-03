<%@ page import="com.laptrinhjavaweb.util.SecurityUtils" %>
<!-- Start Main Top -->
<div class="main-top">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                <div class="text-slid-box">
                    <div id="offer-box" class="carouselTicker">
                        <ul class="offer-box">
                            <li>
                                <i class="fab fa-opencart"></i> <%=SecurityUtils.getPrincipal().getFullName()%>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                <div class="right-phone-box">
                    <p>Call US :- <a href="#">0987120000</a></p>
                </div>
                <div class="our-link">
                    <ul>
                        <li><a href="/myaccount">My Account</a></li>
                        <li><a href="<c:url value='/thoat'/>">Log out</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Main Top -->
