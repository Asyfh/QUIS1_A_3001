/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main_21103001;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *21003001
 * @author Aisyah Fitri Hidayati
 * S1SI05A
 */

public class Quis_A_3001 {

    public static void main(String[] args) {
        Mahasiswa_3001 A = new Mahasiswa_3001();
        Mahasiswa_3001 B = new Mahasiswa_3001();
        Dosen_3001 C = new Dosen_3001();
        Dosen_3001 D = new Dosen_3001();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("NIK     : ");
            A.NIK_3001 = br.readLine();
            System.out.println("Nama    : ");
            A.nama_3001 = br.readLine();
            System.out.println("Umur    : ");
            A.umur_3001 = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            A.alamat_3001 = br.readLine();
            System.out.println("NIM     : ");
            A.nim_3001 = br.readLine();
            System.out.println("IPK     : ");
            A.ipk_3001 = Float.parseFloat(br.readLine());
            System.out.println();
            
            System.out.println("NIK     : ");
            B.NIK_3001 = br.readLine();
            System.out.println("Nama    : ");
            B.nama_3001 = br.readLine();
            System.out.println("Umur    : ");
            B.umur_3001 = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            B.alamat_3001 = br.readLine();
            System.out.println("NIM     : ");
            B.nim_3001 = br.readLine();
            System.out.println("IPK     : ");
            B.ipk_3001 = Float.parseFloat(br.readLine());
            System.out.println();
            
            System.out.println("NIK             : ");
            C.NIK_3001 = br.readLine();
            System.out.println("Nama            : ");
            C.nama_3001 = br.readLine();
            System.out.println("Umur            : ");
            C.umur_3001 = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            C.alamat_3001 = br.readLine();
            System.out.println("NIDN            : ");
            C.NIDN_3001 = br.readLine();
            System.out.println("Golongan        : ");
            C.gol_3001 = br.readLine();
            System.out.println("Gaji Pokok      : ");
            C.gajiPokok_3001 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("NIK             : ");
            D.NIK_3001 = br.readLine();
            System.out.println("Nama            : ");
            D.nama_3001 = br.readLine();
            System.out.println("Umur            : ");
            D.umur_3001 = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            D.alamat_3001 = br.readLine();
            System.out.println("NIDN            : ");
            D.NIDN_3001 = br.readLine();
            System.out.println("Golongan        : ");
            D.gol_3001 = br.readLine();
            System.out.println("Gaji Pokok      : ");
            D.gajiPokok_3001 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("==== DATA MAHASISWA ====");
            A.tampilDataMahasiswa();
            A.tampilDataBeasiswa();
            System.out.println("");
            B.tampilDataMahasiswa();
            B.tampilDataBeasiswa();
            System.out.println("====== DATA DOSEN ======");
            C.tampilDataDosen();
            System.out.println("Total Pendapatan    : Rp "+C.totalPendapatan());
            System.out.println("");
            System.out.println("Total Pendapatan    : Rp "+D.totalPendapatan());
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    }
    