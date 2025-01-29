package P46ThreadJoin;

public class Threadone extends Thread{
    int threadNo;

    public Threadone(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        System.out.println("Thread is starting..");
        for(int i=1;i<=10;i++){
            System.out.println("Hello I am from THREAD "+threadNo+" executing for : "+i);
        }
        System.out.println("Thread is ended..");
    }

}
