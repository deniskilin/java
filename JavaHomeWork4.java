
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
public class JavaHomeWork4 {
    private static final Logger logger = Logger.getLogger(HomeWork4.class.getName());
    
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
            logger.log(Level.INFO, "Iteration {0}: {1}", new Object[]{i+1, java.util.Arrays.toString(sortArr)});
        }
    }
    
    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        try {
            FileHandler fileHandler = new FileHandler("mylog.log");
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to create log file", e);
        }
        logger.log(Level.INFO, "Sorting started");
        bubbleSort(sortArr);
        logger.log(Level.INFO, "Sorting finished");
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }
}
