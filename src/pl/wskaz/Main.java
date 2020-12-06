package pl.wskaz;

public class Main {
    /*

    sign = #
    size = 5

     */
    public String drawLineWithSpaces(char sign, int size) {
        String output = "";
        for (int i = 0; i < size - 1; i++) {
            output = output + sign + " ";
        }
        output = output + sign;
        return output;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.drawLineWithSpaces('#', 5));
    }
}
