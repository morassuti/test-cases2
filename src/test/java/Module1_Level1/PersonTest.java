package Module1_Level1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {
    @Test
    public void testValidateAgePersonAbove18() {
        Person person = new Person();
        person.setAge(20);
        Assert.assertEquals(person.validateAgePerson(), "Person is 18 or over");
    }

    @Test
    public void testValidateAgePersonBelow18() {
        Person person = new Person();
        person.setAge(15);
        Assert.assertEquals(person.validateAgePerson(), "Person under 18");
    }
}