package dao;

import connection.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.descEntity;
import java.sql.ResultSetMetaData;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class consultarRelacionDAO {

    private ArrayList<String> pS = new ArrayList<String>();
    private int[] indicePS = new int[2];
    private int cont = 0;

    public consultarRelacionDAO() {
    }

    public List<String> consultarEntidades() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        conexion conector = new conexion();
        String query = "SHOW TABLES";
        PreparedStatement pS;
        ResultSet rS;
        List<String> entidades = new ArrayList<String>();

        conector.setBd("proyecto");
        conector.abrirConexion();

        pS = conector.getConect().prepareStatement(query);
        conector.getConect().setAutoCommit(false);

        rS = pS.executeQuery();

        conector.getConect().commit();

        while (rS.next()) {
            entidades.add(rS.getString(1));
        }
        System.out.println("Esto es lo que hay : " + entidades);

        conector.cerrarConexion();
        return entidades;
    }

    public List<descEntity> descEntidad(String entidad) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        conexion conector = new conexion();
        String query = "DESC ".concat(entidad);
        PreparedStatement pS;
        ResultSet rS;
        List<descEntity> desc = new ArrayList<>();

        conector.setBd("proyecto");
        conector.abrirConexion();

        pS = conector.getConect().prepareStatement(query);
        conector.getConect().setAutoCommit(false);

        /*pS.setString(1, entidad);
        System.out.println("entidad: " + pS);*/
        rS = pS.executeQuery();
        conector.getConect().commit();

        while (rS.next()) {
            desc.add(new descEntity(rS.getString(1), rS.getString(2), rS.getString(3), rS.getString(4), rS.getString(5), rS.getString(6)));
        }

        conector.cerrarConexion();
        return desc;
    }

    public String verificarConsulta(String tabla, String condicion1, int estado1, String condicion2, int estado2) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        conexion conector = new conexion();
        PreparedStatement pS;
        ResultSet rS;
        int numRes = 0;
        String query;
        String con1, con2;
        if (estado1 == 0) {
            con1 = condicion1;
        } else {
            con1 = " not " + condicion1;
        }
        if (estado2 == 0) {
            con2 = condicion2;
        } else {
            con2 = " not " + condicion2;
        }
        /*Verificar si es un entero o una cadena*/
        query = "SELECT COUNT(*) AS cuenta FROM " + tabla + " where   " + con1 + " and " + con2;
        System.out.println(query);
        conector.setBd("proyecto");
        conector.abrirConexion();

        pS = conector.getConect().prepareStatement(query);
        conector.getConect().setAutoCommit(false);

        System.out.println("\n query: " + pS);

        rS = pS.executeQuery();
        conector.getConect().commit();

        if (rS.next()) {
            numRes = rS.getInt("cuenta");
        }

        System.out.println("numRes: " + numRes);
        rS.close();
        conector.cerrarConexion();

        return numRes + ":" + con1 + ":" + con2;
    }

    public int verificarConsulta(String entidad, String atributo, String operador, String valor, int op) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        conexion conector = new conexion();
        PreparedStatement pS;
        ResultSet rS;
        int numRes = 0;
        String query;

        System.out.println("op: " + op);
        /*Verificar si es un entero o una cadena*/
        if (op == 1) {
            query = "SELECT COUNT(*) AS cuenta FROM " + entidad + " WHERE " + atributo + " " + operador + " " + valor;
        } else {
            query = "SELECT COUNT(*) AS cuenta FROM " + entidad + " WHERE " + atributo + " " + operador + " " + valor + "";
        }

        conector.setBd("proyecto");
        conector.abrirConexion();

        pS = conector.getConect().prepareStatement(query);
        conector.getConect().setAutoCommit(false);

        /*pS.setString(1, entidad);
        pS.setString(2, atributo);
        pS.setString(3, operador);
        pS.setString(4, valor);*/
        System.out.println("\n query: " + pS);

        rS = pS.executeQuery();
        conector.getConect().commit();

        if (rS.next()) {
            numRes = rS.getInt("cuenta");
        }

        System.out.println("numRes: " + numRes);
        rS.close();
        conector.cerrarConexion();
        return numRes;
    }

    public void registrarPredicadoS(String relacion, String atributo, String operador, String valor) {
        String predicadoS = relacion + ": " + atributo + " " + operador + " " + valor;
        pS.add(predicadoS);
        System.out.println("\n pS: " + pS);
    }

    public String validarFragmentosM(int indicePS, String PS) {
        System.out.println("Indice: " + indicePS + " predicadoSimple: " + PS);
        this.indicePS[cont] = indicePS;
        if (cont >= 1) {
            cont = 0;
        }
        cont++;
        return this.pS.get(indicePS);
    }

    public void crearFragmento(String sitio, String base, String query, String query2,String tabla,String tablanueva) {
        System.out.println("base:" + base);
        try {
            ResultSet rS;
            conexion conector = new conexion(sitio);
            PreparedStatement pS;
            conector.setBd(base);
            conector.abrirConexion();
            pS = conector.getConect().prepareStatement(query);
            conector.getConect().setAutoCommit(false);
            pS.execute();
            conector.getConect().commit();
            //crear la nueva tabla
            if (sitio.equals("localhost")) {
                String consulta="insert into "+tablanueva +" (" +query2 +") ( select "+query2+ " from  proyecto."+tabla+")";
                System.out.println(query2);
                System.out.println(consulta);
                pS = conector.getConect().prepareStatement(consulta);
                conector.getConect().setAutoCommit(false);
                pS.execute();
                conector.getConect().commit();
                //inserta en localhost
            } else {
                System.out.println("yeahbby");
                conexion conector2 = new conexion("localhost");
                conector2.setBd(base);
                conector2.abrirConexion();
                System.out.println("yeahbby2");
             String queryto = " (Select "+ query2+" from  proyecto." + tabla + ")";
                System.out.println(queryto);
            pS = conector2.getConect().prepareStatement(queryto);
            conector.getConect().setAutoCommit(false);
            rS = pS.executeQuery();
            ResultSetMetaData rsmd = rS.getMetaData();
            int numcolumn = rsmd.getColumnCount();
            System.out.println("cuantos:" + numcolumn);
            String meta = "";
            for (int i = 1; i <= numcolumn; i++) {
                System.out.println(rsmd.getColumnName(i));
                meta += rsmd.getColumnName(i);
                if (i != 0 && i != numcolumn) {
                    meta += " , ";
                }
            }
            while (rS.next()) {
                String querytin = "insert into " + tablanueva + "( " + meta + " ) values (";
                //VARCHAR -INT-DOUBLE
                for (int i = 1; i <= numcolumn; i++) {
                    String valors;
                    Integer valori;
                    Double valord;
                    String tipo = rsmd.getColumnTypeName(i);
                    if (i != 1 && i != numcolumn + 1) {
                        querytin += " , ";
                    }
                    if (tipo.equals("VARCHAR")) {
                        querytin += " ' ";
                        valors = rS.getString(i);
                        querytin += valors;
                        querytin += " ' ";
                    } else if (tipo.equals("INT")) {
                        valori = rS.getInt(i);
                        querytin += valori;
                    } else {
                        valord = rS.getDouble(i);
                        querytin += valord;
                    }
                }
                querytin += ")";
                System.out.println(querytin);
                pS = conector.getConect().prepareStatement(querytin);
                conector.getConect().setAutoCommit(false);
                pS.execute();
                System.out.println(querytin);
                conector.getConect().commit();
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(consultarRelacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(consultarRelacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(consultarRelacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(consultarRelacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarASitio(String sitio, String base, String tabla, String quer) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        conexion conector = new conexion(sitio);
        PreparedStatement pS;
        ResultSet rS;
        conector.setBd(base);
        conector.abrirConexion();
        if (sitio.equals("localhost")) {
            String query = "insert into " + tabla + " (Select  * from  proyecto." + tabla + " where " + quer + ")";
            System.out.println(query);
            pS = conector.getConect().prepareStatement(query);
            conector.getConect().setAutoCommit(false);
            pS.execute();
            conector.getConect().commit();
        } else {
            System.out.println("yeahbby");
            conexion conector2 = new conexion("localhost");
            conector2.setBd(base);
            conector2.abrirConexion();
            System.out.println("yeahbby2");
            String query2 = " (Select distinct * from  proyecto." + tabla + " where " + quer + ")";
            pS = conector2.getConect().prepareStatement(query2);
            conector.getConect().setAutoCommit(false);
            rS = pS.executeQuery();
            ResultSetMetaData rsmd = rS.getMetaData();
            int numcolumn = rsmd.getColumnCount();
            System.out.println("cuantos:" + numcolumn);
            String meta = "";
            for (int i = 1; i <= numcolumn; i++) {
                System.out.println(rsmd.getColumnName(i));
                meta += rsmd.getColumnName(i);
                if (i != 0 && i != numcolumn) {
                    meta += " , ";
                }
            }
            System.out.println("que pedooooooooooo");
            while (rS.next()) {
                String queryto = "insert into " + tabla + "( " + meta + " ) values (";
                //VARCHAR -INT-DOUBLE
                for (int i = 1; i <= numcolumn; i++) {
                    String valors;
                    Integer valori;
                    Double valord;
                    String tipo = rsmd.getColumnTypeName(i);
                    if (i != 1 && i != numcolumn + 1) {
                        queryto += " , ";
                    }
                    if (tipo.equals("VARCHAR")) {
                        queryto += " ' ";
                        valors = rS.getString(i);
                        queryto += valors;
                        queryto += " ' ";
                    } else if (tipo.equals("INT")) {
                        valori = rS.getInt(i);
                        queryto += valori;
                    } else {
                        valord = rS.getDouble(i);
                        queryto += valord;
                    }
                }
                queryto += ")";

                pS = conector.getConect().prepareStatement(queryto);
                conector.getConect().setAutoCommit(false);
                pS.execute();
                System.out.println(queryto);
                conector.getConect().commit();
            }
            conector.cerrarConexion();
            conector2.cerrarConexion();
        }
        /*pS.setString(1, entidad);
        System.out.println("entidad: " + pS);*/

    }

    public void eliminar(String sitio, String base, String tabla, String quer) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        {
            conexion conector = new conexion(sitio);
            PreparedStatement pS;
            ResultSet rS;

            conector.setBd(base);
            conector.abrirConexion();
            String queryto = "delete from " + tabla;
            System.out.println(queryto);
            pS = conector.getConect().prepareStatement(queryto);
            conector.getConect().setAutoCommit(false);
            pS.execute();
            conector.getConect().commit();
            conector.cerrarConexion();
        }

    }
}
