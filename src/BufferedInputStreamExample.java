import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author tombisnis@yahoo.com
 */
public class BufferedInputStreamExample {
    public static void main(String[] args) {
        File file = new File("src/testing.txt");
    
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        DataInputStream dataInputStream = null;
    
        try{
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            dataInputStream = new DataInputStream(bufferedInputStream);
        }catch(IOException iOException){
            Logger.getLogger(BufferedInputStreamExample.class.getName()).log(Level.SEVERE, null, iOException);
        }finally{
            try{
                fileInputStream.close();
                bufferedInputStream.close();
                dataInputStream.close();
            }catch(IOException iOException){
                Logger.getLogger(BufferedInputStreamExample.class.getName()).log(Level.SEVERE, null, iOException);
            }
        }
    }
}