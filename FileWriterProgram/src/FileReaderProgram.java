import java.io.FileReader;
import java.io.IOException;

public class FileReaderProgram {

	 public static void main(String as[])throws IOException
	   {
	        FileReader frd=new FileReader("E:\\dd.txt");
	        int i;
	       while((i=frd.read())!=-1)
	       {
	            System.out.print((char)i);
	        }
	       frd.close();
	    }
}

