import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputOutputExample extends Thread
{

	   private PipedInputStream pi;
	   private PipedOutputStream po;
	 
	   PipedInputOutputExample(String name, PipedInputStream pi, PipedOutputStream po) {
	           this.setName(name);
	           this.pi = pi;
	           this.po = po;
	   }
	 
	   public void run() {
	       try {
	          if (getName().equals("Source")) {
	              byte source[] = new byte[10];
	              for (byte i = 0; i <= 9; i++)
	                  source[i] = i;
	              po.write(source, 0, 10); // write numbers 0 to 9
	              po.close();
	          } else {
	              byte[] data = new byte[10];
	              int len = pi.read(data, 0, 10);
	              for (int i = 0; i < len; i++)
	                   System.out.println(data[i]);
	              pi.close();
	          }
	       } catch (IOException e) {
	               e.printStackTrace();
	       } 
	   }
	 
	   public static void main(String[] args) throws Exception {
	      PipedOutputStream po = new PipedOutputStream();
	      PipedInputStream pi = new PipedInputStream(); // or new PipedInputStream(po);
	      System.out.println("ConnectIN");
	      pi.connect(po);
	      System.out.println("ConnectOut");
	      PipedInputOutputExample io1 = new PipedInputOutputExample("Source", pi, po);
	      System.out.println("IN");
	      PipedInputOutputExample io2 = new PipedInputOutputExample("Destination", pi, po);
	      io1.start();
	      Thread.sleep(10000);
	      io2.start();
	  }

}
