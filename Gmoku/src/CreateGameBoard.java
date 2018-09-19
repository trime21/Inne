import java.util.ArrayList;

public class CreateGameBoard {

    void create(Database data) {
        for (int i = 0; i < data.boardLine; i++) {
            data.gameBoard.add(new ArrayList<Character>());
            switch (i) {
                case 0:
                case 19:
                    new LineOfTheNumberOfTens().draw(data, i);
                    break;
                case 1:
                case 20:
                    new LineOfTheNumberOfUnities().draw(data, i);
                    break;
                case 2:
                case 18:
                    new LineHash().draw(data, i);
                    break;
                default:
                    new LineOfTheFieldOfTheGame().draw(data, i);
            }
        }
    }
}