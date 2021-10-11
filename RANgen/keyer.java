package RANgen;

public class keyer {
    
    static int p;
    static int q;
    static double x1, x2, x3, y1, y2, y3, z1, z2, z3;
    
    static double[] pts = new double[9];
    static double[] key = new double[9];

    public static double[] keygen(double[] key)//algorithm
    {
        p=seeder.seedgen();
        q=seeder.seedgen();
		while(q>p)
		{
			q=seeder.seedgen();
		}
        x1 = 2 * Math.pow(p, 2) + 2 * p * q;
        y1 = Math.pow(q, 2) + 2 * p * q;
        z1 = 2 * Math.pow(p, 2) + Math.pow(q, 2) + 2 * p * q;

        x2 = 2 * Math.pow(p, 2) - 2 * p * q;
        y2 = Math.pow(q, 2) - 2 * p * q;
        z2 = 2 * Math.pow(p, 2) + Math.pow(q, 2) - 2 * p * q;

        x3 = 2 * p * q;
        y3 = Math.pow(p, 2) - Math.pow(q, 2);
        z3 = Math.pow(p, 2) + Math.pow(q, 2);
		pts[0]=x1;
		pts[1]=x2;
		pts[2]=x3;
		pts[3]=y1;
		pts[4]=y2;
		pts[5]=y3;
		pts[6]=z1;
		pts[7]=z2;
		pts[8]=z3;

		key[0] = x1 % 100000;
        key[1] = y1 % 10000;
        key[2] = z1 % 10000;
        key[3] = x2 % 10000;
        key[4] = y2 % 10000;
        key[5] = z2 % 10000;
        key[6] = x3 % 10000;
        key[7] = y3 % 10000;
        key[8] = z3 % 10000;

        for (int i = 0; i < key.length; i++)
        {
            if (key[i] < 0) key[i] += 10000;
        }
        return key;
    }

}
