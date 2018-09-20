public class SetCoordinates {

    void set(Database data, InsertData insert) {
        data.checkedCoordinates = false;
        while (!data.checkedCoordinates) {
            System.out.println(data.nickname + " Podaj wiersz");
            data.verificationOfData = false;
            while (!data.verificationOfData) {
                try {
                    data.givenLine = insert.input.nextInt();
                    data.verificationOfData = true;
                } catch (java.util.InputMismatchException exception) {
                    System.out.println("Podałeś błędne dane dla wiersza, podaj jeszcze raz");
                    insert.input.nextLine();
                }
            }
            data.correctLine = data.givenLine + 2;
            System.out.println(data.nickname + " Podaj kolumne");
            data.verificationOfData = false;
            while (!data.verificationOfData) {
                try {
                    data.givenColumn = insert.input.nextInt();
                    data.verificationOfData = true;
                } catch (java.util.InputMismatchException exception) {
                    System.out.println("Podałeś błędne dane dla kolumny, podaj jeszcze raz");
                    insert.input.nextLine();
                }
            }
            data.correctColumn = data.givenColumn * 2 + 1;
            new TestCoordinates().isGood(data);
        }
    }
}
