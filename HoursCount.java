import java.util.*;

public class HoursCount {
    public static void main(String args[]) {
        int c = 0;
        int x;
        int arr[] = { 1, 59, 30, 30, 300, 70, 60, 0, 674656, 62626, 424, 6655346, 777666 };
        Arrays.sort(arr);
        for (x = 0; x < arr.length; x++) {
            if (arr[x] > 60)
                break;
        }
        for (int i = 0; i < x - 1; i++) {
            for (int j = i + 1; j < x; j++) {
                if (arr[i] + arr[j] == 60) {
                    System.out.println(arr[i] + " " + arr[j]);
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
