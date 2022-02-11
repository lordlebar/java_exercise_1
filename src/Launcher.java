import java.util.Scanner;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.stream;

public class Launcher
{
	public static void main(String[] args)
     {
          try( Scanner scanner = new Scanner(System.in) )
          {
               System.out.println("Bienvenue !");
               while (true)
               {
                    System.out.print("Enter your command: ");
                    String outputUser = scanner.nextLine();
                    if(outputUser.equals("fibo"))
                    {
                         System.out.print("Enter your number: ");
                         Launcher.fibo(scanner.nextInt());
                         scanner.nextLine();
                    }
                    else if(outputUser.equals("freq"))
                    {
                         System.out.print("Enter your file: ");
                         Path path = Paths.get(scanner.nextLine());
                         Launcher.readText(path);
                    }
                    else if(outputUser.equals("quit"))
                    {
                         break;
                    }
                    else
                         System.out.println("unknow command");
               }
               scanner.close();
          }
     }

     private static void fibo(int n)
     {
          int nbr0 = 0, nbr1 = 1, nbrF = 0; 

          for (int i = 1; i < n; i++)
          {
               nbrF = nbr0 + nbr1;       
               nbr0 = nbr1;
               nbr1 = nbrF;
          }
          System.out.println(nbrF);
     }

     private static void readText(Path path)
     {
          System.out.println("je suis la");
     //      try
     //      {
     //           String text = java.nio.file.Files.readString(path);
     //           text = text.toLowerCase();

     //           String[] list_word = text.split(" ");

     //           List<String> wordText = new ArrayList<>();
      //              String test = "";
     //           for(int i = 0; i < list_word.length; i++)
     //           {
     //                    if(!list_word[i].equals(test))
                         {
     //                wordText.add(list_word[i]);
     //                //System.out.println(wordText.get(i));
                         }
     //           }

     //           wordText = wordText.stream().distinct().collect(Collectors.toList());

     //           System.out.println(wordText.size());
     //           System.out.println(list_word.length);
     //           int count = 0;
     //           for(int i = 0; i < wordText.size(); i++)
     //           {
     //                count = 0;
     //                for(int k = 0; k < list_word.length; k++)
     //                {
     //                     if(wordText.get(i) == list_word[k])
     //                     {
     //                          count++;
     //                     }
     //                }
     //                System.out.println("le mot : '" + wordText.get(i) + "' est présent : " + count + " fois");
     //           }
     //      }
     //      catch (Exception e) 
     //      {
     //           System.out.println(" file: " + e);
     //      }
     // } 
}


/* 
 System.out.println(wordPerLine);
                    String word_one = "";
                    int times = 0;

                    for(int k = 0; k < wordPerLine.length; k++)
                    {
                         String word_ = wordPerLine[k];
                         //System.out.println(wordPerLine.length);
                         times = 0;
                         for (int j = 0; j < line[i].length(); j++) 
                         {
                              if (line[i].substring(j).startsWith(word_)) 
                                   times++;
                         }
                         System.out.println("cette ligne contients le mot '" + word_ + "'  " + times + " times");
                    }
                    System.out.println("mot le plus contenu de cette ligne est : '" + word_one + "' avec " + times + " times");
               }
*/