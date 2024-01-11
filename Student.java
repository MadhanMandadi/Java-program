public class Student {
    String name;
    String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Madhan";
        String myName = obj.getName();
        System.out.println(myName);
    }
}
