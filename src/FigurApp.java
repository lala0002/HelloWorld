import java.util.ArrayList;

public class FigurApp {
    public static void main(String[] args) {
        Figur f1 = new Rektangel(4, 3);
        Figur f2 = new Punkt();
        Figur f3 = new Linje(10);
        Figur f4 = new Cirkel(5);


        ArrayList<Figur> list = new ArrayList<Figur>();
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        for (Figur f : list) {
            System.out.println(f + " om=" + f.beregnOmkreds() + " a=" + f.beregnAreal());
        }
    }
}

abstract class Figur {
    abstract double beregnOmkreds();
    abstract double beregnAreal();
}

class Rektangel extends Figur {
    double hojde;
    double bredde;
    Rektangel (double h, double b) {
        hojde=h;
        bredde=b;
    }

    double beregnOmkreds(){
        return 2*(hojde+bredde);
    }

    double beregnAreal(){
        return hojde*bredde;
    }

    @Override
    public String toString() {
        return "Rektangel h="+hojde+" b="+bredde;
    }
}
class Punkt extends Figur {
    double beregnOmkreds() {
        return 0;
    }

    double beregnAreal() {
        return 0;
    }

    public String toString() {
        return "Punkt";
    }
}

class Linje extends Figur {
    double Laengde;
    Linje (double L){
        Laengde=L;
    }
    double beregnOmkreds(){
        return Laengde*2;
    }

    double beregnAreal(){
        return 0;
    }

    @Override
    public String toString() {
        return "Linjens om er   "+beregnOmkreds()+" "+"Linjens areal er  "+beregnAreal();
    }
}

class Cirkel extends Figur {
    double Radius;

    Cirkel(double R) {
        Radius = R;
    }

    double beregnOmkreds() {
        return 2 * Radius * Math.PI;
    }

    double beregnAreal() {
        return Math.PI * Math.pow(Radius, 2);
    }

    @Override
    public String toString() {
        return "Cirkelens om  " + beregnOmkreds() + " " + "Cirkelens areal er " + beregnAreal();
    }
}
