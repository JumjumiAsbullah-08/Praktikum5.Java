# Praktikum5.Java
Pertemuan Ke 5 : PBO

package com.mycompany.nama_io;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;        

public class nama_IO {
    
    public static void main(String[] args) {
        
    
    BufferedReader namaIN = new BufferedReader(new InputStreamReader (System.in));
   
    //penginputan nama
    String nama = "";
    String NIM = "";
    String semester = "";
    String prodi = "";
    String alamat = "";
    
    System.out.println(" Input Nama  :");
    try{
        nama = namaIN.readLine();
       
        }
    catch (IOException e){
        System.out.println("Error!");
        }
    System.out.println( " Input NIM  :");
    try{
        NIM = namaIN.readLine();
       
        }
    catch (IOException e){
        System.out.println("Error!");
        }
    System.out.println(" Input semester  :");
    try{
        semester = namaIN.readLine();
       
        }
    catch (IOException e){
        System.out.println("Error!");
        }
    System.out.println(" Input Prodi  :");
    try{
        prodi = namaIN.readLine();
       
        }
    catch (IOException e){
        System.out.println("Error!");
        }
    System.out.println(" Input Alamat  :");
    try{
        alamat = namaIN.readLine();
       
        }
    catch (IOException e){
        System.out.println("Error!");
        }
    
    //output
    System.out.println("\n Nama Saya      :" +nama);
    System.out.println(" NIM Saya       :" +NIM);
    System.out.println(" Semester Saya  :" +semester);
    System.out.println(" Prodi Saya     :" +prodi);
    System.out.println(" Alamat Saya    :" +alamat);
    }
    
}
