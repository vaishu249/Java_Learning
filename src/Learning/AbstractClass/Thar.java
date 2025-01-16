package Learning.AbstractClass;

public class Thar extends Vehicle {
    private int noDoor;
    public Thar(){
        super("Thar",1);//constructor chaning parent class constructor call using super keyword
    }
    @Override
    public void start(){
        System.out.println(getModelName()+" is started now....");
    }
}
