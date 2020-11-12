/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan49.BiayaEmasKawin;

/**
 *
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program Emas Kawin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas objEmas = new Emas();
        objEmas.setEmas(15.7);
        System.out.println("Hendi akan membeli emas kawin sebagai mahar nikahnya");
        System.out.println("dengan total seberat "+ objEmas.getEmas()+" gram. Jika harga 1 gram emas");
        System.out.println("per bulan Oktober ini adalah Rp.570000 . Berapa Total");
        System.out.println("bayar yang harus dikeluaran Hendi ?");
        System.out.println("======================================================");
        System.out.println("Jadi Hendi harus membayar Rp."+ objEmas.totalHargaEmas());
        
    }
    
}
