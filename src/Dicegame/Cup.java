package Dicegame;

public class Cup {
    Dice d1=new Dice();
    Dice d2=new Dice();
    Dice d3=new Dice();
    Dice d4=new Dice();
    int result1;
    int result2;
    int result3;
    int result4;

    void Roll(){
        result1=d1.Roll();
        result2=d2.Roll();
        result3=d3.Roll();
        result4=d4.Roll();

    }
    int getSum(){
        return result1+result2+result3+result4;
    }
    public static void main(String[] args) {
        Cup c=new Cup();
        for (int i=1; i<=10; i++){
        c.Roll();
        System.out.println(c.getSum());
        }

    }
}
