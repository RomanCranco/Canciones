package com.romancranco.servicios;

import com.romancranco.modelos.Cancion;
import com.romancranco.repositorios.RepositorioCanciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCanciones {

    @Autowired
    private RepositorioCanciones repositorio;

    public List<Cancion> obtenerTodasLasCanciones() {
        return repositorio.findAll();
    }

    public Cancion obtenerCancionPorId(Long id) {
        return repositorio.findById(id).orElse(null);
    }
    
    public Cancion agregarCancion(Cancion cancion) {
    	return repositorio.save(cancion);
    }
    
    public Cancion actualizaCancion(Cancion cancion) {
        return repositorio.save(cancion);
    }
    
    public void eliminaCancion(Long id) {
    	repositorio.deleteById(id);
    }
}
