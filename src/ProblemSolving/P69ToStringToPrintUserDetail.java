package ProblemSolving;

import java.util.Scanner;

public class P69ToStringToPrintUserDetail {
    public String name;
    public int age;
    public char div;

    P69ToStringToPrintUserDetail(String name,int age,char div){
        this.name=name;
        this.age=age;
        this.div=div;
    }

    @Override
    public String toString() {
        return "P69ToStringToPrintUserDetail{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", div='" + div + '\'' +
                '}';
    }

    public static void main(String[] args) {
        P69ToStringToPrintUserDetail person=new P69ToStringToPrintUserDetail("Vaishnavi",21,'B');
        System.out.println(person.toString());

    }
}
