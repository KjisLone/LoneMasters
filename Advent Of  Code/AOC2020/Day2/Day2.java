import java.util.* ;
import java.io.* ;
public class Day2
{
   public static void main( String []args) throws IOException
   {
      int correct = 0 ;
      Scanner sc = new Scanner(new File("inputDay2.txt"));
      Scanner kc = new Scanner(new File("inputDay2.txt"));
      while(sc.hasNext())
      {
         
         if(sc.nextLine() == "")
         {
            break;
         }
         else
         {
           
            String whole = kc.nextLine() ;
            String[] parts = whole.split(": ");
            String[] partsSplit = parts[0].split(" ");
            
            char specialChar = partsSplit[1].charAt(0) ;
            String paswrd = parts[1];
            char[] brkenPaswrd = paswrd.toCharArray() ;
            
            String minNmaxSpliter = partsSplit[0] ;
            String[] minNmax = minNmaxSpliter.split("-");
            
            int min = Integer.valueOf(minNmax[0]) ;
            int max = Integer.valueOf(minNmax[1]) ;
            int charCount = 0 ;
            boolean valid = false ;
            
           for(int i = 0; i < brkenPaswrd.length; i++)
           {
              if(brkenPaswrd[i] == specialChar)
              {
               charCount++ ;
              }
           }
           
           if(charCount >= min && charCount <= max )
           {
            correct++;
            valid = true ;
           }  
           System.out.println("--------") ;
           System.out.println( whole ) ;
           System.out.println("number of specials counted : " + charCount);     
           System.out.println("Min: "+ min + " Max: " + max) ;
           System.out.println("Password valid?: " + valid) ;
           System.out.println("--------") ;
         }
      }
      
      System.out.println("There are " + correct + " correct passwords." );
      
     /* 
      
      Scanner kc = new Scanner(new File("inputDay2.txt"));

      String v = kc.nextLine() ;
      String[] vs = v.split(": ");
      
      System.out.println( vs[0] ) ;
      
      //spliting zero to isolate character being searched.
      String[] zeroSplit = vs[0].split(" ");
      
      //seperating char
      char specialChar = zeroSplit[1].charAt(0) ;
      System.out.println(specialChar) ;
    
      
      
      //have the exact password regex is :*space* .
      String paswrd = vs[1] ;
      System.out.println( paswrd ) ;
      
      //breaking the password into char array.
      char[] brokenPaswrd = paswrd.toCharArray();
      int charCount = 0 ;
      
      //counting how many time char was collected.
      for(int i = 0; i < brokenPaswrd.length; i++)
      {
        if(brokenPaswrd[i] == specialChar)
        {
         charCount++ ;
        }
      }
      
      System.out.println(charCount) ;
   
   */
   }

}