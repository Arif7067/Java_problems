import java.io.*;

public class xopun {
    class Employee{
        float salary=40000;
    }
    class Programmer extends Employee{
        int bonus=10000;
        public void main(String[] args) throws IOException{
            Programmer p = new Programmer();
            System.out.println("Bonus salary"+p.salary);
            System.out.println(p.bonus);
        }
    }
    public static void main(String args[]){
        System.out.println("Hello Arif");
    }
}
