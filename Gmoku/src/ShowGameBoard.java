public class ShowGameBoard {

    void show(Database data) {
        for (int i = 0; i < data.boardLine; i++) {
            for (int j = 0; j < data.boardColumn; j++)
                if (i == data.lastLine && j == data.lastColumn && i != 0)
                    System.out.print('@');
                else
                    System.out.print(data.gameBoard.get(i).get(j));
            System.out.println();
        }
    }
}