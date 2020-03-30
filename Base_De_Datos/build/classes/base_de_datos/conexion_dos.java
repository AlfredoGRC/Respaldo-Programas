package base_de_datos;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion_dos {//metodo de tipo conexion

    Connection conexio = null; //declaramos una variable de tipo conexion
    
    public Connection conex(){
        
        try{
            Class.forName("org.gjt.mm.mysql.Driver");//uso de driver
            //ls variable conexion toma el valor de los parametos conexion
            //JDBC = java data base conectivity(host, db, usuatio, contraseña)
            //localhost = direccion local
            conexio = DriverManager.getConnection("jdbc:mysql://host/escuela","root","");
            JOptionPane.showMessageDialog(null,"conectado");//mensaje de conexion correcta            
        }
        catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"error"+ e);
        }
        return conexio;
    }   
}