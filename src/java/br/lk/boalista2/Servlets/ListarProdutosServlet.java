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
@WebServlet(name = "ListarProdutosServlet", urlPatterns = {"/ListarProdutosServlet"})
public class ListarProdutosServlet extends HttpServlet {

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
        
        
    List<Produto> lista = Fachada.getStance().recuperarTodos();
    
    
   
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListarProdutosServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            out.println("<h1>Produtos Cadastrados</h1>");
            out.println("<table border =1>");
                       
            out.println("<tr><th>Codigo:</th><th>Nome:</th><th>Marca</th><th> Operações:</th></tr>");
            
         for(int i=0;i<lista.size();i++){
             out.println("<tr><td>"+lista.get(i).getCodigo()+"</td><td>"+lista.get(i).getNome()+"</td>"
                     + "<td>"+lista.get(i).getMarca().getMarca()+"</td>"
                     + "<td> <a href=\"PreparaProdutoServlet?id="+lista.get(i).getId()+"\">Atualizar Produto </a>"
                     + "<a href=\"ExcluirPodutoServlet?id="+lista.get(i).getId()+"\">Excluir</tr>");
         }
            
            out.println("<a href =\"index.html\">Voltar</a>");
            
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
