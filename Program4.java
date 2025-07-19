package in.manya.screeningtest;

import java.util.HashMap;
import java.util.Map;

public class Program4 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : arr) {
                if (num % i == 0) {
                    count++;
                }
            }
            m.put(i, count);
        }

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


	}

}
