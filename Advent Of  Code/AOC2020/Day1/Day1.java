import java.util.* ;
import java.io.* ;

public class Day1
{
   public static void main(String []args) throws IOException
   {
      int records = 0;
      
      Scanner sc = new Scanner(new File("inputDay1.txt"));
      
      //Reading to see how many ints are in file.
      while(sc.hasNext())
      {
         String checkEnd = sc.nextLine();
         if(checkEnd == "")
         {
            break;
         }
         records++;
      }
         
      int[] expReport = new int[records];
      
      Scanner input = new Scanner(new File("inputDay1.txt"));
      //Loading ints in array
      for(int k = 0; k < expReport.length; k++)
      {
         expReport[k] = input.nextInt() ;
      }
      
      //Checking numbers
      for(int i = 0; i < expReport.length; i++)
      {
         for(int j = 0 ; i < expReport.length; j++)
         {
            int find2020 = expReport[i] + expReport[j];
            if(expReport[i] == expReport[j])
            {
               break;
            }
            else if(find2020 == 2020)
            {
               System.out.println("The Sum of " + expReport[i] + " and " + expReport[j] + 
               " equals 2020. The Product is " + (expReport[i] * expReport[j]) + "."  );
            }
         }
      }
       
   
  
   }
}