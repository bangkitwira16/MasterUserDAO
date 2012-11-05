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
package com.nurulhuda.dao;

import com.nurulhuda.model.Login;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Office
 */
public interface LoginDAO {
    void insert(Login o)throws SQLDataException;
    void update(Login o)throws SQLDataException;
    void delete(String id)throws SQLDataException;
    int getUser(Login o)throws SQLException;
    List<Login> getAll()throws SQLDataException;
}
