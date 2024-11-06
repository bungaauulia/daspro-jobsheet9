import java.util.Scanner;
public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        int mhsLulus = 0, mhsTdkLulus = 0;
        double totalLulus = 0, totalTdkLulus = 0, rataLulus, rataTdkLulus;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int nilai : nilaiMhs) {
            if (nilai > 70) {
                totalLulus += nilai;
                mhsLulus++;
            }
            if (nilai <= 70) {
                totalTdkLulus += nilai;
                mhsTdkLulus++;
            }
        }
        rataLulus = totalLulus / mhsLulus;
        rataTdkLulus = totalTdkLulus / mhsTdkLulus;
        System.out.println("Rata-rata nilai lulus: " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus: " + rataTdkLulus);
    }
}