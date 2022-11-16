/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_21103001;

/**
 *21003001
 * @author Aisyah Fitri Hidayati
 * S1SI05A
 */
public class Dosen_3001 extends Penduduk_3001 {
    String NIDN_3001,gol_3001;
    int gajiPokok_3001,tunjangan_3001;
    double gajitotal_3001;
    
    public double totalPendapatan(){
        switch(gol_3001){
            case "IIIA":
                tunjangan_3001 = 300000;
            break;
            case "IIIB":
                tunjangan_3001 = 500000;
            break;
            case "IIIC":
                tunjangan_3001 = 700000;
            break;
        }
        gajitotal_3001 = gajiPokok_3001 + tunjangan_3001;
        return gajitotal_3001;
    }
    public void tampilDataDosen(){
        tampilDataPenduduk();
        System.out.println("NIDN        : "+NIDN_3001);
        System.out.println("Golongan    : "+gol_3001);
        System.out.println("Gaji Pokok  : "+gajiPokok_3001);
    }
}