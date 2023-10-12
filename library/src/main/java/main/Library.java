package main;
import webtoon.Manhwa;

import java.util.ArrayList;
import java.util.Scanner;

public final class Library {
    private static final ArrayList<Manhwa> listWebtoon = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;

        do {
            System.out.println("+----------------------------+");
            System.out.println("|        MENU LIBRARY        |");
            System.out.println("|   1. Tambah Webtoon        |");
            System.out.println("|   2. Tampilkan Webtoon     |");
            System.out.println("|   3. Edit Webtoon          |");
            System.out.println("|   4. Hapus Webtoon         |");
            System.out.println("|   0. Keluar                |");
            System.out.println("+----------------------------+");
            System.out.println("Silakan pilih menu yang anda inginkan: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 -> createWebtoon(listWebtoon, input);
                case 2 -> readWebtoon(listWebtoon);
                case 3 -> updateWebtoon(listWebtoon, input);
                case 4 -> deleteWebtoon(listWebtoon, input);
                case 0 -> System.out.println("Terima kasih telah menggunakan program ini. Sampai jumpa lagi!");
                default -> System.out.println("Pilihan tidak tersedia. Silakan coba kembali.");
            }
        } while (pilih != 0);
    }
     
    public static void createWebtoon(final ArrayList<Manhwa> listWebtoon, final Scanner input) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Masukan Judul Webtoon: ");
        String judulWebtoon = input.nextLine();
        System.out.println("Masukan Genre Webtoon: ");
        String genre = input.nextLine();
        System.out.println("Masukan Status Webtoon: ");
        String status = input.nextLine();
        System.out.println("Masukan Nama Penulis: ");
        String penulis = input.nextLine();
        System.out.println("Masukan Nama Artist: ");
        String artist = input.nextLine();
        System.out.println("Masukan Karya Asli: ");
        String karyaAsli = input.nextLine();
        System.out.println("Masukan Nama Penerbit: ");
        String penerbit = input.nextLine();
        System.out.println("-------------------------------------------------------------");
        Manhwa webtoon = new Manhwa(judulWebtoon, genre, status, penulis, artist, karyaAsli, penerbit);
        listWebtoon.add(webtoon);
        
        System.out.println("Webtoon telah berhasil ditambahkan!!");   
    }
    
    public static void readWebtoon(final ArrayList<Manhwa> listWebtoon) {
        if (listWebtoon.isEmpty()) {
            System.out.println("Tidak ada webtoon dalam library.");
        } else {
            System.out.println("-------------------------------------------------------------");
            System.out.println("DAFTAR WEBTOON");
            for (int i = 0; i < listWebtoon.size(); i++) {
                Manhwa webtoon = listWebtoon.get(i);
                System.out.println("[" + (i + 1) + "]");
                System.out.println("Webtoon: " + webtoon.getJudulWebtoon());
                System.out.println("Genre: " + webtoon.getGenre());
                System.out.println("Status: " + webtoon.getStatus());
                System.out.println("Penulis: " + webtoon.getPenulis());
                System.out.println("Artist: " + webtoon.getArtist());
                System.out.println("Karya Asli: " + webtoon.getKaryaAsli());
                System.out.println("Penerbit: " + webtoon.getPenerbit());
                System.out.println("-------------------------------------------------------------");
            }
        }
    }
    
    public static void updateWebtoon(final ArrayList<Manhwa> listWebtoon, final Scanner input) {
        readWebtoon(listWebtoon);
        System.out.println("Pilih nomor webtoon yang ingin anda update: ");
        int nomor = input.nextInt();
        input.nextLine();
        
        if (nomor > 0 && nomor <= listWebtoon.size()) {
            Manhwa webtoon = listWebtoon.get(nomor - 1);        
            System.out.println("-------------------------------------------------------------");
            System.out.println("UPDATE WEBTOON");
            System.out.println("Masukan Judul Baru: ");
            String judulBaru = input.nextLine();
            webtoon.setJudulWebtoon(judulBaru);
            System.out.println("Masukan Genre Webtoon: ");
            String genreBaru= input.nextLine();
            webtoon.setGenre(genreBaru);
            System.out.println("Masukan Status Webtoon: ");
            String statusBaru = input.nextLine();
            webtoon.setStatus(statusBaru);
            System.out.println("Masukan Penulis Baru: ");
            String penulisBaru = input.nextLine();
            webtoon.setPenulis(penulisBaru);
            System.out.println("Masukan Artist Baru: ");
            String artistBaru = input.nextLine();
            webtoon.setArtist(artistBaru);
            System.out.println("Masukan Karya Asli Baru: ");
            String karyaBaru = input.nextLine();
            webtoon.setKaryaAsli(karyaBaru);
            System.out.println("Masukan Penerbit Baru: ");
            String penerbitBaru = input.nextLine();
            webtoon.setPenerbit(penerbitBaru);
            System.out.println("-------------------------------------------------------------");
      
            System.out.println("Webtoon telah berhasil diupdate!!");
        } else {
            System.out.println("Nomor webtoon tidak valid!");
        }
    }
    
    public static void deleteWebtoon(final ArrayList<Manhwa> listWebtoon, final Scanner input) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("DELETE WEBTOON");
        readWebtoon(listWebtoon);
        System.out.println("Pilih nomor webtoon yang ingin anda hapus: ");
        int nomor = input.nextInt();
        input.nextLine();
        
        if (nomor > 0 && nomor <= listWebtoon.size()) {
            listWebtoon.remove(nomor - 1);
            System.out.println("Webtoon telah berhasil dihapus!");
            System.out.println("-------------------------------------------------------------");
        } else {
            System.out.println("Nomor webtoon tidak valid!");
            System.out.println("-------------------------------------------------------------");
        } 
    }
}