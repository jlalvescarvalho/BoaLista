/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Servlets;

import br.lk.boalista2.Fachada.Fachada;
import br.lk.boalista2.Negocio.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kleriston
 */
@WebServlet(name = "ListarUsuarios", urlPatterns = {"/ListarUsuarios"})
public class ListarUsuarios extends HttpServlet {

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
        
        List<Usuario> lista = Fachada.getStance().listarUsuario();
        
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListarUsuarios</title>");            
            out.println("</head>");
            out.println("<body>");
           out.println("<h1>Usuarios Cadastrados </h1>");
            out.println("<table border =1>");
            
            out.println("<tr><th>Nome:</th><th>Sobrenome:</th><th>Email:</th><th>Login:</th><th>Operações:</th></tr>");
            
            for(int i=0;i<lista.size();i++){
                
                 
                out.println("<tr><td>"+lista.get(i).getNome()+
                        "</td><td>"+lista.get(i).getSobrenome()+
                        "</td><td>"+lista.get(i).getEmail()+
                        "</td><td>"+lista.get(i).getLogin()+
                        "</td><td><a href=\"PrepararUsuarioServlet?id="+lista.get(i).getId()+"\">Alterar </a></td>"
                        + "<td><a href=\"ExcluirusuarioServlet?id="+lista.get(i).getId()+"\">Excluir</a> </td></tr>");
            }
            
            out.println("</table>");
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
        processRequest(request, response);
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
