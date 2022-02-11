import java.util.Scanner;
import java.nio.file.*;

public class Launcher
{
	public static void main(String[] args)
     {
          try( Scanner scanner = new Scanner(System.in) )
          {
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
          try
          {
               String text = java.nio.file.Files.readString(path);
               text = text.toLowerCase();

               String[] line = text.split(System.lineSeparator());
               for(int i = 0; i < line.length; i++)
               {
                    String[] wordPerLine = line[i].split("\\s+");
                    int times = 0;
                    for (int j = 0; j < wordPerLine[i].length(); j++)
                    {
                         if (line[i].substring(j).startsWith(wordPerLine[j])) 
                         {
                              times++;
                         }
                    }
                    System.out.println(times);
               } 
          }
          catch (Exception e) 
          {
               System.out.println(" file: " + e);
          }
     }
}


/* 

  String text = java.nio.file.Files.readString(path);
               text = text.toLowerCase();

               String[] line = text.split(System.lineSeparator());
               //System.out.println(text);
               //System.out.println(line[0]);
               //System.out.println(word[0]);

               for(int i = 0; i < line.length; i++)
               {
                    String[] wordPerLine = line[i].split("\\s+");
                    String word_one = "";
                    int times = 0;
                    int temp = 0;
                    int restemp = 0;

                    for(int k = 0; k < wordPerLine.length; k++)
                    {
                         String word_ = wordPerLine[k];
                         int size_word = 0;
                         //size of word
                         for(int y = 0; y < word_.length(); y++)
                         {
                              size_word++;
                         }
                         System.out.println(size_word);

                         //System.out.println(wordPerLine.length);
                         times = 0;
                         for (int j = 0; j < line[i].length(); j++) 
                         {
                              if (line[i].substring(j).startsWith(word_)) 
                              {
                                   times++;
                              }
                              if(times >= temp)
                              {
                                   restemp = times;
                                   word_one = word_;
                              }
                         }
                         temp = times;
                         System.out.println("cette ligne contients le mot '" + word_ + "'  " + times + " times");
                    }
                    System.out.println("mot le plus contenu de cette ligne est : '" + word_one + "' avec " + restemp + " times");
               }
*/