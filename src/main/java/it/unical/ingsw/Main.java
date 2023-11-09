package it.unical.ingsw;

public class Main {
    public static void main(String[] args) {
        FunnyAlgorithms funnyAlgorithms = new FunnyAlgorithms();

        int[] numberArray = {1, 5, 63, 7, 74, 10, 53, 92, 30};
        String number = "4567";
        int convertedNumber = funnyAlgorithms.stringToIntConverter(number);

        funnyAlgorithms.selectionSort(numberArray, 1);
        System.out.println("BINARY SEARCH: " + funnyAlgorithms.binarySearch(numberArray, 7));
        System.out.println("STRINGA CONVERTITA: " + convertedNumber);
    }
}
