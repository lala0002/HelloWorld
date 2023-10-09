import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        Random gen=new Random();
        int dice= gen.nextInt(6)+1;  // (1-6)
        String activity="";
        switch (dice) {

            case 1:
                System.out.println("Breakfast");
                System.out.println("Æg er en god mulighed");
                break;
            case 2:
                System.out.println("Study");
                System.out.println("Du har lektier i Økonomi");
                break;
            case 3:
                System.out.println("Fishing");
                System.out.println("Håber i fanger en stor fisk");
                break;
            case 4:
                System.out.println("Call mom");
                System.out.println("Hils");
                break;
            case 5:
                System.out.println("Bed time");
                System.out.println("Sov godt!");
                break;
            case 6:
                System.out.println("Swim");
                System.out.println("God svømmetur");
                break;
        }






    }
}
