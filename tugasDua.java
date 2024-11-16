//Nama : DanisyahRizky
//NIM : 049881583

import java.text.DecimalFormat;
import java.util.Scanner;

public class tugasDua {

    public static void main(String[] args) {
        Scanner inputGolongan = new Scanner(System.in);
        System.out.println("Masukkan jenis golongan (A/B/C) : ");
        String golongan = inputGolongan.nextLine().toUpperCase();

        Scanner inputLembur = new Scanner(System.in);
        System.out.println("Masukkan jumlah jam lembur : ");
        int lembur = inputLembur.nextInt();

        
        double gajiGolongan = 0;
        double gajiLembur = 0;

        //Jumlah gaji sesuai golongan
        if (golongan.equals("A")) {
            gajiGolongan = 5000000;
        }else if (golongan.equals("B")){
            gajiGolongan = 6500000;
        }else if (golongan.equals("C")) {
            gajiGolongan = 9500000;
        }else {
            System.out.println("Golongan tidak terdaftar");
        }


        //Menghitung jumlah gaji lembur
        if (lembur == 1) {
            gajiLembur = gajiGolongan * 0.30;
        }else if (lembur == 2){
            gajiLembur = gajiGolongan * 0.32;
        }else if (lembur == 3){
            gajiLembur = gajiGolongan * 0.34;
        }else if (lembur == 4){
            gajiLembur = gajiGolongan * 0.36;
        }else if (lembur >= 5){
            gajiLembur = gajiGolongan * 0.38;
        }else {
            System.out.println("ERROR");
        }

        //Menghitung total gaji
        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("Gaji Golongan : " + df.format(gajiGolongan));
        System.out.println("Gaji Lembur   : " + df.format(gajiLembur));
        System.out.println("Total Gaji    : " + df.format(gajiGolongan + gajiLembur));

        inputGolongan.close();
        inputLembur.close();
    }
}
