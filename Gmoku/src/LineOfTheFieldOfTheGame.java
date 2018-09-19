public class LineOfTheFieldOfTheGame {

    void draw(Database data, int i) {
        for (int j = 0; j < data.boardColumn; j++) {
            switch (j) {
                case 0:
                case 33:
                    if (i < 12)
                        data.gameBoard.get(i).add('0');
                    else
                        data.gameBoard.get(i).add('1');
                    break;
                case 1:
                case 34:
                    if (i < 12)
                        data.gameBoard.get(i).add(Character.forDigit(i - 2, 10));
                    else
                        data.gameBoard.get(i).add(Character.forDigit(i - 12, 10));
                    break;
                case 2:
                case 32:
                    data.gameBoard.get(i).add('#');
                    break;
                default:
                    data.gameBoard.get(i).add(' ');
            }
        }
    }
}