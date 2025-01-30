package Learning.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorServiceWithMultipleThread {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(3);
        MultipleThreadForPoolOfTHREAD m1=new MultipleThreadForPoolOfTHREAD('*');
        MultipleThreadForPoolOfTHREAD m2=new MultipleThreadForPoolOfTHREAD('#');
        MultipleThreadForPoolOfTHREAD m3=new MultipleThreadForPoolOfTHREAD('$');
        service.submit(m1);
        service.submit(m2);
        service.submit(m3);
        service.shutdown();
    }
}
