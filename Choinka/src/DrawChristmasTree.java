public class DrawChristmasTree {
    void drawChristmasTree(char[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array[0].length; column++) {
                System.out.print(array[line][column]);
            }
            System.out.println();
        }
    }
}