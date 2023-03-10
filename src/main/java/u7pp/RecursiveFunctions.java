package u7pp;
import java.util.ArrayList;

public class RecursiveFunctions {
    // Multiplies by itself minus 1 until it reaches 0
    public static double factorial(int balls){
        if(balls<=0){
            return 1; 
        } else {
            return balls * factorial(balls - 1);
        }
    }
    // Multiplies base by itself as many times as power specifies
    public static double pow(double base, int power){
        if(power <1){
            return 1;
        } else {
            return base * pow(base, power -1);
        }
    }
    // Simply calls fibonacci sequence until n <=2
    public static int fibonacci(int n){
        if(n <= 0){
            return 0;
        } else if (n <= 2){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    // Two different modes for even and odd strings: If it reaches the middle letter then it's always true,
    // Else, it checks if the first and last letters match, and if so, calls the function without the first and last letters.
    public static boolean isPalindrome(String strang){
        if(strang.length() == 0){
            return true;
        }
        if(strang.length() % 2 == 1){
            if(strang.length() == 1){
                return true;
            } else {
                if(strang.substring(0, 1).equals(strang.substring(strang.length()-1))){
                    return isPalindrome(strang.substring(1, strang.length() - 1));
                } else {
                    return false;
                }
            }
        } else if (strang.length() % 2 == 0){
            if(strang.length() == 2){
                if(strang.substring(0, 1).equals(strang.substring(strang.length()-1))){
                    return true;
                } else {
                    return false;
                }
            } else {
                if(strang.substring(0, 1).equals(strang.substring(strang.length()-1, strang.length()))){
                    return isPalindrome(strang.substring(1, strang.length() - 1));
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
    // Base case: the end of the list, and it adds a number each time called if the next int in list is a double of the one it's on.
    // Checks every item in list
    public static int nextIsDouble(int[] list, int whereAt){
        
        if(whereAt == list.length-1 || list.length == 0){
            return 0;
        } else{
            int count = 0;
            if(list[whereAt]*2 == list[whereAt+1]){
                count = 1;
            }
            return count + nextIsDouble(list, ++whereAt);
        }
    }
    // Function divides int by 2 every call, and if it's odd a 1 is added, else a 0 is. 
    public static String getBinary(int num){
        String retunr = "";
        if(num/2 == 0){
            if(num%2 == 1){
                return "1";
            }
            return "0";
        }else{
            if(num % 2 == 1){
                retunr = "1";
            } else {
                retunr = "0";
            }
            return getBinary(num/2) + retunr;
        }
    }
    // Checks if middle is the target, then checks if the search parameters are too small to continue, then divides
    // by half and checks correct half until target is found or every int has been checked. 
    public static int binarySearch(int[] list, int search, int begin, int end){
        System.out.println((end+begin)/2);
        if(list[(end+begin)/2] == search){
            return (end+begin)/2;
        }
        if (end-begin<1){
            return -1;
        } else {
            if(search > list[(end+begin)/2]){
                return binarySearch(list, search, ((end+begin)/2)+1, end);
            }else {
                return binarySearch(list, search, begin, ((end+begin)/2)-1);
            } 
        }
        
    }
    // Returns true if on border, else, checks every adjacent tile if they're lower, and if so, calls the whole
    // function for that path, but if it ends up failing, circles back to check every adjacent path from the beginning
    // so that every path is checked.
    public static boolean canFlowOffMap(int[][] map, int row, int col){
        //check border first
        if((row == 0) || (row == map.length - 1) || (col == 0) || (col == map[0].length-1)){
            return true;
        }
        
        if(map[row][col-1] < map[row][col]){
            if(canFlowOffMap(map, row, col-1) == true){
                return true;
            } else {
                if(map[row-1][col] < map[row][col]){
                    return canFlowOffMap(map, row-1, col);
                } else if(map[row][col+1] < map[row][col]){
                    return canFlowOffMap(map, row, col+1);
                } else if(map[row+1][col] < map[row][col]){
                    return canFlowOffMap(map, row+1, col);
                } else {
                    return false;
                }
            }
        } else if(map[row-1][col] < map[row][col]){
            if(canFlowOffMap(map, row-1, col) == true){
                return true;
            } else {
                if(map[row][col-1] < map[row][col]){
                    return canFlowOffMap(map, row-1, col);
                } else if(map[row][col+1] < map[row][col]){
                    return canFlowOffMap(map, row, col+1);
                } else if(map[row+1][col] < map[row][col]){
                    return canFlowOffMap(map, row+1, col);
                } else {
                    return false;
                }
            }
        } else if(map[row][col+1] < map[row][col]){
            if(canFlowOffMap(map, row, col+1) == true){
                return true;
            } else {
                if(map[row-1][col] < map[row][col]){
                    return canFlowOffMap(map, row-1, col);
                } else if(map[row][col-1] < map[row][col]){
                    return canFlowOffMap(map, row, col+1);
                } else if(map[row+1][col] < map[row][col]){
                    return canFlowOffMap(map, row+1, col);
                } else {
                    return false;
                }
            }
        } else if(map[row+1][col] < map[row][col]){
            if(canFlowOffMap(map, row+1, col) == true){
                return true;
            } else {
                if(map[row-1][col] < map[row][col]){
                    return canFlowOffMap(map, row-1, col);
                } else if(map[row][col+1] < map[row][col]){
                    return canFlowOffMap(map, row, col+1);
                } else if(map[row][col-1] < map[row][col]){
                    return canFlowOffMap(map, row+1, col);
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }

    }

}
