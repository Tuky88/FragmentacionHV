
package connection;

import java.sql.*;

public class conexion 
{
    private Connection conect;
    private String user;
    private String password;
    private String path;
    private String bd;
    
    public conexion()
    {
        this(null, "root", "root", "jdbc:mysql://localhost/", null);
    }
        public conexion(String place)
    {
        this(null, "root", "root", "jdbc:mysql://"+place+"/", null);
    }

    public conexion(Connection conect, String user, String password, String path, String bd)
    {
        this.conect = conect;
        this.user = user;
        this.password = password;
        this.path = path;
        this.bd = bd;
    }

    public Connection getConect() 
    {
        return conect;
    }

    public void setConect(Connection conect) 
    {
        this.conect = conect;
    }

    public String getUser() 
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPath() 
    {
        return path;
    }

    public void setPath(String path) 
    {
        this.path = path;
    }

    public String getBd() 
    {
        return bd;
    }

    public void setBd(String bd) 
    {
        this.bd = bd;
    }
    
    private void cargarDriver() throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        Class.forName("org.gjt.mm.mysql.Driver").newInstance();
    }
    
    public void abrirConexion() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        cargarDriver();
        
        conect = DriverManager.getConnection(path + bd, user, password);
        System.out.println("\n Conexión exitosa a la base de datos: " + this.bd);
    }
    
    public void cerrarConexion() throws SQLException
    {
        conect.close();
        System.out.println("\n Conexion de la base de datos: " + this.bd + " cerrada ");
    }
    
    public void destruir()
    {
        this.conect = null;
        this.user = null;
        this.password = null;
        this.path = null;
        this.bd = null;
        System.gc();
    }
    
    @Override
    public String toString()
    {
        return "Conexión: " + conect + "\n"
                + "Usuario: " + user + "\n"
                + "Contraseña: " + password + "\n"
                + "Dirección URL: " + path + "\n"
                + "Base de datos: " + bd + "\n";
    }

}
