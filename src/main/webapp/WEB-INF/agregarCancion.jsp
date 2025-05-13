<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Canción</title>
</head>
<body>
    <h2>Formulario para agregar canción</h2>
    <form:form method="POST" modelAttribute="cancion" action="/canciones/procesa/agregar">
        <p>Título: <form:input path="titulo"/> <form:errors path="titulo"/></p>
        <p>Artista: <form:input path="artista"/> <form:errors path="artista"/></p>
        <p>Álbum: <form:input path="album"/> <form:errors path="album"/></p>
        <p>Género: <form:input path="genero"/> <form:errors path="genero"/></p>
        <p>Idioma: <form:input path="idioma"/> <form:errors path="idioma"/></p>
        <input type="submit" value="Guardar canción">
    </form:form>

    <a href="/canciones">Volver a la lista de canciones</a>
</body>
</html>