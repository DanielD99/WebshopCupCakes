<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>

    <jsp:attribute name="header">
   <%--     <%@include file="header.inc"%>

              <img src="images/olskercupcakes.png">--%>

        Home






    </jsp:attribute>

    <jsp:attribute name="footer">
        <c:set var="addHomeLink" value="${false}" scope="request"/>


    </jsp:attribute>

    <jsp:body>

        <div class="row">
        <div class="col-md-4"></div>

        <div class="col-md-4">

        <div class="container">

        <%--        <img src="images/olskercupcakes.png" class="img-fluid mb-4"/>--%>

        <div>
        <div>

            <img src="../images/olskercupcakes.png" class="img-fluid mb-4"/>

            <h2>Velkommen ombord</h2>


            <form action="added" method="post">

                <div style="margin-top: 3em;margin-bottom: 3em;">
                    <h4>Øens bedste cupcakes, vælg og bestil her</h4>

                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="bund"
                                data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Vælg bund
                        </button>
                        <div class="dropdown-menu" aria-labelledby="bund">
                            <c:forEach items="${sessionScope.bunde}" var="bund">
                                <a class="dropdown-item" href="#"> ${bund.type}</a>
                            </c:forEach>
                        </div>
                    </div>

                    <br>
                    <br/>

                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="topping"
                                data-bs-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                            Vælg topping
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a>class="dropdown">Action</a>
                            <a>class="dropdown">Another action</a>

                        </div>
                    </div>

                    <br>
                    <br/>


                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="tidspunkt"
                                data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Vælg afhentningstidspunkt
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            class="dropdown">Action
                            class="dropdown">Another action

                        </div>
                    </div>
                    <br>
                    <br/>

                    <div class="text-center">
                        <button type="submit" class="btn btn-primary">Tilføj til kurv</button>

                    </div>


                </div>

                <c:if test="${sessionScope.role == 'employee' }">
                <p style="font-size: larger">This is what you can do,
                    since your are logged in as an employee</p>
                <p><a href="fc/employeepage">Employee Page</a>
                    </c:if>

                    <c:if test="${sessionScope.role == 'customer' }">
                <p style="font-size: larger">This is what you can do, since your
                    are logged in as a customer</p>
                <p><a href="fc/customerpage">Customer Page</a>
                    </c:if>

        </div>
    </jsp:body>
</t:genericpage>