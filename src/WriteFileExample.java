import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author tombisnis@yahoo.com
 */
public class WriteFileExample {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        File file;
        
        String Content = "This is the text content";
        
        try {
            file = new File("src/resources/New Text Document.txt");
        
            fileOutputStream = new FileOutputStream(file);
            
            if(!file.exists()){
                file.createNewFile();
            }
            
            byte[] ContentInByte = Content.getBytes();
            fileOutputStream.write(ContentInByte);
            fileOutputStream.flush();
            fileOutputStream.close();
            
            System.out.println("Done");
        }catch(IOException iOException){
            Logger.getLogger(WriteFileExample.class.getName()).log(Level.SEVERE, null, iOException);
        }finally{
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(WriteFileExample.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}