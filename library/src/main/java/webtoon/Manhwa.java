package webtoon;

public final class Manhwa {
    private String judulWebtoon;
    private String genre;
    private String status;
    private String penulis;
    private String artist;
    private String karyaAsli;
    private String penerbit;
        
    public Manhwa(String judulWebtoon, String genre, String status, String penulis, String artist, String karyaAsli, String penerbit) {
        this.judulWebtoon = judulWebtoon;
        this.genre = genre;
        this.status = status;
        this.penulis = penulis;
        this.artist = artist;
        this.karyaAsli = karyaAsli;
        this.penerbit = penerbit;
    }
    
    public final String getJudulWebtoon() {
        return judulWebtoon;
    }   
    public final void setJudulWebtoon(String judulWebtoon) {
        this.judulWebtoon = judulWebtoon;
    }
    
    public final String getGenre() {
        return genre;
    }
    public final void setGenre(String genre) {
        this.genre = genre;
    }
    
    public final String getStatus() {
        return status;
    }
    public final void setStatus(String status) {
        this.status = status;
    }
    
    public final String getPenulis() {
        return penulis;
    }
    public final void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public final String getArtist() {
        return artist;
    }
    public final void setArtist(String artist) {
        this.artist = artist;
    }
    
    public final String getKaryaAsli() {
        return karyaAsli;
    }
    public final void setKaryaAsli(String karyaAsli) {
        this.karyaAsli = karyaAsli;
    }
    
    public final String getPenerbit() {
        return penerbit;
    }
    public final void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
}
