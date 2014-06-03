import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author tombisnis@yahoo.com
 */
public class WriteToFileExample {
    public static void main(String[] args) {
        try{
            String Content = "This is the content to write into file";
        
            File file = new File("src/resources/New Text Document.txt");
        
            if(!file.exists()){
                file.createNewFile();
            }
            
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(Content);
            bufferedWriter.close();
            
            System.out.println("Done");
        }catch(IOException ex){
            Logger.getLogger(WriteToFileExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}