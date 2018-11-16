import java.util.Scanner;
import java.util.Random;
public class WoolFactory{
  //The provided code generates random ages for sheep, and picks random names from the below array
  //You can modify this list of names as you wish (add/remove/replace elements).
  private static String[] namesForSheep = {"Cerdic","Cynric","Ceawlin","Ceol","Ceolwulf","Cynegils",
    "Cenwalh","Seaxburh","Aescwine","Centwine","Ceadwalla","Ine","Aethelheard","Cuthred","Cynewulf",
    "Berhtric","Egbert","Aethelwulf","Aethelbald","Aethelberht","Aethelred","Hengest","Aesc","Octa",
    "Eormenric","Aethelbert I","Eadbald","Earconbert","Egbert I","Hlothere","Oswine","Wihtred",
    "Aethelbert II","Sigered","Egbert II","Eadberht II","Cuthred","Baldred","Aethelfrith","Edwin","St. Oswald",
    "Oswiu","Ecgfrith","Aldfrith","Osred I","Cenred","Osric","Ceolwulf","Eadberht",
    "Aethelwald","Alhred","Aethelred I","Aelfwald I","Eardwulf","Eanred","George V","Edward VIII",
    "George VI","Elizabeth II"};
  private static Random r = new Random(123);
  
  //returns a random String from the above array. 
  private static String getRandomName(){
    int index = r.nextInt(namesForSheep.length);
    return namesForSheep[index];
  }
  //returns a random age for a sheep from 1 to 10
  private static int getRandomAge(){
    return r.nextInt(10)+1;
  }
  //End of provided name/age generation code. 
  
  public static void main(String[] args){
    //Student Name: Vasu Khanna
    //Student Number:260831350
    //Your code goes here.
    Scanner sc = new Scanner(System.in);
    System.out.print("What is the name of your Farm?");
    String nameOfFarm = sc.nextLine();
    System.out.print("What is the name of your dog?");
    String nameOfDog = sc.nextLine();
    System.out.print("What kind of dog is "+ nameOfDog+"?");
    String breed = sc.nextLine();
    System.out.print("And how many sheeps do you have ");
    int numberOfSheep= sc.nextInt();
    System.out.println("The farm has "+ numberOfSheep+" Sheep");
    // System.out.print("Farm: "+ nameOfFarm+" Dog : " + nameOfDog);
    
    // making a sheep array 
    Sheep[] sheepArr = new Sheep[numberOfSheep];
    for(int i=0;i<numberOfSheep;i++){
      
      sheepArr[i] = new Sheep(getRandomName(),getRandomAge());
      
    }
    Farm f = new Farm(nameOfFarm, new Dog( nameOfDog, breed),sheepArr);
    f.printFarm();
    
    double d= f.getWool();
    System.out.println("We just sheared "+ d+"lbs of wool for a value of $" + d*1.45);
  }
  
}
