import java.util.Scanner;

public class opgave233b {
    public static void main(String[] args) {
        double Dollar;
        double udbetalt;
        double beløbeuro;
        double kurs=0.80;
        double gebyrsats=0.02;
        double gebyr;           // gebyr Beløb i euro
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Velkommen til vekselprogrammet");
        System.out.println("Indtast beløb til veksling: ");
        Dollar=keyboard.nextDouble();
        beløbeuro=Dollar*kurs;
        gebyr=gebyrsats*beløbeuro;
        if (gebyr<0.5) gebyr=0.5;
        udbetalt=beløbeuro-gebyr;

        System.out.println("Til udbetaling: "+udbetalt);









    }
}
