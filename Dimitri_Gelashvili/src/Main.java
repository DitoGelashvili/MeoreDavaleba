import java.io.File;
import java.util.Scanner;
import org.apache.log4j.Logger;
import java.io.FilenameFilter;

public class Main {
    final static Logger logger=Logger.getLogger(Main.class);
    public static void main(String[] args) {
        Scanner inputi=new Scanner(System.in);
        String shemotaniliSityva;
        System.out.println("შემოიტანე საძიებო სიტყვა: ");
        shemotaniliSityva=inputi.next();
        File file=new File("C:\\Users\\dito\\Desktop\\Dito");
        String[] faili=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(!name.toLowerCase().startsWith(shemotaniliSityva.toLowerCase())) {
                    return false;
                }else {
                    return true;
                }
            }
        });
        for(String saxeli:faili) {
            logger.info("shemotanili sityva: "+shemotaniliSityva);
            logger.info("napovni iqna faili/saqagale: "+shemotaniliSityva);

            System.out.println(saxeli);
        }
    }
}