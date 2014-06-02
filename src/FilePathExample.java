import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author tombisnis@yahoo.com
 */
public class FilePathExample {
    public static void main(String[] args) {
        String filename = "/src/resources/New Text Document.txt";
        String finalfile = "";
        String workingDir = System.getProperty("user.dir");
        
        String your_os = System.getProperty("os.name").toLowerCase();
        
        if(your_os.indexOf("win") >= 0){
            finalfile = workingDir + "\\" +filename;
        }else if (your_os.indexOf("nix") >= 0 || your_os.indexOf("nux") >= 0) {
            finalfile = workingDir + "/" +filename;
        }else{
            finalfile = workingDir + "{others}" +filename;
        }
        
        System.out.println("Final filepath : "+finalfile);
        
        File file = new File(finalfile);
        
        try {
            if(file.createNewFile()){
                System.out.println("Done");
            }else{
                System.out.println("File already exists!");
            }
        } catch (IOException iOException) {
            Logger.getLogger(FilePathExample.class.getName()).log(Level.SEVERE, null, iOException);
        }
    }
}