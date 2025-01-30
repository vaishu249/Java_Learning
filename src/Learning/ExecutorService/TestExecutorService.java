package Learning.ExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {
    public static void main(String[] args) {
        ExecutorService service= Executors.newSingleThreadExecutor();
        ThreadOne t1=new ThreadOne('*');
        ThreadOne t2=new ThreadOne('$');
        ThreadOne t3=new ThreadOne('#');
        service.submit(t1);
        service.submit(t2);
        service.submit(t3);
    }
}
