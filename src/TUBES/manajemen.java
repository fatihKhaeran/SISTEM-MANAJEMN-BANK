package TUBES;
import java.util.Scanner;

public class manajemen {
    public static Scanner input = new Scanner(System.in);
    public static String PIN, Menu;


    public void run() {
        System.out.println("\t BANK SIX GROUP\n");
        System.out.println("Masukan PIN [Tekan \"ENTER\" setelah selesai]");
        PIN = input.nextLine();

        if (PIN.equals("212121")) {
            Menu = " ";
            do {
                transaksi.displayData();
                System.out.println("\nTransaksi Selesai...");
                System.out.println("\nTerima Kasih atas Kepercayaannya");
                Menu = input.nextLine();
            } while (Menu.equalsIgnoreCase("Y"));
        } else {
            System.out.println("\nMaaf, PIN Anda Salah");
        }
    }
}
