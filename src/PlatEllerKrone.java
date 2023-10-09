import java.util.Random;

public class PlatEllerKrone {
    public static void main(String[] args) {
        Random gen=new Random();
        int tal=gen.nextInt(2);
        if (tal==0)
            System.out.println("Plat");
        else
            System.out.println("Krone");
    }

}
