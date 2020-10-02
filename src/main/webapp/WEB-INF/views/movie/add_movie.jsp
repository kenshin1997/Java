<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/taglib/taglibs.jsp" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
             background-image: url("${pageContext.request.contextPath}/webResources/images/walkpaper.png");
         }
    </style>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/webResources/css/addmovie.css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid" >
    <h1>Add Movie</h1>
    <div class="container">
        <form:form action="${pageContext.request.contextPath}/movie/add" modelAttribute="movie">
        <div class="row">
            <div   class="col-5">
                <h1>Movie General Data</h1>
                <div class="form-group">
                    <label for="mvName">Movie Name:</label>
                    <form:input path="name"  id="mvName" class="form-control" />
                    <form:errors path="name" />
                </div>
                <div class="form-group">
                    <label for="mvYear">Movie Year:</label>
                    <form:input path="year"  id="mvYear" class="form-control" />
                    <form:errors path="year" />
                </div>
                <div class="form-group">
                    <label for="mvCountry">Movie Country:</label>
                    <form:input path="country"  id="mvCountry" class="form-control" />
                    <form:errors path="country" />
                </div>
                <div class="form-group">
                    <label for="mvLanguage">Movie Language:</label>
                    <form:input path="language"  id="mvLanguage" class="form-control" />
                    <form:errors path="language" />
                </div>
                <div class="form-group">
                    <label for="mvFilmCompany">Movie Film Company:</label>
                    <form:input path="filmCompany"  id="mvFilmCompany" class="form-control" />
                    <form:errors path="filmCompany" />
                </div>
                <div class="form-group">
                    <label for="mvGenre">Movie Genre:</label>
                    <form:input path="genre"  id="mvGenre" class="form-control" />
                    <form:errors path="genre" />
                </div>
            </div>
            <div class="col-2">

            </div>
            <div class="col-5">
                <h1>Movie Personal</h1>
                <div class="form-group">
                    <label for="mvStageDirector">Stage Director</label>
                    <form:input path="moviePersonal.stageDirector"  id="mvStageDirector" class="form-control" />
                    <form:errors path="moviePersonal.stageDirector" />
                </div>
                <div class="form-group">
                    <label for="mvProducer">Producer</label>
                    <form:input path="moviePersonal.producer"  id="mvProducer" class="form-control" />
                    <form:errors path="moviePersonal.producer" />
                </div>
                <div class="form-group">
                    <label for="mvauthorScript">Author Script</label>
                    <form:input path="moviePersonal.authorScript"  id="mvauthorScript" class="form-control" />
                    <form:errors path="moviePersonal.authorScript" />
                </div>
                <div class="form-group">
                    <label for="mvMainCast">Main Cast</label>
                    <form:input path="moviePersonal.mainCast"  id="mvMainCast" class="form-control" />
                    <form:errors path="moviePersonal.mainCast" />
                </div>
                <div class="form-group">
                    <label for="mvOperator">Operator</label>
                    <form:input path="moviePersonal.operator"  id="mvOperator" class="form-control" />
                    <form:errors path="moviePersonal.operator" />
                </div>
                <div class="form-group">
                    <label for="mvComposer">Composer</label>
                    <form:input path="moviePersonal.composer"  id="mvComposer" class="form-control" />
                    <form:errors path="moviePersonal.composer" />
                </div>
                <h1>Movie Description</h1>
                <div class="form-group">
                    <label for="mvPoster">Movie Poster</label>
                    <form:input path="movieDescription.poster"  id="mvPoster" class="form-control" />
                    <form:errors path="movieDescription.poster" />
                </div>
                <div class="form-group">
                    <label for="mvphoto">Movie Photo</label>
                    <form:input path="movieDescription.photo"  id="mvphoto" class="form-control" />
                    <form:errors path="movieDescription.photo" />
                </div>
                <div class="form-group">
                    <label for="mvBudget">Movie Budget</label>
                    <form:input path="movieDescription.budget"  id="mvBudget" class="form-control" />
                    <form:errors path="movieDescription.budget" />
                </div>
                <div class="form-group">
                    <label for="mvFees">Movie Fees</label>
                    <form:input path="movieDescription.fees"  id="mvFees" class="form-control" />
                    <form:errors path="movieDescription.fees" />
                </div>
                <div class="form-group">
                    <label for="mvDescription">Movie Description</label>
                    <form:textarea path="movieDescription.description"  id="mvDescription" class="form-control" />
                    <form:errors path="movieDescription.description" />
                </div>
                <form:hidden path="id" />
                <form:hidden path="movieDescription.id" />
                <form:hidden path="moviePersonal.id" />
                <input type="submit" value="Save" class="btn btn-secondary"/>
                </form:form>
            </div>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
