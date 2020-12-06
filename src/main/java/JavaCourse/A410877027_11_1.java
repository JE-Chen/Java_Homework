package JavaCourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class A410877027_11_1 {

    static char space = ' ', vertical = '-', horizontal = '|', newLine = '\n';
    static int numsCount;
    static String nums;
    static int size = 0;
    static List<String> numsLine1 = Arrays.asList(" - ", "   ", " - ", " - ", "   ", " - ", " - ", " - ", " - ", " - ");
    static List<String> numsLine2 = Arrays.asList("| |", "  |", "  |", "  |", "| |", "|  ", "|  ", "  |", "| |", "| |");
    static List<String> numsLine3 = Arrays.asList("   ", "   ", " - ", " - ", " - ", " - ", " - ", "   ", " - ", " - ");
    static List<String> numsLine4 = Arrays.asList("| |", "  |", "|  ", "  |", "  |", "  |", "| |", "  |", "| |", "  |");
    static List<String> numsLine5 = Arrays.asList(" - ", "   ", " - ", " - ", "   ", " - ", " - ", "   ", " - ", " - ");

    public static void main(String[] argv) {

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputLine = inputReader.readLine();
            String[] input = inputLine.split(" ");
            size = Integer.parseInt(input[0]);
            nums = input[1];
            StringBuilder[] stringBuilders = new StringBuilder[5];
            for (int initStringBuilder = 0; initStringBuilder < 5; initStringBuilder++)
                stringBuilders[initStringBuilder] = new StringBuilder();
            for (numsCount = 0; numsCount < nums.length(); numsCount++) {
                switch (nums.charAt(numsCount)) {
                    case '0':
                        reFormat(0, stringBuilders);
                        break;
                    case '1':
                        reFormat(1, stringBuilders);
                        break;
                    case '2':
                        reFormat(2, stringBuilders);
                        break;
                    case '3':
                        reFormat(3, stringBuilders);
                        break;
                    case '4':
                        reFormat(4, stringBuilders);
                        break;
                    case '5':
                        reFormat(5, stringBuilders);
                        break;
                    case '6':
                        reFormat(6, stringBuilders);
                        break;
                    case '7':
                        reFormat(7, stringBuilders);
                        break;
                    case '8':
                        reFormat(8, stringBuilders);
                        break;
                    case '9':
                        reFormat(9, stringBuilders);
                        break;
                }
            }
            for (StringBuilder stringBuilder : stringBuilders)
                System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static void reFormat(int id, StringBuilder[] stringBuilders) {


        if (numsCount == 0 && id != 1) {
            stringBuilders[0].append(" ");
            stringBuilders[2].append(" ");
            stringBuilders[4].append(" ");
        }

        if (numsCount > 0)
            if (nums.charAt(numsCount) == '1') {
                stringBuilders[0].append(" ");
                stringBuilders[2].append(" ");
                stringBuilders[4].append(" ");
            }

        for (int reFormat1 = 0; reFormat1 < numsLine1.get(id).length(); reFormat1++) {
            for (int check1 = 0; check1 < size; check1++) {
                if (numsLine1.get(id).charAt(reFormat1) == vertical)
                    stringBuilders[0].append(vertical);
                if (numsLine3.get(id).charAt(reFormat1) == vertical)
                    stringBuilders[2].append(vertical);
                if (numsLine5.get(id).charAt(reFormat1) == vertical)
                    stringBuilders[4].append(vertical);
            }
        }

        for (int check1 = 0; check1 < size; check1++) {
                stringBuilders[0].append(space);
                stringBuilders[2].append(space);
                stringBuilders[4].append(space);
        }
    }
}
