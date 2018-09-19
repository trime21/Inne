public class LineOfTheNumberOfTens {

    void draw(Database data, int i) {
        for (int j = 0; j < data.boardColumn; j++) {
            switch (j) {
                case 0:
                case 1:
                case 33:
                case 34:
                    data.gameBoard.get(i).add('#');
                    break;
                default:
                    if (j % 2 == 0)
                        data.gameBoard.get(i).add('#');
                    else {
                        if (j < 21)
                            data.gameBoard.get(i).add('0');
                        else
                            data.gameBoard.get(i).add('1');
                    }
            }
        }
    }
}