package com.romancranco.servicios;

import com.romancranco.modelos.Cancion;
import com.romancranco.repositorios.RepositorioCanciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCanciones {

    @Autowired
    private RepositorioCanciones repo;

    public List<Cancion> obtenerTodasLasCanciones() {
        return repo.findAll();
    }

    public Cancion obtenerCancionPorId(Long id) {
        return repo.findById(id).orElse(null);
    }
}
