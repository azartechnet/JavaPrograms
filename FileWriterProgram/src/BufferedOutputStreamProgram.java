import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamProgram {

	public static void main(String as[])throws Exception
    {
          FileOutputStream fos=new FileOutputStream("E:\\d1.txt");
          BufferedOutputStream bos=new BufferedOutputStream(fos);
         String s="niit";
         byte b[]=s.getBytes();
         bos.write(b);
         bos.flush();
         fos.close();
         bos.close();            
    }

}
