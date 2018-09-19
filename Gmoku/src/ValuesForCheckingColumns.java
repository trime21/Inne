public class ValuesForCheckingColumns {

    void set(Database data) { // po kolumnach →
        data.changeColumn = 2;
        data.changeLine = 0;
        data.testedPoint = 0;
        data.endOfCheck = 9;
        data.checkedLine = data.correctLine;
        if (data.givenColumn < 5) {
            data.testedPoint = 5 - data.givenColumn;
            data.checkedColumn = 3;
        } else {
            if (data.givenColumn > 11)
                data.endOfCheck = 20 - data.givenColumn;
            data.checkedColumn = data.correctColumn - 8;
        }
    }
}