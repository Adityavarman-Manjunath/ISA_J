package RANgen;

public class mapper {
    
    public static byte[] chargen(int cpmod,byte[] inputstream,double[] skey)
    {
        byte[] intrp=inputstream;
        
        for(int i=0;i<skey.length;i++)
        {
            for(int j=i;j<intrp.length;j+=9)
            {
                if(cpmod==0) 
                //plainmap[j]+=key[i];
                intrp[j]+=skey[i];
                else
                intrp[j]-=skey[i];
            }
        }
        return intrp;
        /*for(int j=0;j<plainmap.length;j++)
        {
            bin=Integer.toBinaryString(csmap[j]);
            System.out.print(bin+" "+j);
        }*/
    }   
}
