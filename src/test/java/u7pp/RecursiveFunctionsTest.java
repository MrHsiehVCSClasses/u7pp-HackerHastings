package u7pp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RecursiveFunctionsTest {
    

    @Test
    public void factorial_0_returns1() {
        assertEquals(1, RecursiveFunctions.factorial(0));
        
    }

    @Test
    public void factorial_1_returns1() {
        assertEquals(1, RecursiveFunctions.factorial(1));
        
    }

    @Test
    public void factorial_2_returns2() {
        assertEquals(2, RecursiveFunctions.factorial(2));
        
    }

    @Test
    public void factorial_3_returns6() {
        assertEquals(6, RecursiveFunctions.factorial(3));
        
    }

    @Test
    public void factorial_4_returns24() {
        assertEquals(24, RecursiveFunctions.factorial(4));
        
    }

    @Test
    public void factorial_5_returns120() {
        assertEquals(120, RecursiveFunctions.factorial(5));
        
    }

    @Test
    public void factorial_10_returnsCorrect() {
        assertEquals(3628800, RecursiveFunctions.factorial(10));
    }

    @Test
    public void factorial_21_returnsCorrect() {
        assertEquals(5.109094217170944E19, RecursiveFunctions.factorial(21));
    }

    @Test
    public void factorial_100_returnsCorrect() {
        assertEquals(9.33262154439441e157, RecursiveFunctions.factorial(100));
    }

    @Test
    public void pow_exp0_returns1() {
        assertEquals(1, RecursiveFunctions.pow(10, 0));
        assertEquals(1, RecursiveFunctions.pow(100, 0));
        assertEquals(1, RecursiveFunctions.pow(-10, 0));
    }

    @Test
    public void pow_exp1_returnsBase() {
        assertEquals(10, RecursiveFunctions.pow(10, 1));
        assertEquals(100, RecursiveFunctions.pow(100, 1));
        assertEquals(-10, RecursiveFunctions.pow(-10, 1));
    }

    @Test
    public void pow_base0_returns0() {
        assertEquals(0, RecursiveFunctions.pow(0, 1));
        assertEquals(0, RecursiveFunctions.pow(0, 2));
        assertEquals(0, RecursiveFunctions.pow(0, 3));
        assertEquals(0, RecursiveFunctions.pow(0, 4));
    }

    @Test
    public void pow_base1_returns1() {
        assertEquals(1, RecursiveFunctions.pow(1, 1));
        assertEquals(1, RecursiveFunctions.pow(1, 2));
        assertEquals(1, RecursiveFunctions.pow(1, 3));
        assertEquals(1, RecursiveFunctions.pow(1, 4));
    }

    @Test
    public void pow_exp2_returnsSquare() {
        assertEquals(100, RecursiveFunctions.pow(10, 2));
        assertEquals(10000, RecursiveFunctions.pow(100, 2));
        assertEquals(0, RecursiveFunctions.pow(0, 2));
        assertEquals(100, RecursiveFunctions.pow(-10, 2));
    }

    @Test
    public void pow_exp5_returnsCorrect() {
        assertEquals(100000, RecursiveFunctions.pow(10, 5));
        assertEquals(1E10, RecursiveFunctions.pow(100, 5));
        assertEquals(-1E5, RecursiveFunctions.pow(-10, 5));
    }

    @Test
    public void pow_negativeBase_signCorrect() {
        assertEquals(-1, RecursiveFunctions.pow(-1, 1));
        assertEquals(1, RecursiveFunctions.pow(-1, 2));
        assertEquals(-1, RecursiveFunctions.pow(-1, 3));
        assertEquals(1, RecursiveFunctions.pow(-1, 4));
    }

    @Test
    public void pow_decimalBase_correct() {
        assertEquals(0.5, RecursiveFunctions.pow(0.5, 1));
        assertEquals(0.25, RecursiveFunctions.pow(0.5, 2));
        assertEquals(0.125, RecursiveFunctions.pow(0.5, 3));
        assertEquals(0.0625, RecursiveFunctions.pow(0.5, 4));
    }

    @Test
    public void pow_bigExp_correct() {
        assertEquals(0, RecursiveFunctions.pow(0, 100));
        assertEquals(7.888609052210118E-31, RecursiveFunctions.pow(0.5, 100));
        assertEquals(1, RecursiveFunctions.pow(1, 100));
        assertEquals(4.0656117753521523E17, RecursiveFunctions.pow(1.5, 100));
        assertEquals(1.2676506002282294E30, RecursiveFunctions.pow(2, 100));
        assertEquals(7.888609052210118E-31, RecursiveFunctions.pow(-0.5, 100));
        assertEquals(1, RecursiveFunctions.pow(-1, 100));
        assertEquals(4.0656117753521523E17, RecursiveFunctions.pow(-1.5, 100));
        assertEquals(1.2676506002282294E30, RecursiveFunctions.pow(-2, 100));
    }

    @Test
    public void fibonacci_0_returns0() {
        assertEquals(0, RecursiveFunctions.fibonacci(0));
        
    }

    @Test
    public void fibonacci_1_returns1() {
        assertEquals(1, RecursiveFunctions.fibonacci(1));
        
    }

    @Test
    public void fibonacci_2_returns1() {
        assertEquals(1, RecursiveFunctions.fibonacci(2));
        
    }

    @Test
    public void fibonacci_3_returns2() {
        assertEquals(2, RecursiveFunctions.fibonacci(3));
        
    }

    @Test
    public void fibonacci_4_returns3() {
        assertEquals(3, RecursiveFunctions.fibonacci(4));
        
    }

    @Test
    public void fibonacci_5_returns5() {
        assertEquals(5, RecursiveFunctions.fibonacci(5));
        
    }

    @Test
    public void fibonacci_10_returnsCorrect() {
        assertEquals(55, RecursiveFunctions.fibonacci(10));
    }

    @Test
    public void fibonacci_21_returnsCorrect() {
        assertEquals(10946, RecursiveFunctions.fibonacci(21));
    }

    @Test
    public void fibonacci_32_returnsCorrect() {
        assertEquals(2178309, RecursiveFunctions.fibonacci(32));
    }

    @Test
    public void isPalindrome_emptyString_returnsTrue() {
        assertTrue(RecursiveFunctions.isPalindrome(""));
    }

    @Test
    public void isPalindrome_singleChar_returnsTrue() {
        assertTrue(RecursiveFunctions.isPalindrome("1"));
        assertTrue(RecursiveFunctions.isPalindrome("a"));
        assertTrue(RecursiveFunctions.isPalindrome("A"));
        assertTrue(RecursiveFunctions.isPalindrome("$"));
        assertTrue(RecursiveFunctions.isPalindrome(" "));
    }

    @Test
    public void isPalindrome_twoSameChar_returnsTrue() {
        assertTrue(RecursiveFunctions.isPalindrome("11"));
        assertTrue(RecursiveFunctions.isPalindrome("aa"));
        assertTrue(RecursiveFunctions.isPalindrome("AA"));
        assertTrue(RecursiveFunctions.isPalindrome("$$"));
        assertTrue(RecursiveFunctions.isPalindrome("  "));
    }

    @Test
    public void isPalindrome_twoDiffChar_returnsFalse() {
        assertFalse(RecursiveFunctions.isPalindrome("10"));
        assertFalse(RecursiveFunctions.isPalindrome("ab"));
        assertFalse(RecursiveFunctions.isPalindrome("AB"));
        assertFalse(RecursiveFunctions.isPalindrome("$%"));
        assertFalse(RecursiveFunctions.isPalindrome(" _"));
    }

    @Test
    public void isPalindrome_threeCharCorrect_returnsTrue() {
        assertTrue(RecursiveFunctions.isPalindrome("101"));
        assertTrue(RecursiveFunctions.isPalindrome("aba"));
        assertTrue(RecursiveFunctions.isPalindrome("ABA"));
        assertTrue(RecursiveFunctions.isPalindrome("$%$"));
        assertTrue(RecursiveFunctions.isPalindrome(" _ "));
    }

    @Test
    public void isPalindrome_threeCharIncorrect_returnsFalse() {
        assertFalse(RecursiveFunctions.isPalindrome("123"));
        assertFalse(RecursiveFunctions.isPalindrome("abc"));
        assertFalse(RecursiveFunctions.isPalindrome("ABC"));
        assertFalse(RecursiveFunctions.isPalindrome("$%^"));
        assertFalse(RecursiveFunctions.isPalindrome(" __"));
    }

    @Test
    public void isPalindrome_longCorrect_returnsTrue() {
        assertTrue(RecursiveFunctions.isPalindrome("aaaabbccddeeddeeddggaaddggddaaaeeeepxxpeeeeaaaddggddaaggddeeddeeddccbbaaaa"));
        assertTrue(RecursiveFunctions.isPalindrome("aaaabbccddeeddeeddggaaddggddaaaeeeepxpeeeeaaaddggddaaggddeeddeeddccbbaaaa"));
    }

    @Test
    public void isPalindrome_longIncorrect_returnsFalse() {
        // same as above, but incorrect in the middle
        assertFalse(RecursiveFunctions.isPalindrome("aaaabbccddeeddeeddggaaddggddaaaeeeepxxqeeeeaaaddggddaaggddeeddeeddccbbaaaa"));
        assertFalse(RecursiveFunctions.isPalindrome("aaaabbccddeeddeeddggaaddggddaaaeeeepxqeeeeaaaddggddaaggddeeddeeddccbbaaaa"));
    
        // incorrect in the front/back
        assertFalse(RecursiveFunctions.isPalindrome("qaaabbccddeeddeeddggaaddggddaaaeeeepxxPeeeeaaaddggddaaggddeeddeeddccbbaaaa"));
        assertFalse(RecursiveFunctions.isPalindrome("aaaabbccddeeddeeddggaaddggddaaaeeeepxPeeeeaaaddggddaaggddeeddeeddccbbaaaq"));
    }

    @Test
    public void isPalindrome_differentCase_returnsFalse() {
        assertFalse(RecursiveFunctions.isPalindrome("abBa"));
        assertFalse(RecursiveFunctions.isPalindrome("abA"));
        assertFalse(RecursiveFunctions.isPalindrome("aA"));
    }

    @Test
    public void nextIsDouble_emptyArray_returns0() {
        int[] data = {};
        assertEquals(0, RecursiveFunctions.nextIsDouble(data, 0));
    }

    @Test
    public void nextIsDouble_oneInt_returns0() {
        int[] data = {1};
        assertEquals(0, RecursiveFunctions.nextIsDouble(data, 0));
    }

    @Test
    public void nextIsDouble_onePairDouble_returns1() {
        int[] data = {1,2};
        assertEquals(1, RecursiveFunctions.nextIsDouble(data, 0));
    }

    @Test
    public void nextIsDouble_twoSameInt_returns0() {
        int[] data = {1,1};
        assertEquals(0, RecursiveFunctions.nextIsDouble(data, 0));
    }

    @Test
    public void nextIsDouble_threePairDouble_returns2() {
        int[] data = {1,2,4};
        assertEquals(2, RecursiveFunctions.nextIsDouble(data, 0));
    }

    @Test
    public void nextIsDouble_twoPairsInFourNumbers_returns2() {
        int[] data = {1,2,1,2};
        assertEquals(2, RecursiveFunctions.nextIsDouble(data, 0));
    }

    @Test
    public void nextIsDouble_manyPairStringsConsecutive_returnsCorrect() {
        int[] data = {1,2,4,8,16,32,64,128,256,512,1024,2048};
        assertEquals(11, RecursiveFunctions.nextIsDouble(data, 0));
    }

    @Test
    public void nextIsDouble_manyPairStringsNonconsecutive_returnsCorrect() {
        int[] data = {1,2,4,8,16,32,64,128,256,512,1024,2048, 1,2,4,8,16,32,64,128,256,512,1024,2048, 1,2,4,8,16,32,64,128,256,512,1024,2048};
        assertEquals(33, RecursiveFunctions.nextIsDouble(data, 0));
    }
    

    @Test
    public void getBinary_1_returnsCorrect() {
        assertEquals("1", RecursiveFunctions.getBinary(1));
    }

    @Test
    public void getBinary_2_returnsCorrect() {
        assertEquals("10", RecursiveFunctions.getBinary(2));
    }

    @Test
    public void getBinary_powersOfTwo_returnsCorrect() {
        assertEquals("100", RecursiveFunctions.getBinary(4));
        assertEquals("1000", RecursiveFunctions.getBinary(8));
        assertEquals("10000", RecursiveFunctions.getBinary(16));
        assertEquals("100000", RecursiveFunctions.getBinary(32));
    }

    @Test
    public void getBinary_3_returnsCorrect() {
        assertEquals("11", RecursiveFunctions.getBinary(3));
    }

    @Test
    public void getBinary_smallNumbers_returnsCorrect() {
        assertEquals("11", RecursiveFunctions.getBinary(3));
        assertEquals("101", RecursiveFunctions.getBinary(5));
        assertEquals("110", RecursiveFunctions.getBinary(6));
        assertEquals("111", RecursiveFunctions.getBinary(7));
        assertEquals("1001", RecursiveFunctions.getBinary(9));
        assertEquals("1011", RecursiveFunctions.getBinary(11));
        assertEquals("1100", RecursiveFunctions.getBinary(12));
    }

    @Test
    public void getBinary_bigNumbers_returnsCorrect() {
        assertEquals("100001", RecursiveFunctions.getBinary(33));
        assertEquals("111000", RecursiveFunctions.getBinary(56));
        assertEquals("1000100", RecursiveFunctions.getBinary(68));
        assertEquals("10000100", RecursiveFunctions.getBinary(132));
        assertEquals("1011100111", RecursiveFunctions.getBinary(743));
        assertEquals("1111100111", RecursiveFunctions.getBinary(999));
        assertEquals("11110001011", RecursiveFunctions.getBinary(1931));
    }

    @Test
    public void getBinary_veryBigNumbers_returnsCorrect() {
        assertEquals("100110111110000", RecursiveFunctions.getBinary(19952));
        assertEquals("1000000000000000000000000000000", RecursiveFunctions.getBinary(1073741824));
        assertEquals("1011101110100000001111100111101", RecursiveFunctions.getBinary(1573920573));
        assertEquals("1111111111111111111111111111111", RecursiveFunctions.getBinary(2147483647));
    }

    @Test
    public void binarySearch_OneElem_IsFound_returnsCorrect() {
        int[] data = {0};
        assertEquals(0, RecursiveFunctions.binarySearch(data, 0, 0, data.length-1));
    }

    @Test
    public void binarySearch_OneElem_IsNotFound_returnsCorrect() {
        int[] data = {10};
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 0, 0, data.length-1));
    }

    @Test
    public void binarySearch_ThreeElem_IsFoundInMiddle_returnsCorrect() {
        int[] data = {-10,0,10};
        assertEquals(1, RecursiveFunctions.binarySearch(data, 0, 0, data.length-1));
    }

    @Test
    public void binarySearch_ThreeElem_IsFoundInFront_returnsCorrect() {
        int[] data = {0,10,20};
        assertEquals(0, RecursiveFunctions.binarySearch(data, 0, 0, data.length-1));
    }

    @Test
    public void binarySearch_ThreeElem_IsFoundInBack_returnsCorrect() {
        int[] data = {-20,-10,0};
        assertEquals(2, RecursiveFunctions.binarySearch(data, 0, 0, data.length-1));
    }

    @Test
    public void binarySearch_ThreeElem_IsNotFound_returnsCorrect() {
        int[] data = {-20,-10,10};
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 0, 0, data.length-1));
    }

    @Test
    public void binarySearch_SevenElemIsFound_returnsCorrect() {
        int[] data = {10,20,30,40,50,60,70};
        assertEquals(0, RecursiveFunctions.binarySearch(data, 10, 0, data.length-1));
        assertEquals(1, RecursiveFunctions.binarySearch(data, 20, 0, data.length-1));
        assertEquals(2, RecursiveFunctions.binarySearch(data, 30, 0, data.length-1));
        assertEquals(3, RecursiveFunctions.binarySearch(data, 40, 0, data.length-1));
        assertEquals(4, RecursiveFunctions.binarySearch(data, 50, 0, data.length-1));
        assertEquals(5, RecursiveFunctions.binarySearch(data, 60, 0, data.length-1));
        assertEquals(6, RecursiveFunctions.binarySearch(data, 70, 0, data.length-1));
    }

    @Test
    public void binarySearch_SevenElemNotFound_returnsCorrect() {
        int[] data = {10,20,30,40,50,60,70};
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 5, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 15, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 25, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 35, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 45, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 55, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 65, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 75, 0, data.length-1));
    }

    @Test
    public void binarySearch_TwoElem_returnsCorrect() {
        int[] data = {10,20};
        assertEquals(0, RecursiveFunctions.binarySearch(data, 10, 0, data.length-1));
        assertEquals(1, RecursiveFunctions.binarySearch(data, 20, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 5, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 15, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 25, 0, data.length-1));
    }


    @Test
    public void binarySearch_manyElemWhenFound_returnsCorrect() {
        int[] data = {10,20,30,40,50,60,70,80,90,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300};
        assertEquals(0, RecursiveFunctions.binarySearch(data, 10, 0, data.length-1));
        assertEquals(1, RecursiveFunctions.binarySearch(data, 20, 0, data.length-1));
        assertEquals(2, RecursiveFunctions.binarySearch(data, 30, 0, data.length-1));
        assertEquals(4, RecursiveFunctions.binarySearch(data, 50, 0, data.length-1));
        assertEquals(7, RecursiveFunctions.binarySearch(data, 80, 0, data.length-1));
        assertEquals(15, RecursiveFunctions.binarySearch(data, 170, 0, data.length-1));
        assertEquals(16, RecursiveFunctions.binarySearch(data, 180, 0, data.length-1));
        assertEquals(17, RecursiveFunctions.binarySearch(data, 190, 0, data.length-1));
        assertEquals(19, RecursiveFunctions.binarySearch(data, 210, 0, data.length-1));
        assertEquals(28, RecursiveFunctions.binarySearch(data, 300, 0, data.length-1));
    }



    @Test
    public void binarySearch_manyElemWhenNotFound_returnsCorrect() {
        int[] data = {10,20,30,40,50,60,70,80,90,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300};
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 1, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 11, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 21, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 31, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 51, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 81, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 171, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 181, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 191, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 211, 0, data.length-1));
        assertEquals(-1, RecursiveFunctions.binarySearch(data, 301, 0, data.length-1));
    }


    @Test
    public void canFlowOffMap_onEdge_returnsTrue() {
        int[][] map = {
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
        };

        assertTrue(RecursiveFunctions.canFlowOffMap(map, 0, 0));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 3, 0));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 0, 3));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 6, 3));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 3, 11));
    }


    @Test
    public void canFlowOffMap_onNotOnEdge_FlatMap_returnsFalse() {
        int[][] map = {
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
        };

        assertFalse(RecursiveFunctions.canFlowOffMap(map, 1, 1));
        assertFalse(RecursiveFunctions.canFlowOffMap(map, 3, 3));
    }

    @Test
    public void canFlowOffMap_nextToEdge_canFlowOff_returnsTrue() {
        int[][] map = {
            {9,0,9,9,9,9,9,9,9,9,9,9},
            {9,1,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,1,0},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {0,1,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,1,9,9},
            {9,9,9,9,9,9,9,9,9,0,9,9},
        };

        assertTrue(RecursiveFunctions.canFlowOffMap(map, 1, 1));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 2, 10));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 4, 1));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 5, 9));
    }

    @Test
    public void canFlowOffMap_TwoFromEdge_canFlowOff_returnsTrue() {
        int[][] map = {
            {9,0,9,9,9,9,9,9,9,9,9,9},
            {9,1,9,9,9,9,9,9,9,9,9,9},
            {9,2,9,9,9,9,9,9,9,2,1,0},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {0,1,2,9,9,9,9,9,9,2,9,9},
            {9,9,9,9,9,9,9,9,9,1,9,9},
            {9,9,9,9,9,9,9,9,9,0,9,9},
        };

        assertTrue(RecursiveFunctions.canFlowOffMap(map, 2, 1));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 2, 9));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 4, 2));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 4, 9));
    }

    

    @Test
    public void canFlowOffMap_FourFromEdgeStraightLine_canFlowOff_returnsTrue() {
        int[][] map = {
            {9,0,9,9,9,9,9,9,9,9,9,9},
            {9,1,9,9,9,9,9,9,9,9,9,9},
            {9,2,9,9,9,9,9,4,3,2,1,0},
            {9,3,9,9,9,9,9,9,9,9,9,9},
            {9,4,9,9,9,9,9,9,9,4,9,9},
            {9,9,9,9,9,9,9,9,9,3,9,9},
            {0,1,2,3,4,9,9,9,9,2,9,9},
            {9,9,9,9,9,9,9,9,9,1,9,9},
            {9,9,9,9,9,9,9,9,9,0,9,9},
        };

        assertTrue(RecursiveFunctions.canFlowOffMap(map, 4, 1));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 2, 7));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 6, 4));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 4, 9));
    }


    @Test
    public void canFlowOffMap_FiveFromEdgeCurvedLine_canFlowOff_returnsTrue() {
        int[][] map = {
            {9,0,9,9,9,9,9,9,9,9,9,9},
            {9,1,2,9,9,9,9,9,9,9,9,9},
            {9,9,3,4,9,9,9,9,3,2,1,0},
            {9,9,9,5,9,9,9,9,4,5,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,2,3,9,9,9,9,9,5,0,9,9},
            {0,1,4,5,9,9,9,3,4,9,9,9},
            {9,9,9,9,9,9,1,2,9,9,9,9},
            {9,9,9,9,9,9,0,9,9,9,9,9},
        };

        assertTrue(RecursiveFunctions.canFlowOffMap(map, 4, 1));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 2, 7));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 6, 4));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 4, 9));
    }

    @Test
    public void canFlowOffMap_InSmallValley_cannotFlowOff_returnsFalse() {
        int[][] map = {
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,3,9,9,9,9},
            {9,9,9,9,1,0,1,2,3,9,9,9},
            {9,9,9,9,2,9,9,3,9,9,9,9},
            {9,9,9,9,3,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
        };

        assertFalse(RecursiveFunctions.canFlowOffMap(map, 2, 7));
        assertFalse(RecursiveFunctions.canFlowOffMap(map, 3, 8));
        assertFalse(RecursiveFunctions.canFlowOffMap(map, 4, 7));
        assertFalse(RecursiveFunctions.canFlowOffMap(map, 5, 4));
    }

    @Test
    public void canFlowOffMap_MultipleExits_canFlowOff_returnsTrue() {
        int[][] map = {
            {9,9,9,0,9,9,9,9,9,9,9,9},
            {9,9,9,1,9,9,9,9,9,9,9,9},
            {9,9,9,2,9,9,9,9,9,9,9,9},
            {0,1,2,3,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9,9,9},
        };

        assertTrue(RecursiveFunctions.canFlowOffMap(map, 3, 3));
    }


    @Test
    public void canFlowOffMap_MultiplePaths_onlyOneWorks_canFlowOff_returnsTrue() {
        int[][] map = {
            {99,99,99, 0,99,99, 0,99,99,99,99,99}, 
            {99,99,99, 1,99,99, 1,99,99, 1,99,99}, 
            {99,99,99, 2,99,99, 2,99,99, 2, 1, 0}, 
            {99, 1, 2, 3,99,99, 3,99,99,99,99,99}, 
            {99,99,99,99,99,99, 2,99,99,99,99,99}, 
            { 0, 1, 2,99,99,99, 1,99,99, 2, 1,99}, 
            {99,99, 1,99,99,99, 0,99,99, 1,99,99}, 
            {99,99,99,99,99,99,99,99,99, 0,99,99}, 
        };

        assertTrue(RecursiveFunctions.canFlowOffMap(map, 3, 3));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 3, 6));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 2, 9));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 5, 3));
        assertTrue(RecursiveFunctions.canFlowOffMap(map, 5, 9));
    }


    @Test
    public void canFlowOffMap_LongSpiralSnake_canFlowOff_returnsTrue() {
        int[][] map = {
            {999,999,999,999,999,  0,999,999,999,999,999,999}, 
            {999, 72,999,999,999,  1,  2,  3,  4,999,999,999}, 
            {999, 71,999,999,999, 14, 13, 12,  5,999,999,999}, 
            {999, 70,999,999,999, 15, 10, 11,  6,999,999,999}, 
            {999, 69,999,999,999, 16,  9,  8,  7,999,999,999}, 
            {999, 68,999,999,999, 17, 18,999,999,999,999,999}, 
            {999, 66,999,999,999,999, 19, 20,999,999,999,999}, 
            {999, 65,999,999,999,999, 22, 21,999,999,999,999}, 
            {999, 64,999,999, 25, 24, 23, 42, 43, 44,999,999}, 
            {999, 63,999,999, 26, 37, 38, 42,999, 45,999,999}, 
            {999, 62,999,999, 27, 36, 39, 40,999, 46,999,999}, 
            {999, 61,999,999, 28, 35, 34, 33,999, 47,999,999}, 
            {999, 60,999,999, 29, 30, 31, 32,999, 48, 49,999}, 
            {999, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50,999}, 
            {999,999,999,999,999,999,999,999,999,999,999,999}, 
        };

        assertTrue(RecursiveFunctions.canFlowOffMap(map, 1, 1));
    }


}
