<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head><title>Detalle Canción</title></head>
	<body>
		<h2>Detalle de Canción</h2>
			<p><strong>Título:</strong> ${cancion.titulo}</p>
			<p><strong>Artista:</strong> ${cancion.artista}</p>
			<p><strong>Álbum:</strong> ${cancion.album}</p>
			<p><strong>Género:</strong> ${cancion.genero}</p>
			<p><strong>Idioma:</strong> ${cancion.idioma}</p>
			<p><strong>Fecha de Creación:</strong> ${cancion.fechaCreacion}</p>
			<p><strong>Fecha de Actualización:</strong> ${cancion.fechaActualizacion}</p>
			<a href="/canciones">Volver a la lista de canciones</a>
			<p><a href="/canciones/formulario/editar/${cancion.id}">Editar esta canción</a></p>
		<form action="/canciones/eliminar/${canciones.id}" method="GET"
				onsubmit="return confirm('¿Estás seguro de que quieres eliminar esta canción?');">
				<input type="submit" value="Eliminar cancion">
		</form>
	</body>
</html>