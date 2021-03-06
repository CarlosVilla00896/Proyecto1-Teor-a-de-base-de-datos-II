package Classes;
import Panels.DDL;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import test.Conexion;
/**
 *
 * @author PC
 */
public class QueryManager {
    
    Conexion c;
    DDL ddl;
    public Connection cx;
    ResultSet result;
    public Statement s;
    PreparedStatement psInsertTable_values, psEditTable_values, psDeleteTable_values, psEditTable, psDeleteTable;
    String answer;
    public String labelArr [];
    
    public QueryManager(){
        c = new Conexion();
        ddl = new DDL();
    }
    
    public boolean executeMethod(String sql){
        try{
            cx = c.conectar();
            s = cx.createStatement();
            s.execute("SET SCHEMA TEST");
            System.out.println("El string en execute dice: "+sql);
            //ddl.setSql(sql);
            s.execute(sql);
            
            c.desconectar();
            s.close();
            cx.close();
        }catch (Throwable e){
            System.out.println("...exception Thrown");
            e.printStackTrace(System.out);
            return false;
        }
        System.out.println("Accion ejecutada correctamente");
        return true;
    }
    
    public boolean executeUpdate(String sql){
        try{
            cx = c.conectar();
            s = cx.createStatement();
            s.execute("SET SCHEMA TEST");
            s.executeUpdate(sql);
            
                        
            c.desconectar();
            s.close();
            cx.close();
            System.out.println("Se completo el execute update");
            
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("No se completo el execute update");
            return false;
        }
        return true;
    }
    public boolean validarTabla(){
        try{
            //code here
        }catch(Throwable e){
            //code here
            return false;
        }
        //code here
        return true;
    }
    
    public ResultSet executeQuery(String sql){
        
        try{
            cx = c.conectar();
            s = cx.createStatement();
            s.execute("SET SCHEMA TEST");
            System.out.println("Query del resultset: "+sql);
            //ddl.setSql(sql);
            result = s.executeQuery(sql);
            
            System.out.println("Se pudo obtener el resultset!");
        }catch(Throwable e){
            System.out.println("No se obtuvo la tabla");
            return null;
        }
        return result;
    }
    
    public void setComboBoxDataColumn(JComboBox combo,String sql ){
        try{
            DefaultComboBoxModel comboModel = new DefaultComboBoxModel(); 
            ResultSet rs = this.executeQuery(sql);
            ResultSetMetaData meta = rs.getMetaData();
            int cantColumn = meta.getColumnCount();
            
            this.labelArr = new String [cantColumn];
            System.out.println("Cant columnas combobox: "+cantColumn);
            for(int i=1; i<= cantColumn;i++){
                comboModel.addElement(meta.getColumnLabel(i));
                this.labelArr[i-1] = meta.getColumnTypeName(i);
                System.out.println("tipo: "+this.labelArr[i-1]);
            }
            
            combo.setModel(comboModel);
            rs.close();
            this.s.close();
            this.cx.close();
            this.c.desconectar();
            System.out.println("Funciona combomodel");
        }catch(Throwable e){
            e.printStackTrace();
            System.out.println("No funciona combomodel");
        }
    }
    
    public void setComboBoxDataRows(JComboBox combo,String sql){
        try{
            DefaultComboBoxModel comboModel = new DefaultComboBoxModel(); 
            ResultSet rs = this.executeQuery(sql);
            ResultSetMetaData meta = rs.getMetaData();
            int cantColumn = meta.getColumnCount();
            
            this.labelArr = new String [cantColumn];
            System.out.println("Cant columnas combobox rows: "+cantColumn);
            String row[] = new String[cantColumn];
            
            while(rs.next()){
                for(int i=0; i<cantColumn; i++){
                    row[i] = rs.getObject(i+1).toString();
                    System.out.println(row);
                }
                comboModel.addElement(row);
            }
            
            combo.setModel(comboModel);
            rs.close();
            this.s.close();
            this.cx.close();
            this.c.desconectar();
            System.out.println("Funciona combomodel row");
        }catch(Throwable e){
            e.printStackTrace();
            System.out.println("No funciona combomodel row");
        }
    }

    public void seTableData(JTable table, String sql){
        try{
            DefaultTableModel dataModel = new DefaultTableModel();
            ResultSet rs = this.executeQuery(sql);
            ResultSetMetaData meta = rs.getMetaData();
            int cantColumn = meta.getColumnCount();
            //this.setComboBoxDataColumn(meta, cantColumn);
            
            for(int i=1; i<=cantColumn;i++){
                dataModel.addColumn(meta.getColumnLabel(i));
            }
            Object row[] = new Object[cantColumn];
            
            while(rs.next()){
                for(int i=0; i<cantColumn; i++){
                    row[i] = rs.getObject(i+1);
                }
                dataModel.addRow(row);
            }
            table.setModel(dataModel);
            rs.close();
            this.s.close();
            this.cx.close();
            this.c.desconectar();
            System.out.println("todo macizo al insertar datos");
        }catch(Throwable e){
            System.out.println("Hubo un problema");
            e.printStackTrace();
        }
    }
}

        