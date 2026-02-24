package driver;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> daftarMenu = new ArrayList<>();
        ArrayList<Integer> daftarPorsi = new ArrayList<>();
        ArrayList<Integer> daftarHarga = new ArrayList<>();
        ArrayList<Integer> daftarTotal = new ArrayList<>();

        int grandTotal = 0;

        // ===== INPUT DULU SEMUA =====
        while (true) {

            String kode = input.nextLine();

            if (kode.equalsIgnoreCase("END")) {
                break;
            }

            int porsiButet = input.nextInt();
            input.nextLine();

            int totalPorsi = porsiButet * 3;

            String namaMenu = "";
            int harga = 0;

    switch (kode) {
    case "NGS": namaMenu = "Nasi Goreng Spesial"; harga = 15000; break;
    case "AP": namaMenu = "Ayam Penyet"; harga = 20000; break;
    case "SA": namaMenu = "Sate Ayam"; harga = 25000; break;
    case "BU": namaMenu = "Bakso Urat"; harga = 18000; break;
    case "MAP": namaMenu = "Mie Ayam Pangsit"; harga = 15000; break;
    case "GG": namaMenu = "Gado-Gado"; harga = 15000; break;
    case "SAM": namaMenu = "Soto Ayam"; harga = 17000; break;
    case "RD": namaMenu = "Rendang Daging"; harga = 25000; break;
    case "IB": namaMenu = "Ikan Bakar"; harga = 35000; break;
    case "NUK": namaMenu = "Nasi Uduk Komplit"; harga = 20000; break;
    default: continue;
}

            int totalItem = harga * totalPorsi;

            daftarMenu.add(namaMenu);
            daftarPorsi.add(totalPorsi);
            daftarHarga.add(harga);
            daftarTotal.add(totalItem);

            grandTotal += totalItem;
        }

        // ===== BARU CETAK TABEL =====
        System.out.println("================================================");
        System.out.printf("%-20s %-8s %-8s %-10s\n", "Menu", "Porsi", "Harga", "Total");
        System.out.println("================================================");

        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.printf("%-20s %-8d %-8d %-10d\n",
                    daftarMenu.get(i),
                    daftarPorsi.get(i),
                    daftarHarga.get(i),
                    daftarTotal.get(i));
        }

        System.out.println("================================================");
        System.out.printf("%-20s %-8s %-8s %-10d\n",
                "Total Pembayaran", "", "", grandTotal);
        System.out.println("================================================");

        input.close();
    }
}
