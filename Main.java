import java.util.*;
import java.util.ArrayList;
import java.util.List;

// Clasa principală Main care interacționează cu utilizatorul și afișează rezultatele
public class Main {
    public static void main(String[] args) {
        Reprezentanta reprezentanta = new Reprezentanta();
        Scanner scanner = new Scanner(System.in);
	
        // Citirea informațiilor despre mai multe mașini de la utilizator
        System.out.print("Numarul de masini: ");
        int numarMasini = scanner.nextInt();
        scanner.nextLine(); // Consumăm newline
        for (int i = 0; i < numarMasini; i++) {
            System.out.println("Introduceti informatii pentru masina #" + (i + 1));
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("An: ");
            int an = scanner.nextInt();
            scanner.nextLine(); // Consumăm newline
            System.out.print("Putere (CP): ");
            int putere = scanner.nextInt();
            scanner.nextLine(); // Consumăm newline
            System.out.print("Pret: ");
            double pret = scanner.nextDouble();
            scanner.nextLine(); // Consumăm newline
            System.out.print("Culoare: ");
            String culoare = scanner.nextLine();
            System.out.print("Stare (vandut/nevandut): ");
            boolean stareVanzare = scanner.nextLine().equalsIgnoreCase("vandut");
            Masina masina = new Masina(marca, model, an, putere, pret, culoare, stareVanzare);
            reprezentanta.adaugaMasina(masina);
        }
	
	// Afisarea informatiilor despre mașini
		System.out.println("Informatiile masinilor:");
for (Masina masina : reprezentanta.getMasini()) {
    System.out.println(masina);
}

        // Afișarea numărului de mașini cu aceeași culoare
        System.out.print("Introduceti culoarea pentru a afla numarul de masini cu aceeasi culoare: ");
        String culoareCautata = scanner.nextLine();
        int numarMasiniCuCuloare = reprezentanta.numarMasiniCuCuloarea(culoareCautata);
        System.out.println("Numarul de masini cu culoarea " + culoareCautata + " este: " + numarMasiniCuCuloare);

        // Afișarea mașinii cu cel mai mare preț
        Masina masinaCuPretMaxim = reprezentanta.masinaCuPretulCelMaiMare();
        System.out.println("Masina cu pretul cel mai mare este:");
        System.out.println(masinaCuPretMaxim);

        // Afișarea mașinii cu cel mai mic preț
        Masina masinaCuPretMinim = reprezentanta.masinaCuPretulCelMaiMic();
        System.out.println("Masina cu pretul cel mai mic este:");
        System.out.println(masinaCuPretMinim);

        // Afișarea mașinii cu cea mai mare putere
        Masina masinaCuPutereaMaxima = reprezentanta.masinaCuPutereaMaxima();
        System.out.println("Masina cu cea mai mare putere este:");
        System.out.println(masinaCuPutereaMaxima);

        // Calcularea prețului total al mașinilor vândute
        double pretTotalVandute = reprezentanta.pretTotalMasiniVandute();
        System.out.println("Pretul total al masinilor vandute este: " + pretTotalVandute);

        // Afișarea numărului de mașini nevândute
        int numarMasiniNevandute = reprezentanta.numarMasiniNevandute();
        System.out.println("Numarul de masini nevandute este: " + numarMasiniNevandute);
    }

}