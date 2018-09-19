public class Main {

    public static void main(String args[]) {
        Database data = new Database();
        InsertData insert = new InsertData();
        new PlayerData().set(data, insert);
        new CreateGameBoard().create(data);
        new StartGame().play(data, insert);
    }
}