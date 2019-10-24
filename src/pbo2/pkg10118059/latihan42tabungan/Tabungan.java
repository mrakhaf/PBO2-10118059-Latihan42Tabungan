/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan42tabungan;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class Tabungan {
    private int saldo;
    Scanner input = new Scanner(System.in);
    
    public Tabungan(int saldo) {
        System.out.print("Masukkan Saldo Awal : ");
        saldo = input.nextInt();
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah){
        System.out.print("Jumlah Uang yang Diambil : ");
        jumlah = input.nextInt();
        int sisa = saldo-jumlah;
        
        System.out.println("Saldo Anda Sekarang : " + sisa);
        return sisa;
    }
}
