/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.pokedexweb_josereynaga.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import clases.Pokemon;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author vv094
 */
@WebServlet(name = "RegistrarPokemon", urlPatterns = {"/registrar"})
public class RegistrarPokemon extends HttpServlet {

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
            out.println("<title>Servlet RegistrarPokemon</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrarPokemon at " + request.getContextPath() + "</h1>");
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
        String numero = request.getParameter("numero");
        String tipo1 = request.getParameter("tipo1");
        String tipo2 = request.getParameter("tipo2");
        String url = request.getParameter("url");
        String mensajeError = "";

        if (nombre == null || nombre.isBlank()) {
            mensajeError += "El nombre del pokémon es obligatorio.<br/>";
        }

        if (numero == null || numero.isBlank()) {
            mensajeError += "El número del pokémon es obligatorio.<br/>";
        }

        if (tipo1 == null || tipo1.isBlank()) {
            mensajeError += "El primer tipo del pokémon es obligatorio.<br/>";
        }

        if (url == null || url.isBlank()) {
            mensajeError += "El enlace a la imagen del pokémon es obligatorio.<br/>";
        }

        if (!mensajeError.isEmpty()) {
            request.setAttribute("Errores", mensajeError);
            this.getServletContext().getRequestDispatcher("index.jsp").forward(request, response);
            
        } else {
            Pokemon nuevoPokemon;
            if (tipo2 == null || tipo2.isBlank()) {
                nuevoPokemon = new Pokemon(nombre, Integer.parseInt(numero), List.of(tipo1), url);
            } else {
                nuevoPokemon = new Pokemon(nombre, Integer.parseInt(numero), List.of(tipo1, tipo2), url);
            }
            request.setAttribute("mensaje", "El Pokémon " + nombre + " ha sido registrado exitosamente.");
            this.getServletContext().getRequestDispatcher("/pokedex.jsp").forward(request, response);
        }
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
