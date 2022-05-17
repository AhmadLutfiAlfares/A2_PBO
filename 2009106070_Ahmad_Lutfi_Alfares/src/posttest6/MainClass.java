/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author Hp GK
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainClass {
    public static void main(String[] args)throws IOException{
        Masuk sandi = new Masuk("Lutfi123");
        User lutfi = new User(sandi);
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        System.out.println("Yakin masuk ke Aplikasi?");
        System.out.println("1. Masuk ");
        System.out.println("2. Batal ");
        System.out.print("Pilih (1/2) : ");
        int Pilihan = Integer.valueOf(pilih.readLine());
        
        if(Pilihan == 1){
            lutfi.bukaAplikasi();
        }
        else if(Pilihan == 2){
            lutfi.batalBuka();
        }
        else{
            System.out.println("Pilihan salah!!");
        }
    }
}
