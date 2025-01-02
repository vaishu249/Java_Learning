package Learning.NestedClass;

public class Dog {
    public String name;
    public String location;

    public void test(){
        Honey h=new Honey();
        h.display();
    }

    public class Honey{
        protected String owner;
        public Honey() {
            name="Honey";
            location="Kharadi";
            owner="Kunal";
        }
        public void display(){
            System.out.println("Name : "+name);
            System.out.println("Location "+location);
            System.out.println("Owner "+owner);
        }
    }
}
