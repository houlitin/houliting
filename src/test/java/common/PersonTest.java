package common;

import com.houliting.model.Person;
import com.houliting.service.PersonService;
import org.junit.Test;

/**
 * Created by User on 2015/9/5.
 */
public class PersonTest {
    private static PersonService personService = new PersonService();
    @Test
    public void testPerson(){
        Person person = new Person();
        personService.updatePerson(person,"zhansan",20);
        String introduce = personService.selfIntroduce(person);
        System.out.println(introduce);
    }
    @Test
    public void updatePerson(){
        Person person = new Person();
        personService.updatePerson(person,"zhansan",20);
        String introduce = personService.selfIntroduce(person);
        System.out.println(introduce);
    }
}
