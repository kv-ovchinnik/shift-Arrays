import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(" Массив: " + array);
        System.out.println("Введите на сколько сдвинуть массив: ");
        int n = kb.nextInt();

        System.out.println("Сдвиг влево: ");
        for (int i = 0; i < n; i++) {
            int left = array [0];
            for (int l = 0; l<array.length - 1; l++)
                array[l] = array[l + 1];
            array[array.length - 1] = left;
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Сдвиг вправо: ");
        for ( int u = 0; u < array.length; u++){
            array[u] = u;
        }
        for ( int u = 0; u < n; u++){
            int right = array[array.length - 1];

            for (int p = array.length - 1; p > 0; p--) {
                array[p] = array [p - 1];

            }
            array[0] = right;

        }
        System.out.println(Arrays.toString(array));
        System.out.println();



           // Сортировка
        for  ( int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[i]){
                    int buffer = array[i];
                    array [i] = array[j];
                    array[j] = buffer;
                }
            }
        }
        System.out.println(Arrays.toString(array));


        }
    }
