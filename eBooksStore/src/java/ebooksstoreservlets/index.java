/*
 * a-sti.ro
*/
package ebooksstoreservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class index extends HttpServlet {

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
         
            // implement recommended architecture request->servlet->response-->JSP
            // this code is used to analyse push of buttons in index servlet
            if (request.getParameter("mainpage_newebook") != null) {
                request.getRequestDispatcher("./RecordNewEBook.jsp").forward(request, response);
            } else if (request.getParameter("mainpage_updateebook") != null) {
                request.getRequestDispatcher("./UpdateEBook.jsp").forward(request, response);            
            } else if (request.getParameter("mainpagedeleteebook") != null) {
                request.getRequestDispatcher("./DeleteEBook.jsp").forward(request, response);                        
            } else if (request.getParameter("mainpage_displayebooks") != null){
                request.getRequestDispatcher("./DisplayAllEbooks.jsp").forward(request, response);
            } else if(request.getParameter("mainpage_exit") != null){
                request.getRequestDispatcher("./exit.jsp").forward(request, response);
            } 
            // if no button was pushed we delegate to the JSP the response work
            request.getRequestDispatcher("./index.jsp").forward(request, response);
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
        return "This is index servlet of eBookStore application and works with index.JSP";
    }// </editor-fold>

}
