package Module1_Level3;

public class CustomerCourse {

    public static void main(String[] args) {
        Customer cust1 = new Customer();
        Course cour1 = new Course();
        cust1.name = "John";
        cust1.age = 25;
        cust1.salary = 2356.98;

        cour1.course = "System Analysis";
        cour1.lenghtcourse = 4;
        cour1.price = 10000;

        System.out.println("Name: " + cust1.name + " Age: " + cust1.age + " Salary: " + cust1.salary);
        System.out.println("Course: " + cour1.course + " Lenght: " + cour1.lenghtcourse + " Price: " + cour1.price);
    }
}
