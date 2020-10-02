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
                <tr>
                    <td class="bnt">${tempMovie.name}</td>
                    <td class="bnt">${tempMovie.year}</td>
                    <td class="bnt">${tempMovie.country}</td>
                    <td class="bnt">${tempMovie.language}</td>
                    <td class="bnt">${tempMovie.filmCompany}</td>
                    <td class="bnt">${tempMovie.genre}</td>

                    <td class="bnt">
                        <a class="btn btn-info" href="${pageContext.request.contextPath}/movie/update/movie/${tempMovie.id}" role="button">Update</a>
                        <a class="btn btn-danger" href="#" role="button">Delete</a>
                    </td>
                </tr>
                </tbody>

            </table>
            <div class="row ">
                <div class="col">
                    <table class="table">
                        <thead class="thead-dark">
                        <tr>
                            <h3>Movie Personal</h3>
                        </tr>
                        </thead>
                        <tbody>
                       <tr>
                               <td>Stage Director</td>
                               <td>${tempMovie.moviePersonal.stageDirector}</td>
                       </tr>
                       <tr>
                               <td>Producer</td>
                               <td>${tempMovie.moviePersonal.producer}</td>
                       </tr>
                       <tr>
                           <td>Author script</td>
                           <td>${tempMovie.moviePersonal.authorScript}</td>
                       </tr>
                       <tr>
                           <td>Main Cast</td>
                           <td>${tempMovie.moviePersonal.mainCast}</td>
                        </tr>
                        <tr>
                            <td>Operator</td>
                            <td>${tempMovie.moviePersonal.operator}</td>
                        </tr>
                        <tr>
                            <td>Composer</td>
                            <td>${tempMovie.moviePersonal.composer}</td>
                       </tr>
                        <tr>
                            <td class="bnt">
                                <a class="btn btn-info" href="${pageContext.request.contextPath}/movie/update/moviePersonal/${tempMovie.moviePersonal.id}/${tempMovie.name}/${tempMovie.id}" role="button">Update</a>
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="col">
                    <table class="table">
                        <thead class="thead-dark">
                        <tr>
                            <h3>Movie Description</h3>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>Movie Poster</td>
                            <td>${tempMovie.movieDescription.poster}</td>
                        </tr>
                        <tr>
                            <td>Photo</td>
                            <td>${tempMovie.movieDescription.photo}</td>
                        </tr>
                        <tr>
                            <td>Budget</td>
                            <td>${tempMovie.movieDescription.budget}</td>
                        </tr>
                        <tr>
                            <td>Fees</td>
                            <td>${tempMovie.movieDescription.fees}</td>
                        </tr>
                        <tr>
                            <td>Description</td>
                            <td>${tempMovie.movieDescription.description}</td>
                        </tr>
                        <tr>
                            <td class="bnt">
                                <a class="btn btn-info" href="${pageContext.request.contextPath}/movie/update/movieDescription/${tempMovie.movieDescription.id}/${tempMovie.name}/${tempMovie.id}" role="button">Update</a>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                    <div class="row">
                        <div class="col-5">

                        </div>
                        <div class="col-7">
                            <div class="row">
                                <div class="col-6 d-flex justify-content-end">
                                    <a class="btn btn-secondary ml-2" href="${pageContext.request.contextPath}/movie/all" role="button">All Movies</a>
                                </div>
                                <div class="col-6 d-flex justify-content-end">
                                    <a class="btn btn-secondary mr-4" href="${pageContext.request.contextPath}/movie/add" role="button">Add Movie</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>
</div>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>


