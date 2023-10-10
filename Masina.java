import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Definesc clasa Masina pentru a reprezenta o mașină
class Masina {
    private String marca;
    private String model;
    private int an;
    private int putere;
    private double pret;
    private String culoare;
    private boolean stareVanzare; // true pentru vandut si false pentru nevandut

    // Constructorul clasei Masina care initializează obiectele Mașină cu informațiile necesare
    public Masina(String marca, String model, int an, int putere, double pret, String culoare, boolean stareVanzare) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.putere = putere;
        this.pret = pret;
        this.culoare = culoare;
        this.stareVanzare = stareVanzare;
    }

    // Metoda pentru a obține culoarea mașinii
    public String getCuloare() {
        return culoare;
    }

    // Metoda pentru a obține prețul mașinii
    public double getPret() {
        return pret;
    }

    // Metoda pentru a obține puterea mașinii
    public int getPutere() {
        return putere;
    }

    // Metoda pentru a verifica dacă mașina este vândută
    public boolean isVanduta() {
        return stareVanzare;
    }
}