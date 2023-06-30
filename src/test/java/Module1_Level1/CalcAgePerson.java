package Module1_Level1;
public class CalcAgePerson {
    public static void main(String[] args){
        Person person = new Person();
        person.name = "Tom";
        person.age = 18;
        person.address = "Holzstrasse";
        System.out.println(person.name);
        person.ValidateAgePerson();

        Person person2 = new Person();
        person2.name = "Julie";
        person2.age = 15;
        person2.address = "Sewastrasse";
        System.out.println(person2.name);
        person2.ValidateAgePerson();


    }
}
