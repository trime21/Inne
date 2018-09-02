public class CheckSign {
    boolean testSign(char sign, int line, int column, char[][] array) {
        boolean test;
        if (sign == '*')
            test = true;
        else {
            if (column == 0) {
                if (line == 0)
                    test = true;
                else
                    test = sign == (array[line - 1][column]) ? false : true;
            } else {
                if (line == 0)
                    test = sign == (array[line][column - 1]) ? false : true;
                else
                    test = sign == (array[line][column - 1]) || sign == (array[line - 1][column]) ? false : true;
            }
        }
        return test;
    }
}