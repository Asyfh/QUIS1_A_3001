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
public class Mahasiswa_3001 extends Penduduk_3001{
    String nim_3001;
    float ipk_3001;
    
    public void tampilDataMahasiswa(){
        tampilDataPenduduk();
        System.out.println("NIM     : "+nim_3001);
        System.out.println("IPK     : "+ipk_3001);
    }
    public void tampilDataBeasiswa(){
        if(ipk_3001 > 3.5){
            System.out.println("Mahasiswa bernama "+ nama_3001 +" berhak mendapatkan beasiswa");
        }else{
            System.out.println("Mahasiswa bernama "+ nama_3001 +" tidak berhak mendapatkan beasiswa");
        }
    }
}




