package ProblemSolving.P47TrafficSignal;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        RED_Signal r=new RED_Signal("Red");
        YELLOW_Signal y=new YELLOW_Signal("Yellow");
        GREEN_Signal g=new GREEN_Signal("Green");
        r.start();
        r.sleep(10000);
        g.start();
        g.sleep(20000);
        y.start();
    }
}
