package ProblemSolving;

public class P40MethodOveriding_Car extends P40MethodOveriding_Vehicle{
    @Override
    public void service() {
        super.service();
        System.out.println("This Service method belongs to car class...");
    }

    public static void main(String[] args) {
        P40MethodOveriding_Car c=new P40MethodOveriding_Car();
        c.service();
    }
}
