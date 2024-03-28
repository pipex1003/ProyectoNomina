/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Modelo.Nomina;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ANDRES AVILA
 */
@WebServlet(name = "servletNomina", urlPatterns = {"/servletNomina"})
public class servletNomina extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String identificacion=request.getParameter("id");
        String Nombre=request.getParameter("nombre");
        String sueldo=request.getParameter("salario");
        String cDias=request.getParameter("dias");
        double total;
        Nomina nomina= new Nomina(sueldo,cDias,identificacion,Nombre);
        nomina.calsueldo();
        total=nomina.getsTotal();
        double pension=nomina.getpension();
        double salud=nomina.getsalud();
        double aux=nomina.getaux();
        //System.out.println("el sueldo total es: "+total);
        request.setAttribute("identificacion", identificacion);
        request.setAttribute("nombre", Nombre);
        request.setAttribute("sueldo", sueldo);
        request.setAttribute("cDias", cDias);
        request.setAttribute("aux", aux);
        request.setAttribute("salud", salud);
        request.setAttribute("pension", pension);
        request.setAttribute("total", total);

        RequestDispatcher dispatcher = request.getRequestDispatcher("nomina.jsp");
        dispatcher.forward(request, response);
    }
    public String getServletInfo() {
        return "Short description";
    }
}
