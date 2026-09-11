package com.sena.sistemagestiongorrasweb.controller;

import com.sena.sistemagestiongorrasweb.dao.GorraDAO;
import com.sena.sistemagestiongorrasweb.modelo.Gorra;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador Spring para consultar las gorras registradas.
 * Utiliza Spring Web MVC para atender peticiones HTTP.
 */
@RestController
@RequestMapping("/gorras")
public class GorraController {

    private final GorraDAO gorraDAO = new GorraDAO();

    /**
     * Consulta las gorras almacenadas en MySQL.
     *
     * @return información de las gorras registradas
     */
    @GetMapping
    public String listarGorras() {

        List<Gorra> gorras = gorraDAO.listarGorras();

        StringBuilder respuesta = new StringBuilder();

        respuesta.append("LISTADO DE GORRAS\n\n");

        for (Gorra gorra : gorras) {

            respuesta.append("ID: ")
                    .append(gorra.getIdgorra())
                    .append(" | Nombre: ")
                    .append(gorra.getNombre())
                    .append(" | Marca: ")
                    .append(gorra.getMarca())
                    .append(" | Color: ")
                    .append(gorra.getColor())
                    .append(" | Talla: ")
                    .append(gorra.getTalla())
                    .append(" | Precio: ")
                    .append(gorra.getPrecio())
                    .append(" | Stock: ")
                    .append(gorra.getStock())
                    .append("\n");
        }

        return respuesta.toString();
    }
}