package Frame;

import java.util.Random;

public class MyRandom {
    
    public static void main(String[] args) {
        Random random = new Random();

        // Random nextInt(bound) , 0 inclusive, bound exclusive.
        for (int i = 0 ; i < 1000; ++i){
            System.out.println(random.nextInt(100));
        }
    }
    
}
