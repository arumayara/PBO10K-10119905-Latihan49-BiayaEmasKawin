/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan49.BiayaEmasKawin;

/**
 *
 * @author aruma
 */
public class Emas {
    private double beratEmas;
    
    public void setEmas(double beratEmas){
        this.beratEmas=beratEmas;
    }
    public double getEmas(){
        return beratEmas;
    }
    
    public double totalHargaEmas(){
        return 570000*beratEmas;
    }
}
