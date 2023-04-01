import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл

public class HW2_task1 {
    public static void main(String[] args) {
        int[] arr = {5,1,6,8,6,4,3,2,9,0};
        String file_name = "bubble.txt";

        File bubble = new File(file_name);
        try{
            FileWriter writer = new FileWriter(bubble, false);
            boolean isSorted = false;
            int tmp;
            while(!isSorted){
                isSorted = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i]>arr[i+1]){
                        isSorted = false;
                        tmp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = tmp;
                    }

                }
                System.out.println(Arrays.toString(arr));
                writer.write(Arrays.toString(arr));
                writer.write("\n");

            }
            writer.close();
            System.out.println("Done!");

        }
        catch (Exception e){ System.out.println("Something's gone wrong");}



    }
}
