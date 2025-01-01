package Learning;

public class mathClasses {
    public static void main(String[] args) {
        System.out.println(Math.abs(-20));
        System.out.println(Math.max(1,2));
        System.out.println(Math.min(12,2));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.round(13.6));
        for (int i = 0; i < 10; i++) {
            double no=Math.random()*6;
            System.out.println(Math.round(no));
        }
    }
}
