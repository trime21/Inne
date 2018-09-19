public class ValuesForCheckingLines {

    void set(Database data) { //po wierszach ↓
        data.changeColumn = 0;
        data.changeLine = 1;
        data.testedPoint = 0;
        data.endOfCheck = 9;
        data.checkedColumn = data.correctColumn;
        if (data.givenLine < 5) {
            data.testedPoint = 5 - data.givenLine;
            data.checkedLine = 3;
        } else {
            if (data.givenLine > 11)
                data.endOfCheck = 20 - data.givenLine;
            data.checkedLine = data.correctLine - 4;
        }
    }
}