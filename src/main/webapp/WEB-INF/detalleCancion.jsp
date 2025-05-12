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
</body>
</html>