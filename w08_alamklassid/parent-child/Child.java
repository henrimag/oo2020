
public class Child extends Parent {

    public String name = "Gugu";
    public String job = "Gaga";

    public Child(String name, String job){
        super(name, job);
    }

  public void speak(){
      super.speak();
      System.out.println("\nGugu gaga");
  }



}