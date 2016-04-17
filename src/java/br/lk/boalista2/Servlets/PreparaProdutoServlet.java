/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Servlets;

import br.lk.boalista2.Fachada.Fachada;
import br.lk.boalista2.Negocio.Produto;
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
@WebServlet(name = "PreparaProdutoServlet", urlPatterns = {"/PreparaProdutoServlet"})
public class PreparaProdutoServlet extends HttpServlet {

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
        
     Produto produto =   Fachada.getStance().recuperarProduto(id);
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PreparaProdutoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
          
            out.println("<h1>Ateração de Produto</h1>");
            out.println("<a href=\"ListarProdutosServlet\">Cancelar Atualização</a>");
             
            out.println("<form method=\"post\" action=\"AlteraProdutoServlet\">");
            
            
            
            out.println("<table borde=1>");
            
            out.println("<tr><td>Nome:</td><td> <input type=\"text\" name=\"nome\" value=\""+produto.getNome()+"\"/></td></tr><br>");
            out.println("<tr><td>Codigo:</td><td> <input type=\"text\" name=\"codigo\" value=\""+produto.getCodigo()+"\"/></td></tr><br>");
            out.println("<tr><td>ID:</td><td> "+produto.getId()+"<input type=\"hidden\" name=\"id\" "
                    + "value=\""+produto.getId()+"\"/> </td>");
            
             out.println("</table>");
            
              out.println("<input type=\"submit\" value=\"Atualizar\"/> "
                                  + "<input type=\"reset\" value=\"Recuperar Valores\"/>");
              out.println("</form>");
             
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
