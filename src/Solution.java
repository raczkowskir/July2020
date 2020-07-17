// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public static void main(String[] args) {
        Solution solutionObj = new Solution();
        System.out.println(solutionObj.solution(99999999));
    }
    public String cutOpeningZeros(String myString) {
        int i = 0;
        int stringLength = myString.length();

        while(true) {
            String myPrefix = myString.substring(i, i + 1);

            if (myPrefix.equals("1")) {
                return myString.substring(i, stringLength);
            }
            else {
                i++;
            }
        }
    }

    public String cutClosingZeros(String myString) {
        int i = myString.length();

        while(true) {
            String mySuffix = myString.substring(i -1, i);

            if (mySuffix.equals("1")) {
                return myString.substring(0, i);
            }
            else {
                i--;
            }
        }
    }

    public int returnGap(String str) {
        String strOfZeros = "0";
        int gap = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.contains(strOfZeros)) {
                strOfZeros = strOfZeros + "0";
                gap = i + 1;
            }
        }

        return gap;
    }

    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        System.out.println("The value of N is:"+ N);
        System.out.println("The binary value of N is:"+ binaryString);

        String withOutPrefix = cutOpeningZeros(binaryString);
        System.out.println("Binary string without prefixes:"+ withOutPrefix);
        String withOutSuffix = cutClosingZeros(withOutPrefix);
        System.out.println("Binary string without suffixes:"+ withOutSuffix);

        int gap = returnGap(withOutSuffix);

        System.out.println("Gap:" + gap);

        return gap;
    }
}
