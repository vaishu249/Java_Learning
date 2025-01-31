package ProblemSolving.P45Thread;

public class ThreadOne extends Thread{
    int threadNo;

    public ThreadOne(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("Hello I am from THREAD "+threadNo+" executing for : "+i);
        }
    }
}
