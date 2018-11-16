
public class Dog {
  
  private String name;
  private String breed;
  
  
  public Dog(String name,String breed){
    
    this.name=name;
    this.breed=breed;
    
  }
  public String getName(){
    return this.name;
    
  }
  public int herd(){
    int dog = 0;
    
    String Str = (this.breed.toLowerCase()); 
    if(Str.contains("collie")){
      dog = 20;
      return dog;
    }
    if(Str.contains("shepherd")){
      dog = 25;
      return dog;
    }
    if(Str.contains("kelpies")||Str.contains("teruvens")){
      dog = 30;
      return dog;
    }
    
    return 10;
  }
  public static void main(String[] args){
    
    Dog s= new Dog("Tom"," hjhjkh");
    System.out.println(s.herd());
  }
  
}
