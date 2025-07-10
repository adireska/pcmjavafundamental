public class Film {
    String judul;
    String genre;
    int durasi; 

    public Film(String judul, String genre, int durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }

    public void tampilkanInfo() {
        System.out.println("--------------------------");
        System.out.println("Judul : " + judul);
        System.out.println("Genre : " + genre);
        System.out.println("Durasi: " + durasi + " menit");
        System.out.println("--------------------------");
    }
}
