/**
 * Auto Generated Java Class.
 */
import java.util.Random;
public class Sheep {
  
  private String name;
  private int age;
  private boolean hasWool;
  // private static Random numberGenerator;
  private static Random numberGenerator = new Random(123);
  
  
  
  
  
  public Sheep(String name,int age){
    this.name= name;
    this.age=age;
    this.hasWool=true;
    
    
  }
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public double shear(){
    if(this.hasWool==true){
      //After sheep is sheared
      this.hasWool=false;
      
      return 4*(numberGenerator.nextDouble())+6;
      
      
    }
    else{
      return 0;
      
    }
    
    
  }
  public static void main(String[] args){
    Sheep s = new Sheep("tom",20);
    System.out.println(s.shear());
    
  }
  
}