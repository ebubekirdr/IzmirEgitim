package tr.com.testinium;

public class Okul{

    public Okul() {
    }

    public Okul(String adres, String ad, int year) {
        this.adres = adres;
        this.ad = ad;
        this.year = year;
    }

    private String adres;
    private String ad;
    private int year;

    public String getAdres() {
        return adres;
    }

    public void setAdres(String abc) {
        this.adres = abc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
