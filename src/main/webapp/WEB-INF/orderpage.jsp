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

        <form action="FrontController" method="post">
            <h1>BMI beregneren</h1>

            <input type="hidden" name="target" value="added"/>

            <div class="mb-3">
                <label for="height" class="form-label">Indtast din højde i cm</label>
                <input type="text" class="form-control" id="height" value="${sessionScope.height}" name="height" placeholder="højde">
            </div>

            <div class="mb-3">
                <label for="weight" class="form-label">Indtast din vægt</label>
                <input type="text" class="form-control" id="weight" name="weight" value="${sessionScope.weight}" placeholder="vægt">
            </div>

            <div class="mb-3">
                <label for="bmi" class="form-label">Resultat: </label>
                <label id="bmi" class="form-label"> ${sessionScope.bmiresult} </label>
            </div>


            <div class="text-center">
                <button type="submit" class="btn btn-primary">Beregn BMI</button>
            </div>
        </form>

    </jsp:body>
</t:genericpage>