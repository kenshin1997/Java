<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/taglib/taglibs.jsp" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-image: url("${pageContext.request.contextPath}/webResources/images/walkpaper2.png");
        }
    </style>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/webResources/css/addmovie.css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h1>${movieName}</h1>
<div class="container">
    <div class="row">
        <div class="col-6 aling-self-center">
            <form:form action="${pageContext.request.contextPath}/movie/update/movieDescription/${movieId}" modelAttribute="movieDescription">
                <h1>Movie Description</h1>
                <div class="form-group">
                    <label for="mvPoster">Movie Poster</label>
                    <form:textarea path="poster"  id="mvPoster" class="form-control" />
                    <form:errors path="poster" />
                </div>
                <div class="form-group">
                    <label for="mvphoto">Movie Photo</label>
                    <form:input path="photo"  id="mvphoto" class="form-control" />
                    <form:errors path="photo" />
                </div>
                <div class="form-group">
                    <label for="mvBudget">Movie Budget</label>
                    <form:input path="budget"  id="mvBudget" class="form-control" />
                    <form:errors path="budget" />
                </div>
                <div class="form-group">
                    <label for="mvFees">Movie Fees</label>
                    <form:input path="fees"  id="mvFees" class="form-control" />
                    <form:errors path="fees" />
                </div>
                <div class="form-group">
                    <label for="mvDescription">Movie Description</label>
                    <form:textarea path="description"  id="mvDescription" class="form-control" />
                    <form:errors path="description" />
                </div>
                <form:hidden path="id" />
                <input type="submit" value="Save" class="btn btn-secondary"/>
            </form:form>
        </div>
        <div class="col-6">
            <img src="${movieDescription.poster}" style="height:200px;width: 150px;" />
        </div>
    </div>
</div>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>