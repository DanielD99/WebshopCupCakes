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

                    <br>

                    <select class="form-select" aria-label="Default select example">
                        <option selected>Vælg bund</option>
                        <c:forEach items="${sessionScope.bunde}" var="bund">
                        <option value="${bund.id}" class="dropdown-item" href="#">${bund.type}. ${bund.price}kr
                    </c:forEach> </option>

                    </select>

                    <br/>

                    <select class="form-select" aria-label="Default select example">
                        <option selected>Vælg topping</option>
                        <option value="1">topping 1</option>
                        <option value="2">topping 2</option>
                        <option value="3">topping 3</option>
                    </select>


<br>

        bundetest:                ${sessionScope.bunde.get(2).type}
                    <br>
        toppingstest:             ${sessionScope.toppings.get(2).type}


<%--                    <div class="dropdown">--%>
<%--                        <button class="btn btn-secondary dropdown-toggle" type="button" id="topping"--%>
<%--                                data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--%>
<%--                            Vælg topping--%>
<%--                        </button>--%>
<%--                        <div class="dropdown-menu" aria-labelledby="topping">--%>
<%--                            <c:forEach items="${sessionScope.toppings}" var="topping">--%>
<%--                                <a class="dropdown-item" href="#">${topping.type}. ${topping.price}kr</a>--%>
<%--                            </c:forEach>--%>
<%--                        </div>--%>
<%--                    </div>--%>



                    <br>
                    <br/>

                    <a>din pris: </a>

                    <br>
                    <br/>

                    <select class="form-select" aria-label="Default select example">
                        <option selected>Vælg afhentningstidspunkt</option>
                        <option value="1">kl 10</option>
                        <option value="2">kl 11</option>
                        <option value="3">kl 12</option>
                        <option value="1">kl 13</option>
                        <option value="2">kl 14</option>
                        <option value="3">kl 15</option>
                        <option value="1">kl 16</option>
                        <option value="2">kl 17</option>
                        <option value="3">kl 18</option>
                    </select>
                    <br>
                    <br/>

                    <div class="text-center">
                        <button type="submit" class="btn btn-primary">Tilføj til kurv</button>

                    </div>
            </form>

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