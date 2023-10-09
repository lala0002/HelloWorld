package Bankapp;

public class BankApp {
    public static void main(String[] args) {
        double konto=50.25;
        int konto_nr=1;
        String name=" Frank Hvam ";
        System.out.println("Konto" + konto_nr +":" + name + konto);

        double konto_2;
        int konto_nr_2;
        String name_2;

        konto_2=100;
        konto_nr_2=2;
        name_2="Casper Christensen";
        System.out.println("Konto" + konto_nr_2 +": " + name_2+ "= " + konto_2 );

        konto=konto+100;
        konto=konto*1.05;

        System.out.println("Efter");
        System.out.println("Konto" + konto_nr +":" + name + konto);
        System.out.println("Konto" + konto_nr_2 +": " + name_2+ "= " + konto_2 );

        double samlet_indestaaende=konto+konto_2;
        System.out.println("Samlet penge="+samlet_indestaaende);

        double gns_indlaan=samlet_indestaaende/2;
        System.out.println("Gennemsnit indlaan="+gns_indlaan);








    }
}
