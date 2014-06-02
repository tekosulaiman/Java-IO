import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author tombisnis@yahoo.com
 */
public class FilePermissionExample {
    public static void main(String[] args) {
        try {
            File file = new File("src/DnsJumper.exe");

            if(file.exists()){
                System.out.println("Is Execute allow : "+file.canExecute());
                System.out.println("Is Write allow : "+file.canWrite());
                System.out.println("Is Read allow : "+file.canRead());
            }

            file.setExecutable(false);
            file.setWritable(false);
            file.setReadable(false);

            System.out.println("");
            
            System.out.println("Is Execute allow : "+file.canExecute());
            System.out.println("Is Write allow : "+file.canWrite());
            System.out.println("Is Read allow : "+file.canRead());
        
        
            if(file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists.");
            }
        } catch (IOException iOException) {
            Logger.getLogger(FilePermissionExample.class.getName()).log(Level.SEVERE, null, iOException);
        }
    }
}