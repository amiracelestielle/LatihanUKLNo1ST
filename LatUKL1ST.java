import java.util.Scanner;

public class LatUKL1ST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double total = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            total += nilai;
        }

        double rataRata = total / jumlahSiswa;

        System.out.println("\nTotal nilai: " + total);
        System.out.println("Rata-rata nilai: " + rataRata);

        input.close();
    }
}
