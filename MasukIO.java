# Praktikum5.Java
Pertemuan Ke 5 : PBO

package com.mycompany.masukio;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class MasukIO {

    public static void main(String[] args) {
        
        for(int i = 0; i<10; i++){
        BufferedReader dataIN = new BufferedReader(new InputStreamReader (System.in));
        String angka = "";
        System.out.println(" Input Angka : ");
        try{
            angka = dataIN.readLine();
        }
        catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println(" Angka " +angka);
    }
    }
}
