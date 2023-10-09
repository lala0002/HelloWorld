import java.util.ArrayList;
import java.util.Scanner;

class Opskrift {
    private String navn;
    private String Kategori;
    private String ingredienser;
    private String instruktioner;
    private String rating;


    public Opskrift(String navn, String Kategori, String ingredienser, String instruktioner, String rating) {
        this.navn = navn;
        this.Kategori = Kategori;
        this.ingredienser = ingredienser;
        this.instruktioner = instruktioner;
        this.rating = rating;
    }

    public String getNavn() {
        return navn;
    }
    public String getKategori() {
        return Kategori;
    }

    public String getIngredienser() {
        return ingredienser;
    }

    public String getInstruktioner() {
        return instruktioner;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "\nOpskrift: " + navn + "\nKategori "+Kategori+ "\nIngredienser: " + ingredienser + "\nInstruktioner: " + instruktioner + "\nRating: "+ rating;
    }
}

public class Opskriftbog {
    private static ArrayList<Opskrift> opskrifter = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("Velkommen til opskriftbogen!");
            System.out.println("Vælg en handling:");
            System.out.println("1  Tilføj en ny opskrift");
            System.out.println("2  Vis alle opskrifter");
            System.out.println("3  Afslut");

            int valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    tilføjOpskrift();
                    break;
                case 2:
                    visOpskrifter();
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
                    break;
            }
        }
    }

    private static void tilføjOpskrift() {
        scanner.nextLine(); // Ryd buffer
        System.out.println("Indtast opskriftens navn:");
        String navn = scanner.nextLine();

        System.out.println("Indtast opskriftens kategori:");
        String Kategori = scanner.nextLine();

        System.out.println("Indtast ingredienser:");
        String ingredienser = scanner.nextLine();

        System.out.println("Indtast instruktioner:");
        String instruktioner = scanner.nextLine();

        System.out.println("Indtast Rating 1-5:");
        String rating = scanner.nextLine();

        Opskrift opskrift = new Opskrift(navn, Kategori, ingredienser, instruktioner, rating);
        opskrifter.add(opskrift);

        System.out.println("Opskrift tilføjet!\n");
    }

    private static void visOpskrifter() {
        if (opskrifter.isEmpty()) {
            System.out.println("Der er ingen opskrifter at vise.\n");
        } else {
            System.out.println("Alle opskrifter:\n");
            for (Opskrift opskrift : opskrifter) {
                System.out.println(opskrift + "\n");
            }
        }
    }
}
