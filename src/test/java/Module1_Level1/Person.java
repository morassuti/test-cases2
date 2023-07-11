package Module1_Level1;
public class Person {
    private int age;
    public String validateAgePerson() {
        if (age >= 18)
            return "Person is 18 or over";
        else
            return "Person under 18";
    }
    public void setAge(int age) {
        this.age = age;
    }
}