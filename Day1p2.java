import java.util.* ;
import java.io.* ;

public class Day1p2
{
   public static void main(String[] args) throws IOException
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
      
      for(int i = 0; i < expReport.length; i++)
      {
        for(int j = 0; j < expReport.length; j++)
        {
            for(int k = 0; k < expReport.length; k++)
            {
               int find2020 = expReport[i] + expReport[j] + expReport[k] ;
               if(expReport[i] == expReport[j] || expReport[i] == expReport[k] || expReport[k] == expReport[j] )
               {
                  break;
               }
               else if(find2020 == 2020)
               {
                  System.out.println("The Sum of " + expReport[i] + ", " +expReport[k] + " ,and " + expReport[j] + 
                  " equals 2020. The Product is " + (expReport[i] * expReport[j] * expReport[k] ) + "."  );
               }
             }
           }
         }
      }

   
   
   }