
package dao;
import Interfaces.GUI_fragmentacion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

public class FuncionesGUI 
{
    
    public void defTamTabla() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        GUI_fragmentacion vista =  new GUI_fragmentacion();
    }
    
    public void sizeTable(TableColumnModel columnModel)
    {
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(20);
        columnModel.getColumn(2).setPreferredWidth(20);
        columnModel.getColumn(3).setPreferredWidth(20);
        columnModel.getColumn(4).setPreferredWidth(10);
        //JOptionPane.showMessageDialog(null, "H");
    }
    
    
}

/*

public void sizeTable()
    {
        TableColumnModel columnModel = jTableRelacion.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(20);
        columnModel.getColumn(2).setPreferredWidth(20);
        columnModel.getColumn(3).setPreferredWidth(20);
        columnModel.getColumn(4).setPreferredWidth(20);
        JOptionPane.showMessageDialog(null, "H");
    }

*/
