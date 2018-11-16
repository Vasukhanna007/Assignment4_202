//Vasu Khanna
//260831350
import java.util.Arrays;
public class ExamGrading {
  
  public static void main(String[] args){
    char[][] responses ={{'C','A','C','B'},{'C','A','A','B'},{'C','A','A','B'}};
    char[] solutions = {'C','A','C','D'} ;
    double[] result= gradeAllStudents(responses,solutions);
    //System.out.println(Arrays.toString(result));
    char[]response1={'C','A','A','B'};
    char[]response2={'C','A','A','B'};
    int result2=numWrongSimilar(response1,response2,solutions);
    //System.out.println(result2);
    int x =  numMatches(responses,solutions,1,0);
    System.out.println(x);
    System.out.println(Arrays.deepToString(findSimilarAnswers(responses,solutions,1)));
  }
  public static double[] gradeAllStudents (char[][] response,char[] solution){
    int responseL =response.length;
    double count=0;
    double[] avg= new double[response.length];
    for(int i=0;i<response.length;i++){
      count= 0;
      for(int j=0;j<response[i].length;j++){
        if(response[i].length!=solution.length){
          //  throw new IllegalArgumentException("the error is in response"+ response[i]);
          throw new IllegalArgumentException("The error was caused by student number: "+(i+1)+". The response is: "+response[i].length+ " characters long and the solution is: "+solution.length+" characters long");
          
        }
        else if(solution[j]==response[i][j]){
          count += 1;  
        }    
        
      }
      double percentageRight = (count/solution.length)*100;
      avg[i]=percentageRight;
      
      
      
    }
    return avg;
    
    
  }
  
  public static int numWrongSimilar(char[] responseOne, char[] responseTwo, char[] solutions){ 
    int count=0;
    if(responseOne.length!=responseTwo.length||responseOne.length!=solutions.length){
      throw new IllegalArgumentException("invalid");
      
    }
    else{
      for(int i=0;i<solutions.length;i++){
        if(responseOne[i]==responseTwo[i]&&responseOne[i]!=solutions[i]){
          count++;
          
        }
        
      }
      return count;
      
    }
  }
  public static int numMatches(char[][] responses,char[] solution,int student,int similarityThreshold){
    int count = 0;
    for(int i=0;i<responses.length;i++){
      if (student != i){
        int similarWrong = numWrongSimilar(responses[student],responses[i], solution);
        if(similarWrong>=similarityThreshold){
          count+=1;
        } 
      }
    }
    return count;
    
  }
  
  public static int[][] findSimilarAnswers(char[][] responses, char[] solutions, int sameAnswers){
    // numMatches() method to determine the length of each sub-array
    //numWrongSimilar() method to determine which student indices belong in that sub-array
    int [][] result= new int[responses.length][];
    for (int i=0; i< responses.length; i++){     
      int innerIndexLength= numMatches(responses, solutions, i, sameAnswers );
      result[i]= new int[innerIndexLength]; 
      int matchesFound = 0;
      for(int j=0;j<responses.length;j++){
        if(i!=j){
          int numWrong= numWrongSimilar(responses[i],responses[j],solutions);
          if(numWrong>=sameAnswers){
            result[i][matchesFound]=j;
            matchesFound++;
            
          }
        }
        
        
      }
      
    }
    return result;
  }
}


