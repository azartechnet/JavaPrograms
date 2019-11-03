import java.io.*;
class File8
{
      public static void main(String as[])throws Exception
      {
            FileOutputStream fos=new FileOutputStream("E:\\f3.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos);
           String s="niit";
           byte b[]=s.getBytes();
           bos.write(b);
           bos.flush();
           fos.close();
           bos.close();            
      }
}

//FileWriter fw=new FileWriter("dd.txt");
//fw.write("hi how r u");
//fw.flush();
//fw.close();