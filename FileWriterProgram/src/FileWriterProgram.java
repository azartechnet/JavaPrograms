import java.io.FileWriter;
import java.io.IOException;

public class FileWriterProgram {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("E:\\dd.txt");
        fw.write("hi how r u");
        fw.flush();
        fw.close();

	}

}
