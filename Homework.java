public class Homework {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false
    
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
    
        printString("abcd", 5); // abcdabcdabcdabcdabcd
    
        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];
    }
    
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x >= 0 ) {
            return true;

        }
        else {
        return false;
        }
    }
    
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        String result = "";
        for (int j = 0; j < repeat; j++ ) {
            result = result + source;
        }
    }
    
    private static boolean isLeapYear(int year){
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if ( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        else {
        return false;
        }
    }

        
          
    
    
    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array_init = new int[len];
        for(int i = 0; i< len;i++) {
            array_init[i]= initialValue;
        }
        return array_init;
    }

    private static void printArray(int[] array){
        for(int i = 0; i< array.length; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println();
    }
}
    
    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     *
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     *
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */
    