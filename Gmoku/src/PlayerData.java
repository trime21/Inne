public class PlayerData {

    void set(Database data, InsertData insert) {
        System.out.println("Podaj nick pierwszego gracza");
        while (!data.verificationOfData) {
            data.firstPlayerNickname = insert.input.nextLine();
            System.out.println("Jeżeli Ty chcesz mieć taki nick: " + data.firstPlayerNickname + " to napisz tak");
            if (insert.input.nextLine().equalsIgnoreCase("tak"))
                data.verificationOfData = true;
            else
                System.out.println("Podaj poprawny nick");
        }
        data.verificationOfData = false;
        System.out.println("Podaj znak " + data.firstPlayerNickname);
        while (!data.verificationOfData) {
            data.firstPlayerChar = insert.input.nextLine().charAt(0);
            System.out.println("Jeżeli " + data.firstPlayerNickname + " chcesz mieć taki znak: " + data.firstPlayerChar + " to napisz tak");
            if (insert.input.nextLine().equalsIgnoreCase("tak"))
                data.verificationOfData = true;
            else
                System.out.println("Podaj poprawny znak");
        }
        data.verificationOfData = false;
        System.out.println(data.firstPlayerNickname + " Twoj znak to: " + data.firstPlayerChar);
        System.out.println("Podaj nick drugiego gracza");
        while (!data.verificationOfData) {
            data.secondPlayerNickname = insert.input.nextLine();
            if (data.secondPlayerNickname.equals(data.firstPlayerNickname))
                System.out.println("Podaj poprawny nick");
            else {
                System.out.println("Jeżeli Ty chcesz mieć taki nick: " + data.secondPlayerNickname + " to napisz tak");
                if (insert.input.nextLine().equalsIgnoreCase("tak"))
                    data.verificationOfData = true;
                else
                    System.out.println("Podaj poprawny nick");
            }
        }
        data.verificationOfData = false;
        System.out.println("Podaj znak " + data.secondPlayerNickname);
        while (!data.verificationOfData) {
            data.secondPlayerChar = insert.input.nextLine().charAt(0);
            if (data.secondPlayerChar == data.firstPlayerChar)
                System.out.println("Podaj poprawny znak");
            else {
                System.out.println("Jeżeli " + data.secondPlayerNickname + " chcesz mieć taki znak: " + data.secondPlayerChar + " to napisz tak");
                if (insert.input.nextLine().equalsIgnoreCase("tak"))
                    data.verificationOfData = true;
                else
                    System.out.println("Podaj poprawny znak");
            }
        }
        data.verificationOfData = false;
        System.out.println(data.secondPlayerNickname + " Twoj znak to: " + data.secondPlayerChar);
    }
}