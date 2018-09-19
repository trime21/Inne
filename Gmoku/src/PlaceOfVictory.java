public class PlaceOfVictory {

    void show(Database data) {
        data.checkedLine = data.checkedLine - data.numberOfCharacters * data.changeLine;
        data.checkedColumn = data.checkedColumn - data.numberOfCharacters * data.changeColumn;
        data.numberOfCharacters--;
        for (int i = 0; i < data.boardLine; i++) {
            for (int j = 0; j < data.boardColumn; j++) {
                if (data.numberOfCharacters > -1 && i == data.checkedLine && j == data.checkedColumn) {
                    data.checkedLine += data.changeLine;
                    data.checkedColumn += data.changeColumn;
                    data.numberOfCharacters--;
                    System.out.print(data.winingCharacter);
                } else
                    System.out.print(data.gameBoard.get(i).get(j));
            }
            System.out.println();
        }
    }
}