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
package com.nurulhuda.dao.mysql;

import com.nurulhuda.dao.LoginDAO;
import com.nurulhuda.model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Office
 */
public class LoginDAOImpl implements LoginDAO {

    private Connection conn = null;

    public LoginDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Login o) throws SQLDataException {
        try {
            String sql = "insert into t_login(username,password) values(?,?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, o.getUsername());
            ps.setString(2, o.getPassword());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Login o) throws SQLDataException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(String id) throws SQLDataException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Login> getAll() throws SQLDataException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getUser(Login o) throws SQLException {
        int a = 0;
        String sql = "select * from t_login where username = ? and password = ?";
        PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setString(1, o.getUsername());
        ps.setString(2, o.getPassword());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            a = 1;
        }
        return a;
    }
}
