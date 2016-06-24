/*
 * a-sti.ro
 */
package ebooksstoreservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gheorgheaurelpacurar
 * This class is a pure servlet used for insertion of a new eBook in the DB. This
 * servlet is used for processing the request and also for display the response.
 */
public class insertebook extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            /* read parameters received on call */
            String isbn = request.getParameter("inputform_newebook_ISBN");
            String title = request.getParameter("inputform_newebook_title");
            String authors = request.getParameter("inputform_newebook_authors");
            String devices = request.getParameter("inputform_newebook_devices");
            String sprice = request.getParameter("inputform_newebook_price");
            Float fprice = new Float(sprice); 
            // set connection paramters to the DB
            ResultSet resultSet = null;
            Statement statement = null;
            Connection connection = null;
            String user = "derbyremote" ;
            String password = "derbyremote";
            String url = "jdbc:derby://localhost/ebooks;create=true;";
            String driver = "org.apache.derby.jdbc.ClientDriver40";
            try
            {
                Class driverClass = Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
                statement = connection.createStatement();
                //call stored procedure to insert a new person
                String DML = "INSERT INTO EBOOKS VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pstmnt = connection.prepareStatement(DML);
                pstmnt.setString(1, isbn);
                pstmnt.setString(2, title);
                pstmnt.setString(3, authors);
                pstmnt.setString(4, devices);
                pstmnt.setFloat(5, fprice);
                pstmnt.execute();
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Insert succeeds!</title>");   
                out.println("<meta charset=\"UTF-8\">");   
                out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"); 
                out.println("<link rel=\"stylesheet\" type=\"text/css\" href= \"eBooksStore.css\">");
                out.println("</head>");
                out.println("<body>");
                out.println("<h3> Insert operation was done with values:</h3>");
                out.println("<br><hr>");
                out.println("ISBN: "+isbn+" <br>");
                out.println("Title: "+title+" <br>");
                out.println("Authors: "+authors+" <br>");
                out.println("Devices: "+devices+" <br>");
                out.println("Price: "+isbn+" <br><hr>");
                out.println("<form action=\"index.jsp\" method=\"post\">");
                out.println("<input type=\"submit\" class=\"citybutton\" name=\"mainpage_newebook\" value=\"Back\">");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
            }
            catch (ClassNotFoundException | SQLException ex)
            {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Insert failed</title>");   
                out.println("<meta charset=\"UTF-8\">");   
                out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"); 
                out.println("<link rel=\"stylesheet\" type=\"text/css\" href= \"eBooksStore.css\">");
                out.println("</head>");
                out.println("<body>");
                out.println("<h3> Insert operation failed</h3>");
                out.println("<br>");
                ex.printStackTrace(out);
                out.println("</body>");
                out.println("</html>");
                throw new SQLException();
                
            }
            finally
            {
                if (resultSet != null)
                {
                    try
                    {
                        resultSet.close();
                    }
                    catch (Exception ex){}
                }
                if (statement != null)
                {
                    try
                    {
                        statement.close();
                    }
                    catch (Exception ex){}
                }	
                if (connection != null)
                {
                    try
                    {
                        connection.close();
                    }
                    catch (Exception ex){}
                }
            }

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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(insertebook.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(insertebook.class.getName()).log(Level.SEVERE, null, ex);
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
