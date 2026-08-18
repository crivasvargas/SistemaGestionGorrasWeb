    package com.sena.sistemagestiongorrasweb.servlets;

import com.sena.sistemagestiongorrasweb.dao.GorraDAO;
import com.sena.sistemagestiongorrasweb.modelo.Gorra;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/EditarGorraServlet")
public class EditarGorraServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idgorra = Integer.parseInt(request.getParameter("idgorra"));
        String nombre = request.getParameter("nombre");
        String marca = request.getParameter("marca");
        String color = request.getParameter("color");
        String talla = request.getParameter("talla");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int stock = Integer.parseInt(request.getParameter("stock"));

        Gorra gorra = new Gorra();

        gorra.setIdgorra(idgorra);
        gorra.setNombre(nombre);
        gorra.setMarca(marca);
        gorra.setColor(color);
        gorra.setTalla(talla);
        gorra.setPrecio(precio);
        gorra.setStock(stock);

        GorraDAO dao = new GorraDAO();
        dao.actualizarGorra(gorra);

        response.sendRedirect("ListarGorrasServlet");
    }
}