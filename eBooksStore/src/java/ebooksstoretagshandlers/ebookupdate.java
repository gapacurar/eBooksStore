/*
 * a-sti.ro
 */
package ebooksstoretagshandlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class ebookupdate extends SimpleTagSupport {

    private String isbn;
    private String title;
    private String authors;
    private String devices;
    private Float price;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     * @throws javax.servlet.jsp.JspException
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        try{
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
                String DML = "UPDATE EBOOKS SET title=?,authors=?,devices=?,price=? where isbn=?";
                PreparedStatement pstmnt = connection.prepareStatement(DML);
                pstmnt.setString(1, title);
                pstmnt.setString(2, authors);
                pstmnt.setString(3, devices);
                pstmnt.setFloat(4, price);
                pstmnt.setString(5, isbn);
                int executeUpdate = pstmnt.executeUpdate();
                if(executeUpdate == 0)
                {
                    // no row was updated
                    out.println("<h3> No row was updated.</h3>");
                }    
            }
            catch (ClassNotFoundException | SQLException ex)
            {
                try {
                    throw new SQLException();
                } catch (SQLException ex1) {
                    Logger.getLogger(ebookupdate.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            finally
            {
                if (resultSet != null)
                {
                    try
                    {
                        resultSet.close();
                    }
                    catch (SQLException ex){}
                }
                if (statement != null)
                {
                    try
                    {
                        statement.close();
                    }
                    catch (SQLException ex){}
                }	
                if (connection != null)
                {
                    try
                    {
                        connection.close();
                    }
                    catch (SQLException ex){}
                }
            }
            // TODO: insert code to write html before writing the body content.
            // e.g.:
            //
            // out.println("<strong>" + attribute_1 + "</strong>");
            // out.println("    <blockquote>");

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in ebookupdate tag", ex);
        }
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setDevices(String devices) {
        this.devices = devices;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    
}
