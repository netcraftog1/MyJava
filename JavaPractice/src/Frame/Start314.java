package Frame;

import java.util.HashSet;
import java.util.Random;

public class Start314 {
    public static int [] shuffle(){
        int [] arr = new int[10];
        HashSet<Integer> set = new HashSet<Integer>();
        Random random = new Random();

        for (int i = 0; i<10; ++i) {
            while(true) {
                int temp = random.nextInt(10);
                if(set.contains(temp) == false) {
                    set.add(temp);
                    arr[i]=temp;
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int counter = 0;

        for (int i =0; i < 1000000; i++) {
            int[] arr = Start314.shuffle();
            if (arr[0] == 3 && arr[1]==1 && arr[2]==4)
                ++counter;
        }

        System.out.println("Predict times  1/10 * 1/9 * 1/8 = 0.001388 * 1,000,000 = 1388"  );
        System.err.println("Occur times : " + counter);
    }
}
