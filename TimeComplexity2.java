/*
| `i` | `j` values      | Iterations |
| --- | --------------- | ---------- |
| 0   | 2 3 4 5 6 7 8 9 | 8          |
| 1   | 3 4 5 6 7 8 9   | 7          |
| 2   | 4 5 6 7 8 9     | 6          |
| 3   | 5 6 7 8 9       | 5          |
| 4   | 6 7 8 9         | 4          |
| 5   | 7 8 9           | 3          |
| 6   | 8 9             | 2          |
| 7   | 9               | 1          |
| 8   | –               | 0          |
| 9   | –               | 0          |
*/

public class TimeComplexity2 {
    public static void main(String[] args) {
        int n = 9, counter = 0;
        for(int i = 0; i <= n; i++){
            for(int j = i + 2; j <= n; j++){
                counter++;
                System.out.println("counter" + counter);
            }
        }
    }
}