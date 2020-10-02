<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/taglib/taglibs.jsp" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/webResources/css/movie.css"/>
</head>
<body>
<div class="container-fluid">
    <h1>${tempMovie.name}</h1>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <table class="table">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">Name</th>
                        <th scope="col">Year</th>
                        <th scope="col">Country</th>
                        <th scope="col">Language</th>
                        <th scope="col">Film Company</th>
                        <th scope="col">Genre</th>
                        <th scope="col"></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${movie}" var="tempMovie">
                    <tr>
                        <td class="bnt">${tempMovie.name}</td>
                        <td class="bnt">${tempMovie.year}</td>
                        <td class="bnt">${tempMovie.country}</td>
                        <td class="bnt">${tempMovie.language}</td>
                        <td class="bnt">${tempMovie.filmCompany}</td>
                        <td class="bnt">${tempMovie.genre}</td>

                        <td class="bnt">
                            <a class="btn btn-info" href="${pageContext.request.contextPath}/movie/${tempMovie.id}" role="button">Go to</a>
                            <a class="btn btn-danger" href="#" role="button">Delete</a>
                        </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
</body>
</html>
