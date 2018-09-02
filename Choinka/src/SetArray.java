public class SetArray {
    char[][] setArraySize() {
        int quantityLine = (int) (Math.random() * 9 + 4);
        int quantityColumn = 2 * quantityLine - 1;
        char[][] array = new char[quantityLine + 1][quantityColumn];
        return array;
    }
}