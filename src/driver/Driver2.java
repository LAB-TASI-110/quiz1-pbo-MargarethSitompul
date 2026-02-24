package driver;

import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Masukkan jumlah data (N): ");
        int N = input.nextInt();

        int[] nilai = new int[N];

        // Input nilai siswa
        System.out.println("Masukkan nilai siswa:");
        for (int i = 0; i < N; i++) {
            nilai[i] = input.nextInt();
        }

        // Input kode kelompok
        System.out.print("Masukkan kode kelompok: ");
        int kelompok = input.nextInt();

        int sum = 0;
        int index = 0;

        // Pola segitiga
        for (int k = 1; k <= kelompok; k++) {
            for (int j = 0; j < k && index < N; j++) {
                if (k == kelompok) {
                    sum += nilai[index];
                }
                index++;
            }
        }

        System.out.println("Total nilai kelompok " + kelompok + " = " + sum);
        input.close();
    }
}
