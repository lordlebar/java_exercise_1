import java.util.Scanner;

public class launcher
{
	public static void main (String[] args)
     {
          try( Scanner scanner = new Scanner(System.in) )
          {
               int n = 0;
               while (n != 1)
               {
                    System.out.print("Enter your command: ");
                    String name = scanner.nextLine();
                    if(name.equals("quit"))
                    {
                         System.out.println("exit ... \n");
                         n = 1;
                    }
                    else
                         System.out.println("unknow command \n");
               }
          }
     }
}
