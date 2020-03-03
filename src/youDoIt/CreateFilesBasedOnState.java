package youDoIt;

import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Path;

public class CreateFilesBasedOnState {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        Path inStateFile = Paths.get("C:\\Users\\mn145140\\Desktop\\CSA\\Chapter-Thirteen\\src\\youDoIt\\InStateCusts.txt");
        Path outOfStateFile = Paths.get("C:\\Users\\mn145140\\Desktop\\CSA\\Chapter-Thirteen\\src\\youDoIt\\OutOfStateCusts.txt");

        final String ID_FORMAT = "000";
        final String NAME_FORMAT = "    ";
        final int NAME_LENGTH = NAME_FORMAT.length();
        final String HOME_STATE = "IA";
        final String BALANCE_FORMAT = "0000.00";
        String delimiter = ",";
        String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + HOME_STATE + delimiter + BALANCE_FORMAT +
                System.getProperty("line.separator");
        final int RECSIZE = s.length();
        FileChannel fcIn = null;
        FileChannel fcOut = null;
        String idString;
        int id;
        String name;
        String state;
        double balance;
        final String QUIT = "999";

        createEmptyFile(inStateFile, s);
        createEmptyFile(outOfStateFile, s);

    }
    public static void createEmptyFile(Path file, String s){
        final int NUMRECS = 1000;
        
    }


}
