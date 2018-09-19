public class CheckingCharacters {

    void check(Database data) {
        data.checkedOption = 1;
        while (data.checkedOption < 5 && data.numberOfCharacters < 5) {
            switch (data.checkedOption) {
                case 1:  // po kolumnach →
                    new ValuesForCheckingColumns().set(data);
                    data.winingCharacter = '→';
                    break;
                case 2: // po skosie ↘
                    if ((data.givenLine < 5 && data.givenColumn > 11) || (data.givenLine > 11 && data.givenColumn < 5))
                        break;
                    new ValuesForCheckingBackslash().set(data);
                    data.winingCharacter = '↘';
                    break;
                case 3: //po wierszach ↓
                    new ValuesForCheckingLines().set(data);
                    data.winingCharacter = '↓';
                    break;
                default: // po skosie ↙
                    if ((data.givenColumn < 5 && data.givenLine < 5) || (data.givenColumn > 11 && data.givenLine > 11))
                        break;
                    new ValuesForCheckingSlash().set(data);
                    data.winingCharacter = '↙';
            }
            data.checkedOption++;
            new CheckResult().result(data);
        }
    }
}