//Gracia Anggreini Fitaloka Hutagaol - 12S25001
import java.util.*;
import java.lang.Math;

public class TLAST {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] judul = new String[10], kode = new String[10], matakuliah = new String[10], dosen = new String[10], deadline = new String[10], deskripsi = new String[10], status = new String[10];
        int[] tingkatkesulitan = new int[10], harihinggadeadline = new int[10];
        double[] prioritas = new double[10];
        String perintah, kodeupdate, statusbaru;
        int i, j;

        // while (Conditional) {
            perintah = input.nextLine();
            if (perintah.equals("add task")) {
                judul[10] = input.nextLine();
                kode[10] = input.nextLine();
                matakuliah[10] = input.nextLine();
                dosen[10] = input.nextLine();
                deadline[10] = input.nextLine();
                deskripsi[10] = input.nextLine();
                tingkatkesulitan[10] = Integer.parseInt(input.nextLine());
                harihinggadeadline[10] = Integer.parseInt(input.nextLine());
                status[10] = input.nextLine();
                prioritas[10] = hitungprioritas(tingkatkesulitan[10], harihinggadeadline[10]);
                jumlahtugas = jumlahtugas + 1;
            } else {
                if (perintah.equals("update task status")) {
                    kodeupdate = input.nextLine();
                    statusbaru = input.nextLine();
                    int i;

                    i = 0;
                    while (i < jumlahtugas) {
                    }
                }
            }
        // }
    }
    
    public static double hitungprioritas(int kesulitan, int hari) {
        double hasil;

        hasil = kesulitan * 1.0 / hari;
        
        return hasil;
    }
}

