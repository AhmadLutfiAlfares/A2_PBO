/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

/**
 *
 * @author Hp GK
 */
public class Masuk implements Aplikasi{
    private static String sandi;
    
    public Masuk(String sandi){
        this.sandi = sandi;
    }

    public String getSandi() {
        return sandi;
    }

    public void setSandi(String sandi) {
        this.sandi = sandi;
    }

    @Override
    public void bukaAplikasi() throws IOException{
        String sandi;
        ArrayList<Masuk> masuk = new ArrayList<Masuk>();
        masuk.add(new Masuk("Lutfi123"));
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan sandi : ");
        sandi = inputan.nextLine();
        if (sandi.equals(this.getSandi())){
            System.out.println("Aplikasi bisa diakses!");
            Sistem.Sistem();
        } else{
            System.out.println("Sandi salah!");
        }
    }

    @Override
    public void batalBuka() {
        System.out.println("Gagal Buka Aplikasi!");
    }
}
