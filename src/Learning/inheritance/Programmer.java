package Learning.inheritance;

public class Programmer extends Person{
    String companyName;

    public Programmer(int id,String companyName,String name) {
        this.companyName = companyName;
        this.id=id;
        this.name=name;
    }
    protected void display(){
        System.out.println("ID "+id);
        System.out.println("Name "+name);
        System.out.println("Company Name "+companyName);
    }
}
