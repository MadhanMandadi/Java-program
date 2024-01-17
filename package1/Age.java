package package1;
public class Age {
    public static void main(String[] args) {
        int age = 20;
        if(age<13){
            System.out.println("The age of person is kid");
        } else if (age >13 && age <=19) {
            System.out.println("The age of a person is teen");
        }
        else if(age>19){
            System.out.println("The age of a person is adult");
        }
        else{
            System.out.println("age of person is invalid");
        }
    }
}
