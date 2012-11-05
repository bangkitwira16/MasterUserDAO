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
package com.nurulhuda.model;

/**
 *
 * @author Office
 */
public class Login {

    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
