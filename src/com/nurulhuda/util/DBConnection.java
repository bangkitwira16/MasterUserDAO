/*
 *  DILARANG MENGUBAH ATAU MENGHAPUS HAK CIPTA INI.
 * 
 *  Hak Cipta 2012 Nurul Huda Mustaqim.
 * 
 *  Semua isi dalam file ini adalah hak milik dari Nurul Huda Mustaqim.
 *  Anda tak diperkenankan untuk menggunakan file atau mengubah file ini
 *  kecuali Anda tidak menghapus atau merubah hak cipta ini.
 * 
 *  Pemilik tidak bertanggung jawab jika Anda menyalah gunakan file ini
 *  dan Pemilik TIDAK MENJAMIN apapun atas file ini.
 * 
 *  Anda bisa menghubungi pemilik hak cipta ini di :
 *  email : kevinmustaqim@gmail.com
 *  fb  : http://www.facebook.com/nurulhudamustaqim
 *  ym : office_404
 */
package com.nurulhuda.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Office
 */
public class DBConnection {
    private Connection conn = null;
    private static DBConnection dbConn = null;
    static final String DB_URL="jdbc:mysql://localhost:3306/java_akhir";
    static final String DB_USER = "root";
    static final String DB_PASS="";

    public DBConnection() {
        if(conn==null){
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            } catch (Exception e) {
            }
        }
    }
    
    public static DBConnection getInstance(){
        DBConnection conn = null;
        if(dbConn==null){
            dbConn = new DBConnection();
            conn = dbConn;
        }else{
            conn = dbConn;
        }
        return conn;
    }
    //mengambil koneksi
    public Connection getConn()throws SQLException{
        return this.conn;
    }
    
}
