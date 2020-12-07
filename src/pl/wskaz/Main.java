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

    /*
    # # #
    #   #
    # # #

     */
    public String drawSquareWithSpaces(char sign, int size) {
        String line = "";
// pierwsza linia
        for (int i = 0; i < size - 1; i++) {
            line = line + sign + " ";
        }
        line = line + sign + "\n";               // nowa linia
// następne linie
        for (int j = 1; j < size - 1; j++) {
            line = line + sign;

            for (int k = 1; k < size - 1; k++) {

                line = line + "  ";
            }
            line = line + " " + sign + "\n";               // nowa linia
        }
// ostatnia linia
        for (int l = 0; l < size - 1; l++) {
            line = line + sign + " ";
        }
        line = line + sign + "\n";

        return line;

    }

//    # # # # #  size = 5
//    # #   # #
//    #   #   #
//    # #   # #
//    # # # # #
//    # # # # # #  size = 6
//    # #     # #
//    #   # #   #
//    #   # #   #
//    # #     # #
//    # # # # # #

    public String drawSquareWithSpacesAndDiagonals(char sign, int size) {

        String line = "";
// pierwsza linia
        for (int i = 0; i < size - 1; i++) {
            line = line + sign + " ";
        }
        line = line + sign + "\n";               // nowa linia
// następne linie
        for (int j = 1; j < size - 1; j++) {
            line = line + sign;

            for (int k = 1; k < size - 1; k++) {
                if (k == j || k == (size -1) -j) {
                    line = line +" "+sign;
                } else {
                    line = line +"  ";
                }

            }
            line = line + " " + sign + "\n";               // nowa linia
        }
// ostatnia linia
        for (int l = 0; l < size - 1; l++) {
            line = line + sign + " ";
        }
        line = line + sign + "\n";

        return line;

    }


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.drawLineWithSpaces('#', 7));
        System.out.println(main.drawSquareWithSpaces('#', 7));
        System.out.println(main.drawSquareWithSpacesAndDiagonals('#', 7));
    }
}
