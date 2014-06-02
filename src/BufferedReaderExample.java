import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author tombisnis@yahoo.com
 */
public class BufferedReaderExample {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;

        try{
            String CurrentLine;
            
            bufferedReader = new BufferedReader(new FileReader("src/resources/New Text Document.txt"));
            
            while((CurrentLine = bufferedReader.readLine()) != null){
                System.out.println(CurrentLine);
            }
        }catch(IOException iOException){
            Logger.getLogger(BufferedReaderExample.class.getName()).log(Level.SEVERE, null, iOException);
        }finally{
            try {
                if(bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException iOException) {
                Logger.getLogger(BufferedReaderExample.class.getName()).log(Level.SEVERE, null, iOException);
            }
        }
    }
}