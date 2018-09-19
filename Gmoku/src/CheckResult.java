public class CheckResult {

    void result(Database data) {
        data.numberOfCharacters = 0;
        while (data.numberOfCharacters < 5 && data.testedPoint < data.endOfCheck) {
            data.emptyField = data.gameBoard.get(data.checkedLine).get(data.checkedColumn) == data.currentCharacter;
            if (data.testedPoint == 4 && data.emptyField)
                break;
            if (data.emptyField)
                data.numberOfCharacters++;
            else
                data.numberOfCharacters = 0;
            data.testedPoint++;
            data.checkedLine += data.changeLine;
            data.checkedColumn += data.changeColumn;
        }
    }
}