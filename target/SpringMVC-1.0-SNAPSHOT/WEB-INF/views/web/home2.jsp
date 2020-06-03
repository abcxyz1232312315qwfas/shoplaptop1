<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/15/2020
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<!-- Start Slider -->
<div id="slides-shop" class="cover-slides">
    <ul class="slides-container">
        <li class="text-left">

            <img src="<c:url value='/template/web/images/aec-overview-banner-1920x1000.jpg'/>" alt="">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="m-b-20"><strong>Welcome To <br> Thewayshop</strong></h1>
                        <p class="m-b-40">Máy tính chất lượng<br>Giá cả hợp lý</p>
                        <p><a class="btn hvr-hover" href="#">Shop New</a></p>
                    </div>
                </div>
            </div>
        </li>
        <li class="text-center">
            <img src="<c:url value='/template/web/images/laptop-desk-technology-corporate-business-statistic-45505-pxhere.com-1-1920x1000.jpg'/>"
                 alt="">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="m-b-20"><strong>Welcome To <br> Thewayshop</strong></h1>
                        <p class="m-b-40">Máy tính chất lượng<br>Giá cả hợp lý</p>
                        <p><a class="btn hvr-hover" href="#">Shop New</a></p>
                    </div>
                </div>
            </div>
        </li>
        <li class="text-right">
            <img src="<c:url value='/template/web/images/unnamed.jpg'/>" alt="">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="m-b-20"><strong>Welcome To <br> Thewayshop</strong></h1>
                        <p class="m-b-40">Máy tính chất lượng<br>Giá cả hợp lý</p>
                        <p><a class="btn hvr-hover" href="#">Shop New</a></p>
                    </div>
                </div>
            </div>
        </li>
    </ul>
    <div class="slides-navigation">
        <a href="#" class="next"><i class="fa fa-angle-right" aria-hidden="true"></i></a>
        <a href="#" class="prev"><i class="fa fa-angle-left" aria-hidden="true"></i></a>
    </div>
</div>
<!-- End Slider -->

<!-- Start Categories  -->
<div class="categories-shop">
    <div class="container">
        <div class="row">
            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <div class="shop-cat-box">
                    <img class="img-fluid" src="<c:url value='/template/web/images/dell.webp'/>" alt=""/>
                    <a class="btn hvr-hover" href="#">Dell</a>
                </div>
                <div class="shop-cat-box">
                    <img class="img-fluid" src="<c:url value='/template/web/images/asus.jpg'/>" alt=""/>
                    <a class="btn hvr-hover" href="#">Asus</a>
                </div>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <div class="shop-cat-box">
                    <img class="img-fluid" src="<c:url value='/template/web/images/273x273.jpg'/>" alt=""/>
                    <a class="btn hvr-hover" href="#">Mac</a>
                </div>
                <div class="shop-cat-box">
                    <img class="img-fluid" src="<c:url value='/template/web/images/lenovo.jpg'/>" alt=""/>
                    <a class="btn hvr-hover" href="#">Lenovo</a>
                </div>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                <div class="shop-cat-box">
                    <img class="img-fluid" src="<c:url value='/template/web/images/hp.jpg'/>" alt=""/>
                    <a class="btn hvr-hover" href="#">HP</a>
                </div>
                <div class="shop-cat-box">
                    <img class="img-fluid" src="<c:url value='/template/web/images/msi%20(1).jpg'/>" alt=""/>
                    <a class="btn hvr-hover" href="#">MSI</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Categories -->

<!-- Start Products  -->
<div class="products-box">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="title-all text-center">
                    <h1>Featured Products</h1>
                    <p>Death is like the wind, always by my side.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="special-menu text-center">
                    <div class="button-group filter-button-group">
                        <button class="active" data-filter="*">All</button>
                        <button data-filter=".top-featured">Top featured</button>
                        <button data-filter=".best-seller">Best seller</button>
                    </div>
                </div>
            </div>
        </div>

        <div class="row special-list">
        <c:forEach var="item" items="${model.listResult}">
            <div class="col-lg-3 col-md-6 special-grid top-featured">
                <div class="products-single fix">
                    <div class="box-img-hover">
                        <div class="type-lb">
                            <p class="new">New</p>
                        </div>
                        <img src="<c:url value='${item.picture}'/>" class="img-fluid" alt="Image">
                        <div class="mask-icon">
                            <ul>
                                <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i
                                        class="fas fa-eye"></i></a></li>
                                <li><a href="#" data-toggle="tooltip" data-placement="right" title="Compare"><i
                                        class="fas fa-sync-alt"></i></a></li>
                                <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i
                                        class="far fa-heart"></i></a></li>
                            </ul>
                            <a class="cart" href="#">Add to Cart</a>
                        </div>
                    </div>
                    <div class="why-text">
                        <h4>${item.name}</h4>
                        <h5>${item.price}</h5>
                    </div>
                </div>
            </div>
        </c:forEach>
        <c:forEach var="item" items="${model2.listResult}">
            <div class="col-lg-3 col-md-6 special-grid best-seller">
                <div class="products-single fix">
                    <div class="box-img-hover">
                        <div class="type-lb">
                            <p class="sale">Sale</p>
                        </div>
                        <img src="<c:url value='${item.picture}'/>" class="img-fluid" alt="Image">
                        <div class="mask-icon">
                            <ul>
                                <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i
                                        class="fas fa-eye"></i></a></li>
                                <li><a href="#" data-toggle="tooltip" data-placement="right" title="Compare"><i
                                        class="fas fa-sync-alt"></i></a></li>
                                <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i
                                        class="far fa-heart"></i></a></li>
                            </ul>
                            <a class="cart" href="#">Add to Cart</a>
                        </div>
                    </div>
                    <div class="why-text">
                        <h4>${item.name}</h4>
                        <h5>${item.price}</h5>
                    </div>
                </div>
            </div>
        </c:forEach>
        </div>
    </div>
