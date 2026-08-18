/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.sena.sistemagestiongorrasweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.sena.sistemagestiongorrasweb.modelo.Gorra;
import com.sena.sistemagestiongorrasweb.dao.GorraDAO;

/**
 *
 * @author crist
 */
@WebServlet("/RegistrarServlet")
public class RegistrarServelet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrarServelet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrarServelet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String marca = request.getParameter("marca");
        String color = request.getParameter("color");
        String talla = request.getParameter("talla");
        String precio = request.getParameter("precio");
        String stock = request.getParameter("stock");

        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Talla: " + talla);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
        
        Gorra gorra = new Gorra();

        gorra.setNombre(nombre);
        gorra.setMarca(marca);
        gorra.setColor(color);
        gorra.setTalla(talla);
        gorra.setPrecio(Double.parseDouble(precio));
        gorra.setStock(Integer.parseInt(stock));
        
        GorraDAO dao = new GorraDAO();
        
        dao.insertarGorra(gorra); 
        System.out.println("Gorra registrada correctamente:");
        
        System.out.println("Nombre: " + gorra.getNombre());
        System.out.println("Marca: " + gorra.getMarca());
        System.out.println("Color: " + gorra.getColor());
        System.out.println("Talla: " + gorra.getTalla());
        System.out.println("Precio: " + gorra.getPrecio());
        System.out.println("Stock: " + gorra.getStock());
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
