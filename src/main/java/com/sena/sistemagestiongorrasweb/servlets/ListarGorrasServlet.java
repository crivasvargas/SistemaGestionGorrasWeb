package com.sena.sistemagestiongorrasweb.servlets;

import com.sena.sistemagestiongorrasweb.dao.GorraDAO;
import com.sena.sistemagestiongorrasweb.modelo.Gorra;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/ListarGorrasServlet")
public class ListarGorrasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        GorraDAO dao = new GorraDAO();

        List<Gorra> lista = dao.listarGorras();

        request.setAttribute("listaGorras", lista);

        request.getRequestDispatcher("listarGorras.jsp")
                .forward(request, response);
    }
}