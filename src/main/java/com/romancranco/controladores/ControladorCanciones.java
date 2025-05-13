package com.romancranco.controladores;

import com.romancranco.modelos.Cancion;
import com.romancranco.servicios.ServicioCanciones;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorCanciones {

    @Autowired
    private ServicioCanciones servicio;

    @GetMapping("/canciones")
    public String desplegarCanciones(Model model) {
        model.addAttribute("canciones", servicio.obtenerTodasLasCanciones());
        return "canciones";
    }

    @GetMapping("/canciones/detalle/{idCancion}")
    public String desplegarDetalleCancion(@PathVariable("idCancion") Long idCancion, Model model) {
        Cancion cancion = servicio.obtenerCancionPorId(idCancion);
        model.addAttribute("cancion", cancion);
        return "detalleCancion";
    }
    
    @GetMapping("/canciones/formulario/agregar/{idCancion}")
    public String formularioAgregarCancion(@ModelAttribute("cancion") Cancion cancion) {
        return "agregarCancion";
    }

    @PostMapping("/canciones/procesa/agregar")
    public String procesarAgregarCancion(
        @Valid @ModelAttribute("cancion") Cancion cancion,
        BindingResult resultado) {

        if (resultado.hasErrors()) {
            return "agregarCancion";
        }

        servicio.agregarCancion(cancion);
        return "redirect:/canciones";
    }
    
    @GetMapping("/canciones/formulario/editar/{idCancion}")
    public String formularioEditarCancion(@PathVariable Long idCancion, Model model) {
        Cancion cancion = servicio.obtenerCancionPorId(idCancion);
        if (cancion != null) {
            model.addAttribute("cancion", cancion);
            return "editarCancion";
        }
        return "redirect:/canciones";
    }

    @PostMapping("/canciones/procesa/editar/{idCancion}")
    public String procesarEditarCancion(@Valid @ModelAttribute("cancion") Cancion cancion,
                                        BindingResult result,
                                        @PathVariable Long idCancion,
                                        Model model) {
        if (result.hasErrors()) {
            return "editarCancion";
        }
        servicio.actualizaCancion(cancion);
        return "redirect:/canciones";
    }
}
