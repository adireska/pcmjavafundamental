import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Film[] daftarFilm = new Film[100];
    static int jumlahFilm = 0;

    public static void main(String[] args) {
        if (login()) {
            int pilihan;
            do {
                tampilkanMenu();
                pilihan = scanner.nextInt();
                scanner.nextLine(); 

                switch (pilihan) {
                    case 1:
                        tampilkanDaftarFilm();
                        break;
                    case 2:
                        tambahFilm();
                        break;
                    case 3:
                        cariFilm();
                        break;
                    case 0:
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 0);
        } else {
            System.out.println("Username Atau Password Anda Salah!");
        }
    }

    static boolean login() {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        return username.equals("admin") && password.equals("123");
    }

    static void tampilkanMenu() {
        System.out.println("\n=== Menu Bioskop ===");
        System.out.println("1. Tampilkan Daftar Film");
        System.out.println("2. Tambah Film");
        System.out.println("3. Cari Film");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    static void tampilkanDaftarFilm() {
        if (jumlahFilm == 0) {
            System.out.println("Belum ada film.");
        } else {
            for (int i = 0; i < jumlahFilm; i++) {
                daftarFilm[i].tampilkanInfo();
            }
        }
    }

    static void tambahFilm() {
        System.out.print("Masukkan judul film: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan genre film: ");
        String genre = scanner.nextLine();
        System.out.print("Masukkan durasi film (menit): ");
        int durasi = scanner.nextInt();
        scanner.nextLine();

        daftarFilm[jumlahFilm] = new Film(judul, genre, durasi);
        jumlahFilm++;
        System.out.println("Film berhasil ditambahkan.");
    }

    static void cariFilm() {
        System.out.print("Masukkan judul film yang dicari: ");
        String cari = scanner.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahFilm; i++) {
            if (daftarFilm[i].judul.equalsIgnoreCase(cari)) {
                daftarFilm[i].tampilkanInfo();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Film tidak ditemukan.");
        }
    }
}
