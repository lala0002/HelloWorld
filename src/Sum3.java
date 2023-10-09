public class Sum3 {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int c=18;
        double sum;

        sum=plus(a,b,c);
        System.out.println("Summen er: "+sum);
    }

    static double plus(int a, int b, int c){
        int result=a+b+c;
        return result;

    }

}
