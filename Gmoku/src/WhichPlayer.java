public class WhichPlayer {

    void setPlayer(Database data) {
        if (data.move % 2 == 1) {
            data.nickname = data.firstPlayerNickname;
            data.currentCharacter = data.firstPlayerChar;
        } else {
            data.round++;
            data.nickname = data.secondPlayerNickname;
            data.currentCharacter = data.secondPlayerChar;
        }
    }
}