</div>
<!-- End Products  -->

<!-- Start Blog  -->
<div class="latest-blog">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="title-all text-center">
                    <h1>Latest Blog</h1>
                    <p>Nơi chia sẻ và phát triển kiến thức </p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 col-lg-4 col-xl-4">
                <div class="blog-box">
                    <div class="blog-img">

                        <img class="img-fluid" src="<c:url value='/template/web/images/payment-icon/blog1.png'/>"
                             alt=""/>
                    </div>
                    <div class="blog-content">
                        <div class="title-blog">
                            <h3>Lập trình cuộc sống - Chỉ là blog của một thằng coder</h3>
                            <p>Trong bài viết này chúng ta sẽ tổng hợp tất tần tật những thứ chúng ta sẽ phải học để trở
                                thành fullstack web dev với ngôn ngữ java</p>
                        </div>
                        <ul class="option-blog">
                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Likes"><i
                                    class="far fa-heart"></i></a></li>
                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Views"><i
                                    class="fas fa-eye"></i></a></li>
                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Comments"><i
                                    class="far fa-comments"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-md-6 col-lg-4 col-xl-4">
                <div class="blog-box">
                    <div class="blog-img">
                        <img class="img-fluid" src="<c:url value='/template/web/images/payment-icon/blog2.jpg'/>"
                             alt=""/>
                    </div>
                    <div class="blog-content">
                        <div class="title-blog">
                            <h3>10 cách tiết kiệm thời gian giúp bạn tăng chất lượng sống</h3>
                            <p>Người ta thường nói rằng: “Thời gian là vàng là bạc”, song không phải ai cũng có thể tận
                                dụng thời gian một cách hiệu quả. Vậy bạn nên làm gì để sử dụng hợp lý và tránh lãng phí
                                nguồn tài nguyên quý giá nhưng hữu hạn này đây?</p>
                        </div>
                        <ul class="option-blog">
                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Likes"><i
                                    class="far fa-heart"></i></a></li>
                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Views"><i
                                    class="fas fa-eye"></i></a></li>
                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Comments"><i
                                    class="far fa-comments"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-md-6 col-lg-4 col-xl-4">
                <div class="blog-box">
                    <div class="blog-img">
                        <img class="img-fluid" src="<c:url value='/template/web/images/payment-icon/blog3.jpg'/>"
                             alt=""/>
                    </div>
                    <div class="blog-content">
                        <div class="title-blog">
                            <h3>Luôn tập trung cao độ khi làm việc</h3>
                            <p>Bạn nên cố gắng tập trung vào nhiệm vụ nào đang làm và hoàn thành trước khi bạn chuyển
                                sang một việc khác để tiết kiệm thời gian trong cuộc sống hàng ngày.</p>
                        </div>
                        <ul class="option-blog">
                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Likes"><i
                                    class="far fa-heart"></i></a></li>
                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Views"><i
                                    class="fas fa-eye"></i></a></li>
                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Comments"><i
                                    class="far fa-comments"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Blog  -->


<!-- Start Instagram Feed  -->
<div class="instagram-box">
    <div class="main-instagram owl-carousel owl-theme">
        <div class="item">
            <div class="ins-inner-box">

                <img src=" <c:url value='/template/web/images/instagram-img-01.jpg'/>" alt=""/>
                <div class="hov-in">
                    <a href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="ins-inner-box">
                <img src=" <c:url value='/template/web/images/instagram-img-01.jpg'/>" alt=""/>
                <div class="hov-in">
                    <a href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="ins-inner-box">
                <img src=" <c:url value='/template/web/images/instagram-img-01.jpg'/>" alt=""/>
                <div class="hov-in">
                    <a href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="ins-inner-box">
                <img src=" <c:url value='/template/web/images/instagram-img-01.jpg'/>" alt=""/>
                <div class="hov-in">
                    <a href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="ins-inner-box">
                <img src=" <c:url value='/template/web/images/instagram-img-01.jpg'/>" alt=""/>
                <div class="hov-in">
                    <a href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="ins-inner-box">
                <img src="images/instagram-img-06.jpg" alt=""/>
                <div class="hov-in">
                    <a href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="ins-inner-box">
                <img src="images/instagram-img-07.jpg" alt=""/>
                <div class="hov-in">
                    <a href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="ins-inner-box">
                <img src="images/instagram-img-08.jpg" alt=""/>
                <div class="hov-in">
                    <a href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="ins-inner-box">
                <img src="images/instagram-img-09.jpg" alt=""/>
                <div class="hov-in">
                    <a href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="ins-inner-box">
                <img src="images/instagram-img-05.jpg" alt=""/>
                <div class="hov-in">
                    <a href="#"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Instagram Feed  -->


<a href="#" id="back-to-top" title="Back to top" style="display: none;">&uarr;</a>
</body>
</html>
