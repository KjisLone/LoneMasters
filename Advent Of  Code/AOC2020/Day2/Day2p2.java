import java.util.* ;
import java.io.* ;

public class Day2p2
{
   public static void main(String []args) throws IOException
   {
      Scanner sc = new Scanner(new File("inputDay2.txt"));
      Scanner kc = new Scanner(new File("inputDay2.txt"));
      int validCount = 0 ;
      while(sc.hasNext())
      {
         if(sc.nextLine() == "")
            break;
         else
         {
            String whole = kc.nextLine() ;
            String[] part = whole.split(": ") ;
            String paswrd = part[1] ;
            char[] brkenPaswrd = paswrd.toCharArray() ;
            String[] leftSide = part[0].split(" ") ;
            char specialChar = leftSide[1].charAt(0);
            String[] p1Np2 = leftSide[0].split("-") ;
            
            int position1 = Integer.valueOf(p1Np2[0])- 1 ;
            int position2 = Integer.valueOf(p1Np2[1])- 1 ;
            if((brkenPaswrd[position1] == specialChar) ^ (brkenPaswrd[position2] == specialChar))
            {
                  validCount++ ;
                  System.out.println("------");
                  System.out.println(whole);
                  System.out.println("Is valid") ;
                  System.out.println("------");
            }
            else
            {
                  System.out.println("------");
                  System.out.println(whole);
                  System.out.println("Is not valid") ;
                  System.out.println("------");
            }
          }
            
        }
         
            System.out.println("Passwords Valid: " +validCount );
      }
   }

