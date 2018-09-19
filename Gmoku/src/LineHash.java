public class LineHash {

    void draw(Database data, int i) {
        for (int j = 0; j < data.boardColumn; j++)
            data.gameBoard.get(i).add('#');
    }
}