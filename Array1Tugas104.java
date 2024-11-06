import java.util.Scanner;
public class Array1Tugas104 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai yang akan diinput: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double total = 0, rata2;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah " + nilaiMhs[i]);
            total += nilaiMhs[i];
        }

        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai: " + rata2);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}