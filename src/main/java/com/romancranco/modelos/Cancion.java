package com.romancranco.modelos;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name = "canciones")
public class Cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 5, message = "El título debe tener al menos 5 caracteres")
    private String titulo;
    
    @Size(min = 3, message = "El artista debe tener al menos 3 caracteres")
    private String artista;
    
    @Size(min = 3, message = "El álbum debe tener al menos 3 caracteres")
    private String album;
    
    @Size(min = 3, message = "El género debe tener al menos 3 caracteres")
    private String genero;
    
    @Size(min = 3, message = "El idioma debe tener al menos 3 caracteres")
    private String idioma;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;

    public Cancion() {}

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getArtista() { return artista; }
    public void setArtista(String artista) { this.artista = artista; }
    public String getAlbum() { return album; }
    public void setAlbum(String album) { this.album = album; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }
    public Date getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(Date fechaCreacion) { this.fechaCreacion = fechaCreacion; }
    public Date getFechaActualizacion() { return fechaActualizacion; }
    public void setFechaActualizacion(Date fechaActualizacion) { this.fechaActualizacion = fechaActualizacion; }

    @PrePersist
    protected void onCreate() { this.fechaCreacion = new Date(); }

    @PreUpdate
    protected void onUpdate() { this.fechaActualizacion = new Date(); }
}
