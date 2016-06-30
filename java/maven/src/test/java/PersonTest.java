import org.junit.Test;


public class PersonTest {
    @Test
    public void Peson_Test(){
        Person person1 = new Person("Tom",1,21);
        Person person2 = new Person("Jerry",2,22);
        //person1.basicIntroduce();
        person1.introduce();
        person2.introduce();
    }
}
