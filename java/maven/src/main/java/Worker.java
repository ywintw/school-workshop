

public class Worker extends Person {
    public Worker(String name,int id, int age){
        super(name, id,age);
    }

    public void introduce(){
        super.introduce();
        System.out.println(" I am a Worker. I have a job.");
        //System.out.println();
    }
}


