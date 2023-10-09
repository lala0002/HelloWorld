public class Main {
    public static void main(String[] args) {

        int l, b;
        l = 7;
        b = 4;
        int areal= l * b;
        System.out.println("Rektanglets areal: " + areal);

        int x, y;
        x = 7;
        y = 3*x*x+6*x+9;
        System.out.println(y);

        double dollar, euro;
        dollar = 100;
        double kurs = 0.95;
        double Veksling = dollar * kurs;
        System.out.println("Så meget har du efter veksling " + Veksling);

        double et, to, tre, sum, gns;
        et=Math.random()*100;
        to=Math.random()*100;
        tre=Math.random()*100;
        sum=et+to+tre;
        gns=sum/3;



        System.out.println("Et: " + et);
        System.out.println("To: " + to);
        System.out.println("Tre: " + tre);
        System.out.println("Sum: "+sum);
        System.out.println("Gennemsnit: " + gns);






    }
}