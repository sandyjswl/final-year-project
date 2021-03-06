import java.io.*;
import java.security.MessageDigest;

public class MD5 {

   public static byte[] createChecksum(String filename) throws Exception{
     InputStream fis =  new FileInputStream(filename);
     byte[] buffer = new byte[1024];
     MessageDigest complete = MessageDigest.getInstance("MD5");
     int numRead;
     do {
      numRead = fis.read(buffer);
      if (numRead > 0) {
        complete.update(buffer, 0, numRead);
        }
      } while (numRead != -1);
     fis.close();
     return complete.digest();
   }


   public static String getMD5Checksum(String filename) throws Exception {
     byte[] b = createChecksum(filename);
     String result = "";
     for (int i=0; i < b.length; i++) {
       result +=
          Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
      }
     return result;
   }

   public static void main(String args[]) {
     try {
       String myDirectoryPath = "data";
       File dir = new File(myDirectoryPath);
       File[] directoryListing = dir.listFiles();
       if (directoryListing != null) {
         for (File child : directoryListing) {
        System.out.println("File Name: "+child);
        String stringChild = "" + child;
        System.out.print("HashCode Generated by MD5: ");
        long startTime = System.currentTimeMillis();
        System.out.println(getMD5Checksum(stringChild));
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken: "+(endTime - startTime) + " ms");
        System.out.println();

          }
        }
      }
     catch (Exception e) {
         e.printStackTrace();
     }
   }
}
