# Praktikum5.Java
Pertemuan Ke 5 : PBO

package com.mycompany.nama_swing;
import javax.swing.*;

public class nama_SWING {
    public static void main(String[] args) {
        
       
        String nama = JOptionPane.showInputDialog(null, "Input Nama","Informasi Nama", JOptionPane.WARNING_MESSAGE);
        String NIM = JOptionPane.showInputDialog(null, "Input NIM","Informasi NIM", JOptionPane.WARNING_MESSAGE);
        String semester = JOptionPane.showInputDialog(null, "Input Semester","Informasi Semester", JOptionPane.WARNING_MESSAGE);
        String prodi = JOptionPane.showInputDialog(null, "Input Prodi","Informasi Prodi", JOptionPane.WARNING_MESSAGE);
        String alamat = JOptionPane.showInputDialog(null, "Input Alamat","Informasi Alamat", JOptionPane.WARNING_MESSAGE);
        
        //output
        
        String p =  " Perkenalkan Nama Saya : " +nama;
        String pe =  " NIM : " +NIM;
        String pes =  " Semester : " +semester;
        String pesa =  " Prodi   : " +prodi;
        String pesan =  " Alamat : " +alamat;
        
        JOptionPane.showMessageDialog(null,p);
        JOptionPane.showMessageDialog(null,pe);
        JOptionPane.showMessageDialog(null,pes);
        JOptionPane.showMessageDialog(null,pesa);
        JOptionPane.showMessageDialog(null,pesan);
    }
    
}
