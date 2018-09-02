public class SetSign {
    char randomSing() {
        char sign;
        int randomSignNumber = (int) (Math.random() * 5);
        switch (randomSignNumber) {
            case 0:
                sign = 'o';
                break;
            case 1:
                sign = 'O';
                break;
            case 2:
                sign = 'i';
                break;
            default:
                sign = '*';
        }
        return sign;
    }
}