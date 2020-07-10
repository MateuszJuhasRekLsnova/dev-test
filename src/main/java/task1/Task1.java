package task1;

import task1.IntsSorter;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String lineFromConsole = getLineFromConsole();
        IntsSorter sorter = new IntsSorter();
        sorter.assignIntsFromStringLine(lineFromConsole);
        LinkedHashSet<Integer> intsSet = sorter.getIntsSet();
        printOutput(intsSet, sorter.getCount(), sorter.getMin(), sorter.getMax());
    }

    private static String getLineFromConsole(){
        Scanner scanner = new Scanner(System.in);
        String line ="";
        if(scanner.hasNextLine()){
            line = scanner.nextLine();
        }
        return line;
    }

    private static void printOutput(LinkedHashSet<Integer> integers, int count, int min, int max){
        StringBuilder builder = new StringBuilder();
        integers.forEach(number-> builder.append(number).append(" "));
        System.out.println(builder.toString());
        System.out.println("count: " + count);
        System.out.println("distinct: " + integers.size());
        System.out.println("min: " + min);
        System.out.println("max: " + max);



    }
}
