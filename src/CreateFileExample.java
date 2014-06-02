
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author tombisni@yahoo.com
 */
public class CreateFileExample {
    public static void main(String[] args) {
        String pathname =  System.getProperty("user.dir") + "/src/newfile.txt";
        File file = new File(pathname);
        
        try {
            if(file.createNewFile()){
                System.out.println("File telah dibuat!");
            }else{
                System.out.println("File sudah ada!");
            }
        } catch (IOException iOException) {
            Logger.getLogger(CreateFileExample.class.getName()).log(Level.SEVERE, null, iOException);
        }
    }
}