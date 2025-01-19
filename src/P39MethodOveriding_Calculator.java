public class P39MethodOveriding_Calculator {
    public int sum(int a,int b){
        return a+b;
    }
    public double sum(double a,double b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        P39MethodOveriding_Calculator c=new P39MethodOveriding_Calculator();
        System.out.println(c.sum(10,20)+"\n"+c.sum(1000000,2000000000)+"\n"+c.sum(1,2,3));
    }
}
