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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kleriston
 */
@WebServlet(name = "PrepararUsuarioServlet", urlPatterns = {"/PrepararUsuarioServlet"})
public class PrepararUsuarioServlet extends HttpServlet {

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
        
        Long id = Long.parseLong(request.getParameter("id"));
        
        Usuario usuario = Fachada.getStance().recuperarUsuario(id);
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PrepararUsuarioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
             out.println("<h1>Alterar Usuario</h1>");
             out.println("<a href=\"ListarUsuarios\">Cancelar Atualização</a>");
             
             out.println("<form method=\"post\" action=\"AlterarUsuarioServlet\">");
              
        out.println("<table borde=1>");
              
        out.println("<tr><td>Nome:</td><td><input type=\"text\"name=\"nome\" value=\""+usuario.getNome()+"\"> </td> </tr>");
        out.println("<tr><td>Sobrenome:</td><td><input type=\"text\"name=\"sobrenome\" value=\""+usuario.getSobrenome()+"\"> </td> </tr>");
        out.println("<tr><td>Email:</td><td><input type=\"text\"name=\"email\" value=\""+usuario.getEmail()+"\"> </td> </tr>");     
        out.println("<tr><td>Login:</td><td><input type=\"text\"name=\"login\" value=\""+usuario.getLogin()+"\"> </td> </tr>");   
        out.println("<tr><td>Senha:</td><td><input type=\"password\"name=\"senha\" value=\""+usuario.getSenha()+"\"> </td> </tr>"); 
        out.println("<tr><td>Identificador:</td><td><input type=\"text\"name=\"id\" value=\""+usuario.getId()+"\"> </td> </tr>");  
        
        out.println("<form>");
        
           
           
        out.println("</table>");
             out.println("<input type=\"submit\" value=\"Atualizar\"/> "
                                  + "<input type=\"reset\" value=\"Recuperar Valores\"/>");
        
            
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
