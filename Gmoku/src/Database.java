import java.util.ArrayList;

public class Database {

    ArrayList<ArrayList<Character>> gameBoard = new ArrayList<ArrayList<Character>>();
    String firstPlayerNickname = "Pierwszy gracz"; // nick pierwszego gracza
    char firstPlayerChar = "X"; // znak pierwszego gracza
    String secondPlayerNickname = "Drugi gracz"; // nick drugiego gracza
    char secondPlayerChar = "O"; // znak drugiego gracza
    String nickname = firstPlayerNickname; // nick aktualnego gracza
    char currentCharacter = firstPlayerChar; // znak aktualnego gracza
    int numberOfCharacters;
    boolean checkedCoordinates;
    int round = 1;
    int move = 1; // kolejka
    int givenLine; // podany wiersz
    int givenColumn; // podana kolumna
    int correctLine; // właściwy wiersz
    int correctColumn; // właściwa kolumna
    int checkedOption;// sprawdzany kierunek, 1 - po kolumnach --; 2 -  po skosie \\; 3 - po wierszach ||; 4 -  po skosie //
    int changeColumn; // zmiana w kolumnie podczas sprawdzania
    int changeLine; // zmiany w wierszu podczas sprawdzania
    int testedPoint; // przebieg sprawdzania
    int endOfCheck; // koncowy punkt sprawdzania
    int checkedColumn; // kolumna podczas sprawdzania
    int checkedLine; // wiersz podczas sprawdzania
    int boardLine = 21; // ilość wierszy w polu gry
    int boardColumn = 35; // ilość kolumn w polu gry
    int lastLine; // ostatnio podany wiersz
    int lastColumn; // ostatnio podana kolumna
    char winingCharacter;
    boolean verificationOfData = false;
    boolean compartmentLine;
    boolean compartmentColumn;
    boolean emptyField;
    boolean rightChar;
}
