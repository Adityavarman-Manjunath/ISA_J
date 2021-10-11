
import java.util.*;

import UI.*;
import LoadAnim.LQA;
import RANgen.*;
import ColourPKG.ANSI;
import Crypto.exthnld;
import LOGO.Timg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;//key
import java.io.IOException;


public class Main 
{
    static int logolog=0;
	
    static String bin;
    static String text;
    static byte[] plainmap;
    static byte[] csmap;
    
    //static double[] key={6,8,16,10,12,20,24,20,14};

    static double[] pts = new double[9];
    static double[] key = new double[9];

    static Scanner sc=new Scanner(System.in);
    





public static void pkey(String secrkey){
		try {
            FileWriter writer = new FileWriter("/home/kali/ISA/secKey.txt", true);
            writer.write(secrkey);
            writer.write("\r\n");   // write new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    public static void main(String args[])
        throws Exception
        {
        while(logolog==0)
        {
        Timg.logo();
        logolog+=1;
		System.out.print("\t\t\t\t\t\txPress any key: ");
        }
		

		String rssa=sc.nextLine();
		System.out.println("\n\n\n");

        switch(home.homedisp()){
			case "A":
			case "a":
			System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\tx                        Enter input path");
			System.out.print("\t\t\t\t\t\to\n\t\t\t\t\t\t"+ANSI.B_B+ANSI.R+"x                    Waiting for user input: "+ANSI.RESET);
			String pointer1=sc.nextLine();
			int len1=pointer1.length();
			if(len1<5)
			{
				home.fileexp();
				Main.main(args);
			}
			//extension detector 
			String ext1;
			ext1=pointer1.substring(len1-3,len1);
			String addext1=exthnld.exth(ext1);
			if(addext1=="ney")
			{
				home.fileexp();
				Main.main(args);
			}
			System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\tx                   Extension detected: "+ext1+"                        x");
			home.hr();
			File inputFile = new File(pointer1);
			File encryptedFile = new File("/home/kali/ISA/encrypted_file."+addext1);
			try 
			{
			 
				key=keyer.keygen(key);
				Main.encrypt(inputFile, encryptedFile);
			 
			} 
			catch (Exception e) 
			{
				home.fileexp();
				Main.main(args);
			}
			
			break;
			case "B":
			case "b":System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\tx                        Enter input path");
			System.out.print("\t\t\t\t\t\to\n\t\t\t\t\t\t"+ANSI.B_B+ANSI.R+"x                    Waiting for user input: "+ANSI.RESET);
			String pointer2=sc.nextLine();
			int len2=pointer2.length();
			if(len2<5)
			{
				home.fileexp();
				Main.main(args);
			}
			//extension detector 
			String ext2;
			ext2=pointer2.substring(len2-3,len2);
			String addext2=exthnld.exth(ext2);
			if(addext2=="ney")
			{
				home.fileexp();
				Main.main(args);
			}
			System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\t"+ANSI.G_B+ANSI.B+"x                   Extension detected: "+ext2+"                        x"+ANSI.RESET);
			System.out.println("\t\t\t\t\t\t"+ANSI.B_B+ANSI.B+"xxxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxx"+ANSI.RESET);
			File outputFile = new File(pointer2);
			File decryptedFile = new File("/home/kali/ISA/decrypted_file."+addext2);
			try 
			{
				Main.decrypt(outputFile, decryptedFile);
			} catch (Exception e) 
			{
				home.fileexp();
				Main.main(args);
			}
			break;
			default:
			home.exitit();
		}
            
        }

    public static void encrypt(File inputFile, File outputFile)
    throws Exception 
    {
        String[] args={};
        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);
        byte[] inputstream=new byte[fis.available()];
        fis.read(inputstream);
        int ciphermode=0;
        System.out.println("\n\n"+ANSI.B_B+ANSI.W);
        byte[] outputstream=encrypto(ciphermode, inputstream);
        fos.write(outputstream);
        fis.close();   
        fos.close();
		home.keysh();
		String keystring="";
		for(int lo=0;lo<key.length;lo++)
		{
			int data=(int)key[lo];
			keystring+=Integer.toString(data);
			keystring+=" ";
		}
		int sw=0;
		while(sw!=1||sw!=2)
		{
		System.out.print("\t\t\t\t\t\to\n\t\t\t\t\t\t"+ANSI.B_B+ANSI.R+"x                    Waiting for user input: "+ANSI.RESET);
                sw=sc.nextInt();
		switch(sw)
		{
		case 1:pkey(keystring);
		        System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\t"+ANSI.G_B+ANSI.B+"x                  !key saved successfully!                       x"+ANSI.RESET);
		        Main.main(args);
		break;
		case 2:System.out.println("\n\t\t\t\t\t\tShared Key:"+keystring);
		Main.main(args);
         	default:
		       System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\t"+ANSI.R_B+ANSI.B+"x            !PLEASE specify a key sharing method!                 x"+ANSI.RESET);         	

		}
		}
    }
    public static void decrypt(File inputFile, File outputFile)
    throws Exception {
    String args[]={};
        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);
        byte[] inputstream=new byte[fis.available()];
        fis.read(inputstream);
        int ciphermode=1;
		System.out.print("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\tx                 Enter pre-shared key: ");
		for(int k=0;k<key.length;k++)
		{
			key[k]=sc.nextInt();
		}
        byte[] outputstream=encrypto(ciphermode, inputstream);
        fos.write(outputstream);
        fis.close();   
        fos.close();
        System.out.println("\t\t\t\t\t\to\t\t\t\t\t\t\t\t   o\n\t\t\t\t\t\t"+ANSI.G_B+ANSI.B+"x                 !File decrypted successfully!                    x"+ANSI.RESET);
		System.out.println("\t\t\t\t\t\txxxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxx");
		Main.main(args);
    }
    public static byte[] encrypto(int ciphermode,byte[] inputstream)
    throws Exception{
        int cpmod=ciphermode;
        float q;
		plainmap=inputstream;
        csmap=mapper.chargen(cpmod,inputstream,key);
        byte[] b=new byte[inputstream.length];
        //ASSIGNING ELEMENTS TO JAVA BYTE ARRAY
        byte[] pmap = plainmap;
        byte[] cmap = csmap;
        for(int p=0;p<inputstream.length;p++)
        {
            for(int i=0;i<csmap.length;i++)
            {            
                
                if(pmap[i]==inputstream[p])
                    b[p]=cmap[i];
                		  
            }
//            loader(strim);
         q=(float)((p*100)/(plainmap.length));
         LQA.loader(q);
        }
        System.out.println("\n\n\t\t\t\t\t\t"+ANSI.B_B+ANSI.W+"x                             !DONE!                               x"+ANSI.RESET);
        return b;
    }
}
