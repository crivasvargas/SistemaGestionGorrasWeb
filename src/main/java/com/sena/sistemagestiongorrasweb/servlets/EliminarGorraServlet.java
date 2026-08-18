package com.sena.sistemagestiongorrasweb.servlets;

import com.sena.sistemagestiongorrasweb.dao.GorraDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/EliminarGorraServlet")
public class EliminarGorraServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idgorra = Integer.parseInt(request.getParameter("idgorra"));

        GorraDAO dao = new GorraDAO();

        dao.eliminarGorra(idgorra);

        response.sendRedirect("ListarGorrasServlet");
    }
}