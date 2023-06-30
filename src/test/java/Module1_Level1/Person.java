package Module1_Level1;
public class Person {
    String name;
    String address;
    int age;

    public void ValidateAgePerson (){
        if (age >= 18)
            System.out.println("Person is 18 or over");
        else{
            System.out.println("Person under 18");
        }
    }
}
