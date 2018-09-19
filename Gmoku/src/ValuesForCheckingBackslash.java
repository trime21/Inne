public class ValuesForCheckingBackslash {

    void set(Database data) { // po skosie ↘
        data.changeColumn = 2;
        data.changeLine = 1;
        data.testedPoint = 0;
        data.endOfCheck = 9;
        if (data.givenLine < 5 || data.givenColumn < 5) {
            if (data.givenLine < data.givenColumn) {
                data.testedPoint = 5 - data.givenLine;
                data.checkedLine = 3;
                data.checkedColumn = data.correctColumn - ((data.givenLine - 1) * 2);
            } else {
                data.testedPoint = 5 - data.givenColumn;
                data.checkedColumn = 3;
                data.checkedLine = data.correctLine - (data.givenColumn - 1);
            }
        } else {
            data.checkedColumn = data.correctColumn - 8;
            data.checkedLine = data.correctLine - 4;
        }
        if (data.givenLine > 11 || data.givenColumn > 11) {
            if (data.givenLine > data.givenColumn)
                data.endOfCheck = 20 - data.givenLine;
            else
                data.endOfCheck = 20 - data.givenColumn;
            if (data.givenLine > 4 && data.givenColumn > 4) {
                data.checkedColumn = data.correctColumn - 8;
                data.checkedLine = data.correctLine - 4;
            }
        }
    }
}