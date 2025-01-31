package ProblemSolving.P39Interface;

public class Eagle extends Bird{
    @Override
    public void name() {
        System.out.println("Name is eagle..");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flyinggg...");
    }

    public static void main(String[] args) {
        Eagle e=new Eagle();
        e.name();
        e.fly();
    }
}
