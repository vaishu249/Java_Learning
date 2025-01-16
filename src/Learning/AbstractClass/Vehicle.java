package Learning.AbstractClass;

public abstract class Vehicle {
    private int modelNo;
    private String modelName;

    public Vehicle(String modelName, int modelNo) {
        this.modelName = modelName;
        this.modelNo = modelNo;
    }

    public int getModelNo() {
        return modelNo;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void display(){
        System.out.println("Model Name : "+getModelName());
        System.out.println("Model no : "+getModelNo());
    }
}
