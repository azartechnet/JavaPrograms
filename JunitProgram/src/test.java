import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class test {
	public static int greatest(int a, int b, int c)
    {
        if(a>b && a>c)
        return a;
        else if(b>a && b>c)
        return b;
        else
        return c;
    }


}
