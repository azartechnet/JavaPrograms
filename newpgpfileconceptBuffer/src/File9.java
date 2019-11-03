import java.io.*;
class File9
{
   public static void main(String as[])throws Exception
  {
      FileInputStream fis=new FileInputStream("E:\\f3.txt");
      BufferedInputStream bis=new BufferedInputStream(fis);
      int i=0;
      while((i=bis.read())!=-1)
      {
            System.out.print((char)i);
      }
      fis.close();
      bis.close();
   }
}

//FileReader frd=new FileReader("D:\\abc.txt");
//int i=0;
//while((i=frd.read())!=-1)
//{
//    System.out.print((char)i);
//}
//frd.close();