package UI;

import java.util.*;
import ColourPKG.ANSI;
import Crypto.*;
public class home {


    public static String homedisp()
    {
        Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\t\t\t\t"+ANSI.P_B+ANSI.B+"-------------------------DATA CRYPT TERMINAL------------------------"+ANSI.RESET+"\n");
		System.out.println("\t\t\t\t\t\t"+ANSI.B_B+ANSI.W+"     :Enter the option to perform the desired cipher conversion:    "+ANSI.RESET+"\n");
		System.out.println("\t\t\t\t\t\t"+ANSI.Y_B+ANSI.B+"xxxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxx"+ANSI.RESET);
		System.out.println("\t\t\t\t\t\t"+ANSI.Y_B+ANSI.B+"x"+ANSI.RESET+"                                                                  "+ANSI.Y_B+ANSI.B+"x"+ANSI.RESET+"\n\t\t\t\t\t\t"+ANSI.Y_B+ANSI.B+"o"+ANSI.RESET+"\t\t\t\t\t\t\t\t   "+ANSI.Y_B+ANSI.B+"o"+ANSI.RESET);
		System.out.println("\t\t\t\t\t\t"+ANSI.B_B+ANSI.W+"x                         a. Encryption                            x"+ANSI.RESET+"\n\t\t\t\t\t\t"+ANSI.Y_B+ANSI.B+"o"+ANSI.RESET+"\t\t\t\t\t\t\t\t   "+ANSI.Y_B+ANSI.B+"o"+ANSI.RESET);
		System.out.println("\t\t\t\t\t\t"+ANSI.B_B+ANSI.W+"x                         b. Decryption                            x"+ANSI.RESET+"\n\t\t\t\t\t\t"+ANSI.Y_B+ANSI.B+"o"+ANSI.RESET+"\t\t\t\t\t\t\t\t   "+ANSI.Y_B+ANSI.B+"o"+ANSI.RESET);		
		System.out.println("\t\t\t\t\t\t"+ANSI.B_B+ANSI.R+"x                    Enter any other value to  EXIT                x"+ANSI.RESET);
		System.out.println("\t\t\t\t\t\t"+ANSI.Y_B+ANSI.B+"x"+ANSI.RESET+"                                                                  "+ANSI.Y_B+ANSI.B+"x"+ANSI.RESET+"\n\t\t\t\t\t\t"+ANSI.Y_B+ANSI.B+"o"+ANSI.RESET+"\t\t\t\t\t\t\t\t   "+ANSI.Y_B+ANSI.B+"o"+ANSI.RESET);
		System.out.println("\t\t\t\t\t\t"+ANSI.Y_B+ANSI.B+"xxxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxx"+ANSI.RESET);
		System.out.print("\t\t\t\t\t\to\n\t\t\t\t\t\t"+ANSI.B_B+ANSI.R+"x                    Waiting for user input: "+ANSI.RESET);
		String c=sc.nextLine();
		System.out.println("\t\t\t\t\t\txxxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxx");
		return c;
    }
	public static void hr()
	{
		System.out.println("\n\t\t\t\t\t\txxxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxx");
	}

	public static void fileexp()
	{
		System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\t"+ANSI.R_B+ANSI.B+"x                    Invalid file input                            x"+ANSI.RESET);
		System.out.println("\t\t\t\t\t\txxxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxx");
		System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\t"+ANSI.R_B+ANSI.B+"x                    process reverted                              x"+ANSI.RESET);
		System.out.println("\t\t\t\t\t\t"+ANSI.W_B+ANSI.P+"xxxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxx"+ANSI.RESET);
	}

	public static void exitit()
	{
		System.out.print("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\t"+ANSI.R_B+ANSI.B+"x                    EXIT init. with code 0                        x"+ANSI.RESET+"\n");
		System.out.println("\t\t\t\t\t\t"+ANSI.B_B+ANSI.R+"xxxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxx"+ANSI.RESET);
		System.exit(0);
	}

	public static void keysh()
	{
		System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\t"+ANSI.G_B+ANSI.B+"x                  !File encrypted successfully!                   x"+ANSI.RESET);
		System.out.println("\t\t\t\t\t\txxxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxx");
		System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\tx                   Specify key sharing method:                    x");
		System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\tx                 1.  Key logger file                              x");
		System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\tx                 2.  Direct key text                              x");
		System.out.println("\t\t\t\t\t\txxxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxx");
	}
}
