public class TestCoordinates {

    void isGood(Database data) {
        data.compartmentLine = data.givenLine < 16 && data.givenLine > 0;
        data.compartmentColumn = data.givenColumn < 16 && data.givenColumn > 0;
        data.emptyField = data.gameBoard.get(data.correctLine).get(data.correctColumn) == ' ';
        if (data.compartmentLine && data.compartmentColumn && data.emptyField) {
            data.gameBoard.get(data.correctLine).set(data.correctColumn, data.currentCharacter);
            data.lastLine = data.correctLine;
            data.lastColumn = data.correctColumn;
            data.checkedCoordinates = true;
        } else {
            System.out.println("Podałeś:");
            if (data.givenLine > 15)
                System.out.println("-za duża wartość wiersza");
            if (data.givenLine < 1)
                System.out.println("-za mała wartość wiersza");
            if (data.givenColumn > 15)
                System.out.println("-za duża wartość kolumny");
            if (data.givenColumn < 1)
                System.out.println("-za mała wartość kolumny");
            if (data.compartmentLine && data.compartmentColumn && !data.emptyField)
                System.out.println("-zajętą pozycję");
        }
    }
}