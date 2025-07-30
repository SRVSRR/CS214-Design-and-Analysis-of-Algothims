/*
| `i` | `j` values       | Iterations |
| --- | ---------------- | ---------- |
| 0   | 2, 3, 4, 5, 6, 7 | 6          |
| 1   | 3, 4, 5, 6, 7    | 5          |
| 2   | 4, 5, 6, 7       | 4          |
| 3   | 5, 6, 7          | 3          |
| 4   | 6, 7             | 2          |
| 5   | 7                | 1          |
| 6   | –                | 0          |
| 7   | –                | 0          |
|     | **Total = 21**   |            |
*/

public class TimeComplexity {
    public static void main(String[] args) {
        int n = 7, counter = 0;
        for(int i = 0; i <= n; i++){
            for(int j = i + 2; j <= n; j++){
                counter++;
                System.out.println("counter" + counter);
            }
        }
    }
}