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
            <h1>Odre tilføjet til kurv</h1>


    </jsp:body>
</t:genericpage>