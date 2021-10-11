package LOGO;

import java.util.*;
import java.io.File;
import ColourPKG.ANSI;
import java.io.FileNotFoundException; 
public class Timg {
    public static void logo()
    {
		try{
		File file = new File("/home/kali/ISA/LOGO.txt"); 
		Scanner sc = new Scanner(file); 
  
		while (sc.hasNextLine())
		{ 
		  System.out.println("\t\t\t\t"+ANSI.B_B+ANSI.BL+"|"+sc.nextLine()+ANSI.RESET);
		  while (sc.hasNextLine())
		  {
		  System.out.println("\t\t\t\t"+ANSI.B_B+ANSI.P+"|"+sc.nextLine()+ANSI.RESET); 
		  while (sc.hasNextLine())
		  {
		  System.out.println("\t\t\t\t"+ANSI.B_B+ANSI.W+"|"+sc.nextLine()+ANSI.RESET);
                  while (sc.hasNextLine())
		  {
		  System.out.println("\t\t\t\t"+ANSI.B_B+ANSI.G+"|"+sc.nextLine()+ANSI.RESET);
		  break;
		  }
		  break;
		  }
		  break;
		  }
		}
	}
	catch(FileNotFoundException e)
	{
		System.exit(0);
	}
}
    
}
