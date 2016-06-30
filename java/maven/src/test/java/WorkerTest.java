import org.junit.Test;


public class WorkerTest {
    @Test
    public void Worker_Test(){
        Worker worker1 = new Worker("Tom",1,21);
        Worker worker2 = new Worker("Jerry",2,22);
        //worker1.basicIntroduce();
        //System.out.println(" I am a Worker. I have a job.");

        worker1.introduce();
        worker2.introduce();
    }
}
