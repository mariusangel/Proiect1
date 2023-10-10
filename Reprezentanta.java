import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Definirea clasei Reprezentanta care utilizeaza o listă de mașini
class Reprezentanta {
    private List<Masina> masini = new ArrayList<>();

    // Metoda pentru a adăuga o mașină în lista de mașini a reprezentanței
    public void adaugaMasina(Masina masina) {
        masini.add(masina);
    }

    // Metoda pentru a obține lista de mașini
    public List<Masina> getMasini() {
	return masini;
    }

    // Metoda pentru a număra mașinile cu o anumită culoare
    public int numarMasiniCuCuloarea(String culoareCautata) {
        int count = 0;
        for (Masina masina : masini) {
            if (masina.getCuloare().equalsIgnoreCase(culoareCautata)) {
                count++;
            }
        }
        return count;
    }

    // Metoda pentru a găsi mașina cu cel mai mare preț
    public Masina masinaCuPretulCelMaiMare() {
        Masina masinaCuPretMaxim = null;
        double pretMaxim = Double.MIN_VALUE;
        for (Masina masina : masini) {
            if (masina.getPret() > pretMaxim) {
                pretMaxim = masina.getPret();
                masinaCuPretMaxim = masina;
            }
        }
        return masinaCuPretMaxim;
    }

    // Metoda pentru a găsi mașina cu cel mai mic preț
    public Masina masinaCuPretulCelMaiMic() {
        Masina masinaCuPretMinim = null;
        double pretMinim = Double.MAX_VALUE;
        for (Masina masina : masini) {
            if (masina.getPret() < pretMinim) {
                pretMinim = masina.getPret();
                masinaCuPretMinim = masina;
            }
        }
        return masinaCuPretMinim;
    }

    // Metoda pentru a găsi mașina cu cea mai mare putere
    public Masina masinaCuPutereaMaxima() {
        Masina masinaCuPutereMaxima = null;
        int putereMaxima = Integer.MIN_VALUE;
        for (Masina masina : masini) {
            if (masina.getPutere() > putereMaxima) {
                putereMaxima = masina.getPutere();
                masinaCuPutereMaxima = masina;
            }
        }
        return masinaCuPutereMaxima;
    }

    // Metoda pentru a calcula prețul total al mașinilor vândute
    public double pretTotalMasiniVandute() {
        double pretTotal = 0;
        for (Masina masina : masini) {
            if (masina.isVanduta()) {
                pretTotal += masina.getPret();
            }
        }
        return pretTotal;
    }

    // Metoda pentru a număra mașinile nevândute
    public int numarMasiniNevandute() {
        int count = 0;
        for (Masina masina : masini) {
            if (!masina.isVanduta()) {
                count++;
            }
        }
        return count;
    }
}