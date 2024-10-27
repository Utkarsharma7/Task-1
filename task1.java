import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.HashSet;
import java.util.Scanner;
public class task1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Input the size of the left table join key vector");
        int numRowsLeft=s.nextInt();
        vector obj1=new vector(numRowsLeft);
        System.out.println("Input the size of the right table join key vector");
        int numRowsRight=s.nextInt();
        vector obj2=new vector(numRowsRight);
    
        Random random = new Random();

       //generation of unique numbers in the first array
        HashSet<Integer>set=new HashSet<>();
        int a=obj1.size;
        while(a!=0)
        {
            int n =random.nextInt(10);
            if(set.add(n))
            {
                obj1.data[a-1]=n;
                a--;
            }
            
        }

        // Initialize all positions in obj2.data to -1 to represent empty slots
        for (int i = 0; i < obj2.data.length; i++) {
            obj2.data[i] = -1;
        }

        int filledSlots = 0;
        while (filledSlots < obj2.data.length) {
            // Randomly select a number from obj1.data
            long selectedNum = obj1.data[random.nextInt(obj1.data.length)];

            // Randomly determine how many times to insert the number (at least once)
            int count = random.nextInt(obj2.data.length - filledSlots) + 1;

            // Create a list of indices for available positions in obj2.data
            ArrayList<Integer> availablePositions = new ArrayList<>();
            for (int i = 0; i < obj2.data.length; i++) {
                if (obj2.data[i] == -1) { // Check if position is empty
                    availablePositions.add(i);
                }
            }

            // Shuffle the list of available positions to ensure randomness
            Collections.shuffle(availablePositions);

            // Insert selectedNum into random positions in obj2.data
            for (int i = 0; i < count && filledSlots < obj2.data.length; i++) {
                int randomPos = availablePositions.get(i); // Pick a random available position
                obj2.data[randomPos] = selectedNum;
                filledSlots++;
            }
        }
        System.out.println("The first Array ");
        for(int i=0;i<obj1.size;i++)
        {
            System.out.println(obj1.data[i]);
        }
        // Print the filled second array
        System.out.println("Filled second array: \n");
        for (long num : obj2.data) {
            System.out.print(num + "\n");
        }
    }
}

