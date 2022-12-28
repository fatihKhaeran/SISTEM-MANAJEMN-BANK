package TUBES;

import java.util.Scanner;

class transaksi extends manajemen {

    public static int pilih, bayar, transfer, bank, tarik;
    public static String noRek, jenisbayar;
    public static int saldo = 55000000;

    public static void displayData() {
        char ulang;
        do {

            System.out.println("\tPilih Jenis Transaksi");
            System.out.println("1. Tarik Tunai \t 3. Pembayaran");
            System.out.println("2. Transfer \t 4. Info Saldo");
            System.out.println("Masukan Pilihan Anda : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nTarik Tunai");
                    tariktunai();
                    break;

                case 2:
                    System.out.println("\nTransfer");
                    transfer();
                    break;

                case 3:
                    System.out.println("\nPembayaran");
                    pembayaran();
                    break;

                case 4:
                    System.out.println("\nInfo Saldo");
                    infosaldo();
                    break;

                default:
                    System.out.println("\nAngka Anda Salah");
                    displayData();
                    break;
            }
            System.out.print("KEMBALI KE MENU? (y/t)? ");
            ulang = input.next().charAt(0);
        }
        while (ulang!= 't');
    }
    public static void infosaldo() {
        System.out.println("\t Informasi Saldo");
        System.out.println("Saldo Anda :Rp. " + saldo);
        Menu = input.nextLine();
    }

    public static void pembayaran(){
        System.out.println("Silahkan isi Jenis Pembayaran : ");
        input.nextLine();
        jenisbayar = input.nextLine();
        System.out.println("Masukan Jumlah Pembayaran : ");
        bayar = input.nextInt();
        saldo = saldo-bayar;
        System.out.println("\nPembayaran Anda ke "+jenisbayar+" Berhasil");
        System.out.println("Saldo Anda tersisa : Rp. "+saldo);
        Menu = input.nextLine();
    }

    public static void tariktunai() {
        int[] nominal = {50000, 100000, 200000, 300000, 500000, 700000, 1000000};
        System.out.println("1. 50000 \t5. 500000");
        System.out.println("2. 100000\t6. 750000");
        System.out.println("3. 200000\t7. 1000000");
        System.out.println("4. 300000");
        System.out.println("   pilih Jumlah Penarikan Tunai\n\tyang Anda Ingingkan");
        tarik = input.nextInt();
        saldo = saldo - nominal[tarik - 1]; //saldo dikurangi nominal pada array
        System.out.println("Penarikan Tunai Anda Berhasil");
        System.out.println("Saldo Anda Tersisa Rp. " + saldo);
        Menu = input.nextLine();
    }
    public static void transfer(){
        System.out.println("Masukan Jumlah Nominal yang Anda Transfer :");
        transfer = input.nextInt();

        System.out.println("\nPilih Bank Tujuan Transfer :");
        String [] Bank = {"Mandri", "BRI", "BCA", "BNI", "CIMB Niaga"};
        System.out.println("1. Mandiri");
        System.out.println("2. BRI");
        System.out.println("3. BCA");
        System.out.println("4. BNI");
        System.out.println("5. CIMB Niaga");
        bank = input.nextInt();

        System.out.println("\nMasukan Nomor Rekening Tujuan :");
        input.nextLine();
        noRek = input.nextLine();
        saldo = saldo - transfer;
        System.out.println("\nTransaksi Anda Berhasil, berikut rincian transaksi :");
        System.out.println("BANK : "+Bank[bank-1] + "\nNo. Rekening: "+noRek + "\nJumlah: Rp. "+transfer);
        System.out.println("Tekan \"ENTER\" untuk melanjutkan");
        Menu = input.nextLine();
    }

}