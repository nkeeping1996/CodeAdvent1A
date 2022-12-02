import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> numSums = new ArrayList<Integer>();

        File f = new File("src/AdventCode1ANumbers");
        FileReader fd = new FileReader(f);
        BufferedReader br = new BufferedReader(fd);
        String line;
        int num = 0;
        while ((line = br.readLine()) != null) {
            if(line.length() != 0){
                num += Integer.parseInt(line);
                continue;
            }
            numSums.add(num);
            num = 0;
        }

        int totalForThree = 0;

        for(int m = 0; m <3; m++){
            int maxCal = numSums.get(0);
            for(int i : numSums){
                if(i > maxCal){
                    maxCal = i;
                }
            }
            totalForThree+=maxCal;
            numSums.remove(numSums.get(numSums.indexOf(maxCal)));
        }

        System.out.println(totalForThree);


    }
}