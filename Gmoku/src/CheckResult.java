public class CheckResult {

    void result(Database data) {
        data.numberOfCharacters = 0;
        while (data.numberOfCharacters < 5 && data.testedPoint < data.endOfCheck) {
            data.rightChar = data.gameBoard.get(data.checkedLine).get(data.checkedColumn) == data.currentCharacter;
            if (data.testedPoint == 4 && !data.rightChar)
                break;
            if (data.rightChar)
                data.numberOfCharacters++;
            else
                data.numberOfCharacters = 0;
            data.testedPoint++;
            data.checkedLine += data.changeLine;
            data.checkedColumn += data.changeColumn;
        }
    }
}
