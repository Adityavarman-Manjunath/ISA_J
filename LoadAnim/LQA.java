package LoadAnim;

public class LQA {

    static float temp=0;
    static int lgtr=0;
    public static void loader(float lgt)
    throws Exception{
            //String anim= "|/-\\"; 
            String anim= "|‾|_"; 
            String anim2= "|_|‾";                     
            lgtr=((int)lgt)+1;
            int tmp=lgtr % anim.length();
            String data="";
            while(temp!=lgt)
            {
 
            switch(tmp)
            {
             case 0:
              data = "\r\t\t\t\t\t\t\t\t\t" + anim2.charAt(tmp) + "   " + lgtr+"% processing!!" +"   "+ anim.charAt(tmp)+"  ";                              
             break;
             case 1:
              data = "\r\t\t\t\t\t\t\t\t\t" + " " + anim2.charAt(tmp) + "  " + lgtr+"% processing!!"+"  "+ anim.charAt(tmp)+"   "; 
             break;            
             case 2:
              data = "\r\t\t\t\t\t\t\t\t\t" + "  " + anim2.charAt(tmp) + " " + lgtr+"% processing!!"+" "+ anim.charAt(tmp)+"    ";                             
             break;             
             case 3:           
              data = "\r\t\t\t\t\t\t\t\t\t" + " " + anim2.charAt(tmp) + "  " + lgtr+"% processing!!"+"  "+ anim.charAt(tmp)+"   ";                              
             break;             
            }
            
            System.out.write(data.getBytes());
            Thread.sleep(3);
            temp=lgt;
            break;
            }
            
            

    }
}
