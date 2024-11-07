import java.util.Scanner;
public class Array1Tugas304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Bakpao", "Lumpia Udang", "Ramen", "Nasi Padang", "Ricebowl Ayam BBQ", "Pempek",
        "Udang Keju", "Es Teler", "Jeruk Hangat", "Es Teh", "Air Mineral"};

        System.out.print("Masukkan menu yang dicari: ");
        String key = sc.nextLine();

        String hasil = ("Menu tidak ditemukan");

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) { 
                hasil = ("Menu ditemukan:" + menu[i]);
                break; 
            } 
        }
        System.out.print(hasil);
    }
}
