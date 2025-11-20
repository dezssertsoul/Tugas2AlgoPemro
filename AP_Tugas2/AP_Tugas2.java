/*
*/
package tugas2_ap;

import java.util.Scanner;
/**
 *
 * @author Echaa Aditya
 */
public class Tugas2_AP {

    /**
     */
    public static void main(String[] args) {
        //Deklarasi Variabel
        Scanner input = new Scanner(System.in);
        String golongan;
        int JamLembur;
        double GajiPokok = 0;
        double GajiLembur = 0;
        double TotalGaji;
        
        //Input Data
        System.out.println("Perhitungan Gaji Karyawan");
        System.out.print("Masukkan Golongan (A/B/C) : ");
        golongan = input.next().toUpperCase(); //Untuk mengubah input menggunakan huruf kapital
        System.out.print("Masukkan Jam Lembur: ");
        JamLembur = input.nextInt();
        System.out.println("------------------------");
        
        //Hitung Gaji Pokok
        if (golongan.equals("A")){
            GajiPokok = 5000000;
        } else if (golongan.equals("B")){
            GajiPokok = 6500000;
        } else if (golongan.equals("C")){
            GajiPokok = 9500000;
        } else {
            System.out.println("Error = Golongan Tidak Valid!");
            return;
        }
        
        //Hitung Gaji Lembur
        if (JamLembur == 1){
            GajiLembur = 0.30 * GajiPokok;
        } else if (JamLembur == 2){
            GajiLembur = 0.32 * GajiPokok;
        } else if (JamLembur == 3){
            GajiLembur = 0.34 * GajiPokok;
        } else if (JamLembur == 4){
            GajiLembur = 0.36 * GajiPokok;
        } else if (JamLembur >= 5){
            GajiLembur = 0.38 * GajiPokok;
        } else {
            System.out.println("Salah Memasukkan Jam");
        }
        
        //Hitung Total Gaji
        TotalGaji = GajiPokok + GajiLembur;
        
        //Output
        System.out.println("Total Gaji : Rp. " + String.format("%,.0f",TotalGaji));
        
    }
    
}
