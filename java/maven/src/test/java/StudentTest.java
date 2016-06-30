import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class StudentTest {
    @Test
    public void Student_Test(){

        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);

        Student stu1 = new Student("Tom",01,21,klass1);
        Student stu2 = new Student("Jerry",02,22,klass1);
        Student stu3 = new Student("John",03,23,klass2);
        Student stu4 = new Student("Jim",04,24,klass2);

        klass1.appendMember(stu1);
        klass1.appendMember(stu2);
        klass2.appendMember(stu3);

        klass1.assignLeader(stu2);
        klass2.assignLeader(stu4);

        stu1.introduce();
        stu2.introduce();
        stu3.introduce();
        stu4.introduce();
    }
}
