package Crypto;


public class exthnld {
    public static String exth(String ext1)   
    {
        			String addext1="";
			
			//extension stack
			switch(ext1)
			{
				case "pdf":addext1="pdf";
				break;
				case "mp3":addext1="mp3";
				break;
				case "mp4":addext1="mp4";
				break;
				case "docx":addext1="docx";
				break;
				case "m4a":addext1="m4a";
				break;
				case "mkv":addext1="mkv";
				break;
				case "jpg":addext1="jpg";
				break;
				case "txt":addext1="txt";
				break;
				case ".7z":addext1="7z";
				break;
				default:addext1="ney";
			}
            return addext1;
    }
}
