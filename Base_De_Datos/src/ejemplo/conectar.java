package ejemplo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectar {
    
    String mensaje = "error en la base de datos";
    Connection conec = null;//crear objeto de tipo Connection
    
    
            public Connection conectar(){//metodo de tipo Connetion
              
                try{
                    Class.forName("org.gjt.mm.mysql.Driver");//Driver
                    conec = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo", "root","");
                    JOptionPane.showMessageDialog(null,"conectado");
                }
                catch(ClassNotFoundException | SQLException | HeadlessException e){
                    JOptionPane.showMessageDialog(null,mensaje + e);
                }
                return conec;
                
            }
    
}
