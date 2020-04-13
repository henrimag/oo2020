
public abstract class Parent {

    public String name;
    public String job;

    public void speak(){
        System.out.println("My name is " + this.name + " and my job is" + this.job);
    }
        public abstract void myJob();
        public abstract void myName();
        
}