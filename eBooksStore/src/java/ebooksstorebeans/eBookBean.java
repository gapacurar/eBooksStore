/*
 * a-sti.ro
 */
package ebooksstorebeans;

import java.beans.*;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class eBookBean implements Serializable {
    
    public static final String PROP_ISBN = "ISBN";
    
    private String isbn = "";

    private final PropertyChangeSupport propertySupport;
    
    public eBookBean() {
        this.price = 0.0f;
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String value) throws SQLException {
        String oldValue = isbn;
        isbn = value;
        // load from DB all other values for this ISBN
           // set connection paramters to the DB
            ResultSet resultSet = null;
            java.sql.Statement statement = null;
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
                //call stored procedure to select the eBooks with given ISBN
                String DML = "SELECT * FROM EBOOKS WHERE ISBN = ?";
                PreparedStatement pstmnt = connection.prepareStatement(DML);
                pstmnt.setString(1, isbn);
                resultSet = pstmnt.executeQuery();
                if (resultSet!=null)
                {
                    while(resultSet.next()){
                        isbn = resultSet.getString(1);
                        this.setTitle(resultSet.getString(2));
                        this.setAuthors(resultSet.getString(3));
                        this.setDevices(resultSet.getString(4));
                        this.setPrice(resultSet.getFloat(5));
                        this.setValidbean(true); 
                    }
                }
            else
            {
                this.setValidbean(false);
            }
            }
            catch (ClassNotFoundException | SQLException ex)
            {
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
        propertySupport.firePropertyChange(PROP_ISBN, oldValue, isbn);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
    private String title = "";

    public static final String PROP_TITLE = "title";

    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        String oldTitle = this.title;
        this.title = title;
        propertySupport.firePropertyChange(PROP_TITLE, oldTitle, title);
    }

        private String authors = "";

    public static final String PROP_AUTHORS = "authors";

    /**
     * Get the value of authors
     *
     * @return the value of authors
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * Set the value of authors
     *
     * @param authors new value of authors
     */
    public void setAuthors(String authors) {
        String oldAuthors = this.authors;
        this.authors = authors;
        propertySupport.firePropertyChange(PROP_AUTHORS, oldAuthors, authors);
    }

        private String devices = "";

    public static final String PROP_DEVICES = "devices";

    /**
     * Get the value of devices
     *
     * @return the value of devices
     */
    public String getDevices() {
        return devices;
    }

    /**
     * Set the value of devices
     *
     * @param devices new value of devices
     */
    public void setDevices(String devices) {
        String oldDevices = this.devices;
        this.devices = devices;
        propertySupport.firePropertyChange(PROP_DEVICES, oldDevices, devices);
    }

        private Float price;

    public static final String PROP_PRICE = "price";

    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(Float price) {
        Float oldPrice = this.price;
        this.price = price;
        propertySupport.firePropertyChange(PROP_PRICE, oldPrice, price);
    }
    /** this bean is loaded based on a selection in DB made with isbn as parameter. 
     * If there is no record with such isbn the bean will be set as invalid bean;
     If the isbn is valid and returns one row from DB than all fields of bean 
     * will be loaded with this isbn*/
    private boolean validbean = false;

    public static final String PROP_VALIDBEAN = "validbean";

    /**
     * Get the value of validbean
     * @return the value of validbean
     */
    public boolean isValidbean() {
        return validbean;
    }

    /**
     * Set the value of validbean
     *
     * @param validbean new value of validbean
     */
    public void setValidbean(boolean validbean) {
        boolean oldValidbean = this.validbean;
        this.validbean = validbean;
        propertySupport.firePropertyChange(PROP_VALIDBEAN, oldValidbean, validbean);
    }

    private boolean delete = false;

    public static final String PROP_DELETE = "delete";

    /**
     * Get the value of delete
     *
     * @return the value of delete
     */
    public boolean isDelete() {     
        return delete;
    }

    /**
     * Set the value of delete
     *
     * @param delete new value of delete
     * @throws java.sql.SQLException
     */
    public void setDelete(boolean delete) throws SQLException {
        // load from DB all other values for this ISBN
           // set connection paramters to the DB
        if(delete){
            ResultSet resultSet = null;
            java.sql.Statement statement = null;
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
                //call stored procedure to select the eBooks with given ISBN
                String DML = "DELETE FROM EBOOKS WHERE ISBN = ?";
                PreparedStatement pstmnt = connection.prepareStatement(DML);
                pstmnt.setString(1, getIsbn());
                boolean delok = pstmnt.execute();
                if (delok) // delete operation was successfully
                {
                        this.setValidbean(true);
                        this.setDelete(true);
                }
            else
            {
                this.setValidbean(false);
                this.setDelete(false);
            }
            }
            catch (ClassNotFoundException | SQLException ex)
            {
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
        boolean oldDelete = this.delete;
        this.delete = delete;
        propertySupport.firePropertyChange(PROP_DELETE, oldDelete, delete);
    }
}