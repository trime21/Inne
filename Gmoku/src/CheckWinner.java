public class CheckWinner {

    void whoWin(Database data) {
        if (data.move < 226) {
            if (data.nickname.equals(data.secondPlayerNickname))
                data.round--;
            System.out.println("Wygrywa gracz: " + data.nickname + " w turze " + data.round);
            new PlaceOfVictory().show(data);
        } else
            System.out.println("Remis");
    }
}