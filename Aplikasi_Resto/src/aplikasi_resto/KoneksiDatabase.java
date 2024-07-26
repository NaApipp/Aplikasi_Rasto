/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_resto;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Kataque
 */
public class KoneksiDatabase {
    private String url="jdbc:mysql://localhost:3306/database_resto";
    private String username="root";
    private String password="";
    private Connection con;
    
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("KONEKSI BERHASIL");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }
}
