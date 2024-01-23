import package1.*;
public class  Student {
    String name;
    String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Madhan";
        String myName = obj.getName();
        System.out.println(myName);

        Product p = new Product();
        p.printType();

        Car c = new Car();
        c.printType();

        Subquestion tQ = new Subquestion(5);
        System.out.println(tQ.b);
    }
}
