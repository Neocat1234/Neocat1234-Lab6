import java.util.Random;

public class DotChaser {
    public static void main(String[] args) {
Random random1 = new Random();

ThingList l = new ThingList();

 l.addThing(new TypeA(2, 3, 'C'));
 l.addThing(new TypeB(5, 5, 'A'));        
  l.addThing(new TypeA(0, 0, 'B'));
  
  

       
    for (int i = 0; i < 32; i++) {
      l.moveAll(random1);
      l.printAll();
      System.out.println("Step" + (i+1));
        }
    }
}
  