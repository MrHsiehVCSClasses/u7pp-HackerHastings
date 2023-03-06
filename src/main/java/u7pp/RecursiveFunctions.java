package u7pp;

public class RecursiveFunctions {
    
    // precondition: n is nonnegative
    public static double factorial(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    // precondition: power is nonnegative 
    public static double pow( double base, int power ) {
        if(power == 0) {
            return 1;
        }
        return base * pow(base, power-1);
    }

    // precondition: n is nonnegative
    public static int fibonacci(int n) {
        // return the nth fibonacci number
        if (n <= 0) return 0;
        if(n <= 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // Case sensitive
    public static boolean isPalindrome(String s) {
        if(s.length() <= 1) {
            return true;
        }
        if(s.substring(0,1).equals(s.substring(s.length()-1))) {
            return isPalindrome(s.substring(1,s.length()-1));
        }
        return false;
    }

    // returns the number of adjacent pairs in the array where the second element is double the first element
    public static int nextIsDouble(int[] data, int startIndex) {
        if(startIndex >= data.length-1) {
            return 0;
        }
        if(data[startIndex] * 2 == data[startIndex + 1]) {
            return 1 + nextIsDouble(data, startIndex+1);
        }
        return nextIsDouble(data, startIndex+1);
    }

    // precondition: n is a positive integer
    public static String getBinary(int n) {
        if(n == 0) {
            return "";
        }
        if(n%2 == 1) {
            return getBinary(n/2) + "1";
        } else {
            return getBinary(n/2) + "0";
        }
    }

    // returns the index if found
    // returns -1 if not found
    // binary search refresher: https://www.youtube.com/watch?v=KXJSjte_OAI
    public static int binarySearch(int[] array, int searchValue, int start, int end) {

        if(start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if(array[mid] == searchValue) {
            return mid;
        }
        if(searchValue > array[mid]) {
            return binarySearch(array, searchValue, mid+1, end);
        } else {
            return binarySearch(array, searchValue, start,mid-1);
        }
    }

    public static boolean canFlowOffMap(int[][] map, int r, int c) {

        if(r == 0 || c == 0 || r == map.length-1 || c == map[0].length-1) {
            return true;
        }

        int currVal = map[r][c];

        if(currVal > map[r-1][c]) {
            if(canFlowOffMap(map, r-1, c)) {
                return true;
            }
        }

        if(currVal > map[r+1][c]) {
            if(canFlowOffMap(map, r+1, c)) {
                return true;
            }
        }

        if(currVal > map[r][c-1]) {
            if(canFlowOffMap(map, r, c-1)) {
                return true;
            }
        }

        if(currVal > map[r][c+1]) {
            if(canFlowOffMap(map, r, c+1)) {
                return true;
            }
        }
        
        return false;
    }
}
