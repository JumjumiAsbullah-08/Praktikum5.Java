# Praktikum5.Java
Pertemuan Ke 5 : PBO

package com.mycompany.masukkan;
import java.util.Scanner;

public class masuk {

    public static void main(String[] args) {
        
        Scanner msk = new Scanner (System.in);
        
        for(int i = 0; i<=10; i++){
        System.out.println(" Masukkan Sebuah Angka :");
        i = msk.nextInt();
        
        System.out.println(" Angka yang Anda masukkan: " +i);   
    } 
    }
}
