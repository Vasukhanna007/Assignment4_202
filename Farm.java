/**
 * Auto Generated Java Class.
 */
public class Farm {
  private Sheep[] sheepname;
  private Dog d;
  private String name;
  
  public Farm(String nameOfFarm,Dog d,Sheep[] sheepname){
    this.name = nameOfFarm;
    this.d=d;
    
    Sheep[] sheepCopy = new Sheep[sheepname.length];
    for(int i =0;i<sheepCopy.length;i++){
      sheepCopy[i]=sheepname[i];
    }
    this.sheepname = sheepCopy;
    if(d.herd()<this.sheepname.length){
      throw new IllegalArgumentException("Maximum number of sheep for this dog is" + d.herd()+ " Received " + this.sheepname.length); 
    }
    
    
    
  }
  
  public String getName(){
    return this.name;
  }
  
  public int getNumSheep(){
    return sheepname.length;
  }
  
  public void printFarm(){
    System.out.print("farm: ");
    
    System.out.print(this.name);
    System.out.print(" ");
    System.out.print("Dog: ");
    System.out.println(this.d.getName());
    for(int i = 0;i<sheepname.length;i++){
      if(sheepname[i]!=null){
        System.out.print(this.sheepname[i].getName() + " ");
        System.out.println(this.sheepname[i].getAge());
        
      }
    }
  }
  public double getWool(){
    double d=0;
    
    for(int i =0;i<this.sheepname.length;i++){
      
      d= d+sheepname[i].shear();
      
    } 
    return d;
  }
  public static void main(String[] args){
    Sheep[] sheepArr = new Sheep[2];
    sheepArr[0] = new Sheep("tom", 20);
    sheepArr[1] = new Sheep("tomy", 20);
    Farm f= new Farm("hey", new Dog("Tom","hjhjkh"), sheepArr);
    f.printFarm();
    System.out.println(f.getName());
    
  }
}