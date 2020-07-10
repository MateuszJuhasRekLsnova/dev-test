package task1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class IntsSorter {
    private LinkedHashSet<Integer> intsSet;
    private int count;
    private int max;
    private int min;

    public IntsSorter() {
        intsSet = new LinkedHashSet<>();
    }

    public LinkedHashSet<Integer> getIntsSet() {
        return intsSet;
    }

    public void setIntsSet(LinkedHashSet<Integer> intsSet) {
        this.intsSet = intsSet;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void assignIntsFromStringLine(String line){
        String[] stringsToCast = line.split(" ");
        count = stringsToCast.length;
        int [] ints = new int[stringsToCast.length];
        for(int i=0; i <=stringsToCast.length-1; i++){
            ints[i] = Integer.parseInt(stringsToCast[i]);
        }
        Arrays.sort(ints);
        min = ints[0];
        max = ints[ints.length-1];
        addIntsToSet(ints);
    }

    private void addIntsToSet(int[] intsToAdd){
        for (int i =0; i<=intsToAdd.length-1; i++){
            intsSet.add(intsToAdd[i]);
        }
    }
}