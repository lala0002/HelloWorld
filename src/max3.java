public class max3 {
    public static void main(String[] args) {
        int a=2;
        int b=17;
        int c=69;

        int d=max(a, max(b, c));
        System.out.println("Det største er :"+d);

    }

    static int max(int x, int y){
        if (x>y)
        return x;
        else
            return y;
    }
}
