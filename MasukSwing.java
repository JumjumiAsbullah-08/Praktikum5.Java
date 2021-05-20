# Praktikum5.Java
Pertemuan Ke 5 : PBO

package com.mycompany.masukswing;
import javax.swing.*;
        
public class javaxSwings {

   
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
        String angka = " ";
        angka =  JOptionPane.showInputDialog (" Input Angka ");
        String pesan =  " Angka yang Anda Input : " +angka;
        JOptionPane.showMessageDialog(null, pesan);
        }
    for(int j = 1; j<=10; j++){
    String psn = " Angka yang diInput : " +j;
    JOptionPane.showMessageDialog(null, psn);
    }
    String pesan = " Terima Kasih ";
    JOptionPane.showMessageDialog(null, pesan);
        }
}


