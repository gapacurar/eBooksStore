/*
 * a-sti.ro
*/
package ebooksstoreservlets;

import java.io.IOException;
import java.io.PrintWriter;
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
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Electronic Books Store</title>");   
            out.println("<meta charset=\"UTF-8\">");   
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"); 
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href= \"eBooksStore.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3> eBooks Store</h3>");
            out.println("<br>");
            out.println("<form action=\""+request.getContextPath()+"/index\" method=\"post\">");
            out.println("<table class=\"tablewithborder\">");
            out.println("<tr><td class=\"tdc\"><input type=\"submit\" class=\"citybutton\" name=\"mainpage_newebook\" value=\"Record new eBook\"></td></tr>");
            out.println("<tr><td class=\"tdc\"><input type=\"submit\" class=\"citybutton\" name=\"mainpage_updateebook\" value=\"Update an eBook\"></td></tr>");
            out.println("<tr><td class=\"tdc\"><input type=\"submit\" class=\"citybutton\" name=\"mainpagedeleteebook\" value=\"Delete an eBook\"></td></tr>");
            out.println("<tr><td class=\"tdc\"><input type=\"submit\" class=\"citybutton\" name=\"mainpage_displayebooks\" value=\"Display all eBooks\" size=\"30\"></td></tr>");
            out.println("<tr><td class=\"tdc\"><input type=\"submit\" class=\"citybutton\" name=\"mainpage_exit\" value=\" Exit from eBooks\" size=\"40\"></td></tr>");
            out.println("</table>");
            out.println("<br>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            
            // this code is used to analyse push of buttons in index servlet

            if (request.getParameter("mainpage_newebook") != null) {
                request.getRequestDispatcher("./RecordNewEBook.jsp").forward(request, response);
            } else if (request.getParameter("mainpage_updateebook") != null) {
                request.getRequestDispatcher("./UpdateEBook.jsp").forward(request, response);            
            } else if (request.getParameter("mainpagedeleteebook") != null) {
                request.getRequestDispatcher("./DeleteEBook.jsp").forward(request, response);                        
            } else if (request.getParameter("mainpage_displayebooks") != null){
                request.getRequestDispatcher("./DisplayAllEbooks.jsp").forward(request, response);
            } else if(request.getParameter("mainpage_displayebooks") != null){
                this.destroy();
            } 

        }//try
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
        return "This is index servlet of eBookStore application";
    }// </editor-fold>

}
