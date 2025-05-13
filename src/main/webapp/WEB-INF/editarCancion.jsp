<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Canción</title>
</head>
<body>
    <h2>Editar Canción</h2>
    <form:form action="/canciones/procesa/editar/${cancion.id}" modelAttribute="cancion" method="post">
        <p>Título: <form:input path="titulo" /> <form:errors path="titulo" /></p>
        <p>Artista: <form:input path="artista" /> <form:errors path="artista" /></p>
        <p>Álbum: <form:input path="album" /> <form:errors path="album" /></p>
        <p>Género: <form:input path="genero" /> <form:errors path="genero" /></p>
        <p>Idioma: <form:input path="idioma" /> <form:errors path="idioma" /></p>
        <p><input type="submit" value="Actualizar Canción" /></p>
    </form:form>
    <p><a href="/canciones">Volver a lista de canciones</a></p>
</body>
</html>