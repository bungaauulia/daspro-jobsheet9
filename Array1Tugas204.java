import java.util.Scanner;
public class Array1Tugas204 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu yang akan dipesan: ");
        int jmlMenu = sc.nextInt();
        sc.nextLine();

        String[] menu = new String[jmlMenu];
        int[] harga = new int[jmlMenu];
        int totalHarga = 0;

        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Menu ke-" + (i + 1) + " : ");
            menu[i] = sc.nextLine();

            System.out.print("Harga menu ke-" + (i + 1) + " : ");
            harga[i] = sc.nextInt();
            sc.nextLine();

            totalHarga += harga[i]; 
        }
        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jmlMenu; i++) {
            System.out.println("Menu ke-" + (i + 1) + ": " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println("Total Harga: Rp " + totalHarga);
        }
    }
