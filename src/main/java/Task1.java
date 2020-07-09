import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String lineFromConsole = getLineFromConsole();

    }

    private static String getLineFromConsole(){
        Scanner scanner = new Scanner(System.in);
        String line ="";
        if(scanner.hasNextLine()){
            line = scanner.nextLine();
        }
        return line;
    }

}
