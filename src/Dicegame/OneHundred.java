package Dicegame;

public class OneHundred {
    Player p1=new Player("Bjarke");
    Player p2=new Player("Martin");
    Player p3=new Player("Erik");

    void play(){
        int round = 1;
        while (p1.points<100 && p2.points<100 && p3.points<100){
            System.out.println(p1.name+" "+p2.name+" "+p3.name);
            p1.turn();
            p2.turn();
            p3.turn();
            System.out.println("#" + round + " " + p1.points+" "+p2.points+" "+p3.points);
            round++;
        }


    }


    public static void main(String[] args) {
        OneHundred game=new OneHundred();
        game.play();
    }
}
