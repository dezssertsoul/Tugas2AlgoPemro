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
        int jamLembur;
        double gajiPokok = 0;
        double gajiLembur = 0;
        double totalGaji;
        
        //Input Data
        System.out.println("Perhitungan Gaji Karyawan");
        System.out.print("Masukkan Golongan (A/B/C) : ");
        golongan = input.next().toUpperCase(); //Untuk mengubah input menggunakan huruf kapital
        System.out.print("Masukkan Jam Lembur: ");
        jamLembur = input.nextInt();
        System.out.println("------------------------");
        
        //Hitung Gaji Pokok
        if (golongan.equals("A")){
            gajiPokok = 5000000;
        } else if (golongan.equals("B")){
            gajiPokok = 6500000;
        } else if (golongan.equals("C")){
            gajiPokok = 9500000;
        } else {
            System.out.println("Error = Golongan Tidak Ada!");
            return;
        }
        
        //Hitung Gaji Lembur
        if (jamLembur == 1){
            gajiLembur = 0.30 * gajiPokok;
        } else if (jamLembur == 2){
            gajiLembur = 0.32 * gajiPokok;
        } else if (jamLembur == 3){
            gajiLembur = 0.34 * gajiPokok;
        } else if (jamLembur == 4){
            gajiLembur = 0.36 * gajiPokok;
        } else if (jamLembur >= 5){
            gajiLembur = 0.38 * gajiPokok;
        } else {
            System.out.println("Anda Salah Memasukkan Jam");
        }
        
        //Hitung Total Gaji
        totalGaji = gajiPokok + gajiLembur;
        
        //Output
        System.out.println("Total Gaji : Rp. " + String.format("%,.0f", totalGaji));
        
    }
    
}
