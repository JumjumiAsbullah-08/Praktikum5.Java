# Praktikum5.Java
Pertemuan Ke 5 : PBO


package com.mycompany.nama_util;
import java.util.Scanner;
public class nm_util {

    public static void main(String[] args) {
       String nama,nim,semester,prodi,alamat;
        
        Scanner input = new Scanner(System.in);
        System.out.println(" Input Nama     : " );
        nama = input.nextLine();
        System.out.println(" Input NIM      : ");
        nim = input.nextLine();
        System.out.println(" Input Semester : ");
        semester = input.nextLine();
        System.out.println(" Input Prodi    : ");
        prodi = input.nextLine();
        System.out.println(" Input Alamat   : ");
        alamat = input.nextLine(); 
        
        
        System.out.println("\n  Perkenalkan nama Saya : " +nama);
        System.out.println("  NIM                   : " +nim);
        System.out.println("  Semester              : " +semester);
        System.out.println("  Prodi                 : " +prodi);
        System.out.println("  Alamat                : " +alamat);
    } 
}
