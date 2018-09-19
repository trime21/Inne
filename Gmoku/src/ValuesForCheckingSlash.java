public class ValuesForCheckingSlash {

    void set(Database data) { // po skosie ↙
        data.changeColumn = -2;
        data.changeLine = 1;
        data.testedPoint = 0;
        data.endOfCheck = 9;
        if (data.givenLine < 5 || data.givenColumn > 11) {
            if (data.givenLine < (16 - data.givenColumn)) {
                data.testedPoint = 5 - data.givenLine;
                data.checkedLine = 3;
                data.checkedColumn = (data.givenColumn - 1) * 2 + data.givenLine * 2 + 1;
            } else {
                data.testedPoint = data.givenColumn - 11;
                data.checkedColumn = 31;
                data.checkedLine = data.correctLine - ((31 - data.correctColumn) / 2);
            }
        } else {
            data.checkedColumn = data.correctColumn + 8;
            data.checkedLine = data.correctLine - 4;
        }
        if (data.givenLine > 11 || data.givenColumn < 5) {
            if (16 - data.givenLine < data.givenColumn)
                data.endOfCheck = 20 - data.givenLine;
            else
                data.endOfCheck = data.givenColumn + 4;
        }
    }
}