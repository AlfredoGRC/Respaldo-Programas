package enrique;

import java.sql.Connection;//liberias 
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;

public class conexion {//clase 
    
    Connection conec; //crear objeto de tipo connection
 
    public Connection conectar(){
        
        try{Class.forName("org.gjt.mm.mysql.Driver");//para que encuntre el Driver 
        conec = DriverManager.getConnection("jdbc:mysql://localhost/alumnos","root","");
            
            JOptionPane.showMessageDialog(null,"base de datos conectada");
        }
        catch(ClassNotFoundException | SQLException | HeadlessException e){JOptionPane.showMessageDialog(null,"error al conectar " +e);          
        }
        return conec;   
}
}