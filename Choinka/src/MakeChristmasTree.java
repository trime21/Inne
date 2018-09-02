public class MakeChristmasTree {
    char[][] makeChristmasTree(char[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array[0].length; column++) {
                if (line + column >= (array[0].length - 1) / 2 && column - line <= (array[0].length - 1) / 2) {
                    boolean test = false;
                    char sign = '*';
                    while (!test) {
                        sign = new SetSign().randomSing();
                        test = new CheckSign().testSign(sign, line, column, array);
                    }
                    array[line][column] = sign;
                } else {
                    array[line][column] = ' ';
                }
            }
        }
        for (int column = 0; column < array[0].length; column++) {
            array[array.length - 1][column] = ' ';
        }
        array[array.length - 1][array[0].length / 2] = '#';
        return array;
    }
}