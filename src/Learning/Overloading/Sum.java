package Learning.Overloading;

public class Sum {
    Sum(){
        System.out.println("Hello, default constructor is there..");
    }
    Sum(String name){
        System.out.println(name+"Hello,parameter constructor is there..");
    }
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b,int c){
        return a+b+c;
    }
    public int sum(int a, int b,int c,int d){
        return a+b+c+d;
    }
    public String sum(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        Sum s1=new Sum();
        System.out.println(s1.sum(10,20));
        System.out.println(s1.sum(12,13,14));
        Sum s2=new Sum("Vaishnavi");
        System.out.println(s2.sum("A","B"));
        System.out.println(s2.sum(10,11,12,13));

    }
}
