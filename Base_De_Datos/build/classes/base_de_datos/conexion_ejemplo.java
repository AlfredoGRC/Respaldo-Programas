package base_de_datos;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion_ejemplo {
    
    Connection conex;
    
    
    public Connection conexion(){
        
     try{
     Class.forName("org.gjt.mm.mysql.Driver");
     conex = DriverManager.getConnection("jdbc:mysql://localhost/datos","root","");
     JOptionPane.showMessageDialog(null,"conectado");
     }
     catch(ClassNotFoundException | SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null,"error "+e);
         
     }
     return conex;
    } 
    
}
