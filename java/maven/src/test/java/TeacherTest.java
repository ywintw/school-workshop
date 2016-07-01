import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class TeacherTest {

    private Klass klass1;
    private Klass klass2;
    private Teacher teacher1;
    private Teacher teacher2;
    private Teacher teacher3;
    private Student stu1;
    private Student stu2;


    @Before
    public void setUp() {
        klass1 = new Klass(1);
        klass2 = new Klass(2);

        teacher1 = new Teacher("Tom", 11, 21);
        teacher2 = new Teacher("Jerry", 12, 22);
        teacher3 = new Teacher("Jerry", 13, 22);

        stu1 = new Student("Mike", 01, 22, klass1);
        stu2 = new Student("Helen", 02, 22, klass2);

    }

    @Test
    public void Teacher_introduce() {
        teacher1.introduce();
        teacher2.introduce();
        teacher3.introduce();
    }

    @Test
    public void teacher_isTeaching() {
        teacher1.isTeaching(stu1);
        teacher2.isTeaching(stu1);
        teacher3.isTeaching(stu1);
    }
}

