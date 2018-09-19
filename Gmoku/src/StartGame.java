public class StartGame {

    void play(Database data, InsertData insert) {
        while (data.numberOfCharacters < 5 && data.move < 226) {
            System.out.println("Ruch " + data.round);
            new WhichPlayer().setPlayer(data);
            new ShowGameBoard().show(data);
            data.verificationOfData = false;
            while (!data.verificationOfData) {
                new SetCoordinates().set(data, insert);
                new ShowGameBoard().show(data);
                insert.input.nextLine();
                System.out.println("Jeżeli " + data.nickname + " chcesz postawić znak w miejscu @ to napisz tak");
                if (insert.input.nextLine().equalsIgnoreCase("tak"))
                    data.verificationOfData = true;
                else
                    System.out.println("Podaj poprawne dane");
            }
            if (data.round > 4)
                new CheckingCharacters().check(data);
            data.move++;
        }
        new CheckWinner().whoWin(data);
    }
}