import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      // Path g=Paths.get("D:\\f1.txt");
         FileSystem f1=FileSystems.getDefault();
         Path f=Paths.get("D:\\v1.txt");
	      /* System.out.println(""+g.getNameCount());
	       System.out.println(""+g.getClass());
	       System.out.println(""+g.getFileName());
	       System.out.println(""+g.getName(0));
	       System.out.println(""+g.getParent());
	       System.out.println(""+g.getRoot());
	       System.out.println(""+g.getFileSystem());
	       System.out.println("SubPath"+g.subpath(0, 1));
	       
	       System.out.format("path %s",g,Files.exists(g, LinkOption.NOFOLLOW_LINKS));*/
         
         System.out.println("FileSystem"+f.getFileSystem());

	}

}
