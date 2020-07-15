// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);

        System.out.println("The value of N is:"+ N);
        System.out.println("The binar value of N is:"+ binaryString);

        int gap = 0;
        int gap2 = 0;

        for (int i = 0, n = binaryString.length(); i < n; i++) {
            char c = binaryString.charAt(i);
            if (c == '0') {
                gap = gap + 1;
            }
            else {
                gap2 = gap;
                gap = 0;
            }
            System.out.println("The char number " + i + " is: " + c + "And gap=" + gap);
            if (((i == 0) || (i == n - 1)) && (c == '0')) {
                gap = 0;
            }
        }

        if (gap > gap2) return gap;
        else return gap2;

    }
}
