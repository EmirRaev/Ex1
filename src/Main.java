import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        int [] array = new int [99];
        for (int i = 0; i <array.length ; i++) {
                array[i] = i+1;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                integers.add(array[i]);
            }
        }
    }
}