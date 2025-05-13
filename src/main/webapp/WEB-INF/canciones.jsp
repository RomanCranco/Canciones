<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Lista de Canciones</title></head>
<body>
<h2>Canciones</h2>
<table border="1">
    <tr>
        <th>Título</th>
        <th>Artista</th>
        <th>Detalle</th>
    </tr>
    <c:forEach var="c" items="${canciones}">
        <tr>
            <td>${c.titulo}</td>
            <td>${c.artista}</td>
            <td><a href="/canciones/detalle/${c.id}">Detalle</a></td>
			<td><a href="/canciones/formulario/agregar/0">
			    <button>Agregar nueva canción</button>
			</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>