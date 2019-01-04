
package penjualanelektronik;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
     private static java.sql.Connection koneksi;
     
      public static java.sql.Connection getKoneksi(){
        if(koneksi == null){
          try{
              String url = "jdbc:mysql://localhost:3306/toko";
              String user = "root";
              String password = "";
              
              DriverManager.registerDriver(new com.mysql.jdbc.Driver());
              
              koneksi = DriverManager.getConnection(url, user, password);
          }catch(SQLException t){
              System.out.println("Error Membuat Koneksi");
          }  
        }
        return koneksi;

    }
}
