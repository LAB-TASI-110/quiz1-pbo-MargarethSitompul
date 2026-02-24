package driver;

import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    boolean statusLaundry;
    double sisaKuota;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.statusLaundry = false;
        this.sisaKuota = 0;
    }

    public void bayarLaundry(double kuotaBulanan) {
        if (statusLaundry) {
            System.out.println("Laundry sudah aktif.");
            return;
        }
        statusLaundry = true;
        sisaKuota = kuotaBulanan;
        System.out.println("Laundry aktif dengan kuota " + kuotaBulanan + " kg");
    }

    public void prosesLaundry(double berat) {
        if (!statusLaundry) {
            System.out.println("Laundry belum aktif.");
            return;
        }

        if (berat <= sisaKuota) {
            sisaKuota -= berat;
            System.out.println("Laundry berhasil diproses.");
            System.out.println("Sisa kuota: " + sisaKuota + " kg");
        } else {
            System.out.println("Kuota tidak mencukupi!");
        }
    }

    public void resetKuota(double kuotaBulanan) {
        sisaKuota = kuotaBulanan;
        System.out.println("Kuota berhasil di-reset.");
    }

    public void tampilkanStatus() {
        System.out.println("\nNama          : " + nama);
        System.out.println("StatusLaundry : " + (statusLaundry ? "Aktif" : "Tidak Aktif"));
        System.out.println("Sisa Kuota    : " + sisaKuota + " kg");
    }
}

public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa mhs = new Mahasiswa("12345", "Margareth");
        double kuotaBulanan = 20.0;
        int pilihan;

        do {
            System.out.println("\n=== SISTEM LAUNDRY DEL ===");
            System.out.println("1. Bayar Laundry");
            System.out.println("2. Proses Laundry");
            System.out.println("3. Reset Kuota");
            System.out.println("4. Lihat Status");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    mhs.bayarLaundry(kuotaBulanan);
                    break;
                case 2:
                    System.out.print("Masukkan berat (kg): ");
                    double berat = input.nextDouble();
                    mhs.prosesLaundry(berat);
                    break;
                case 3:
                    mhs.resetKuota(kuotaBulanan);
                    break;
                case 4:
                    mhs.tampilkanStatus();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }
}
