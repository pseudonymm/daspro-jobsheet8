import java.util.Scanner;

public class Tugas304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1.");
            }
        } while (jumlahToko < 1);

        int totalSemua = 0;
        int barangTerbanyak = -1;
        int tokoTerbaik = 0;
        String ringkasanToko = "";

        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.println("Toko " + toko);
            int pelanggan;
            do {
                System.out.print("Jumlah pelanggan: ");
                pelanggan = sc.nextInt();
                if (pelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif.");
                }
            } while (pelanggan < 0);

            int totalBarang = 0;
            for (int p = 1; p <= pelanggan; p++) {
                int barang;
                do {
                    System.out.print("Barang pelanggan " + p + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif.");
                    }
                } while (barang < 0);
                totalBarang += barang;
            }

            ringkasanToko += "Toko " + toko + " - pelanggan: " + pelanggan
                    + ", total barang: " + totalBarang + "\n";

            totalSemua += totalBarang;
            if (totalBarang > barangTerbanyak) {
                barangTerbanyak = totalBarang;
                tokoTerbaik = toko;
            }
        }

        System.out.print(ringkasanToko);
        System.out.println("Total barang seluruh toko: " + totalSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        sc.close();
    }
}
