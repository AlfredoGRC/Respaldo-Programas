package base_de_datos;
import java.sql.Connection;//librerias para conexion
import java.sql.DriverManager;

public class Base_De_Datos {

   Connection conectar= null;//intanciar conexion
   
   public Connection conexion(){//crear metodo de tipo conexion "connection"
       /*CRUD
       C = crear
       R = revisar
       U = actializar
       D = eliminar*/
       
       try{//una conexion siempre va a llevar un try carch
           Class.forName("com.mysql.jdbc.Driver");//encontrar el driver mysql-connection-java-5
           conectar = DriverManager.getConnection("jdbc:mysql://localhost/LCI","root","");//crear una variable de tipo conectar con lo que necesitas para crear una db 
           
       }
       catch(Exception e){
           System.out.println("Error " + e.getMessage());//retorna la exception o error
       }
       
      return conectar; 
   }
    
}