<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/taglib/taglibs.jsp" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-image: url("${pageContext.request.contextPath}/webResources/images/walkpaper1.jpg");
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
            <form:form action="${pageContext.request.contextPath}/movie/update/moviePersonal/${movieId}" modelAttribute="moviePersonal">
                <h1>Movie Personal</h1>
                <div class="form-group">
                    <label for="mvStageDirector">Stage Director</label>
                    <form:input path="stageDirector"  id="mvStageDirector" class="form-control" />
                    <form:errors path="stageDirector" />
                </div>
                <div class="form-group">
                    <label for="mvProducer">Producer</label>
                    <form:input path="producer"  id="mvProducer" class="form-control" />
                    <form:errors path="producer" />
                </div>
                <div class="form-group">
                    <label for="mvauthorScript">Author Script</label>
                    <form:input path="authorScript"  id="mvauthorScript" class="form-control" />
                    <form:errors path="authorScript" />
                </div>
                <div class="form-group">
                    <label for="mvMainCast">Main Cast</label>
                    <form:input path="mainCast"  id="mvMainCast" class="form-control" />
                    <form:errors path="mainCast" />
                </div>
                <div class="form-group">
                    <label for="mvOperator">Operator</label>
                    <form:input path="operator"  id="mvOperator" class="form-control" />
                    <form:errors path="operator" />
                </div>
                <div class="form-group">
                    <label for="mvComposer">Composer</label>
                    <form:input path="composer"  id="mvComposer" class="form-control" />
                    <form:errors path="composer" />
                </div>
                <form:hidden path="id" />
                <input type="submit" value="Save" class="btn btn-secondary"/>
            </form:form>
        </div>
    </div>
</div>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>