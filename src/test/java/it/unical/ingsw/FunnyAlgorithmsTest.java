package it.unical.ingsw;

import org.joda.time.DateTime;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunnyAlgorithmsTest {
    private static FunnyAlgorithms f;
    private int[] array;
    private static int[] descending = new int[] {3,5,7,9,10,11,15};
    private static int[] ascending = new int[] {15,11,10,9,7,5,3};
    @BeforeAll
    public static void beforeAll(){ System.out.println("Before Class"); }

    @AfterAll
    public static void afterClass(){ System.out.println("After Class"); }

    @BeforeEach
    public void startTest(){
        System.out.println("Start Test!");
        f = new FunnyAlgorithms();
    }

    @AfterEach
    public void finishTest(){
        System.out.println("Finish Test!");
    }

    @Test
    public void stringToIntConverterWorks(){
        System.out.println("Testing that stringToIntConverter works");
        assertEquals(1245, f.stringToIntConverter("1245"));
        assertEquals(456, f.stringToIntConverter("456"));
        assertEquals(5421, f.stringToIntConverter("5421"));
        assertEquals(78, f.stringToIntConverter("78"));
    }

    @Test
    public void ascendingSelectionSortWorks(){
        System.out.println("Testing that selectionSort works");
        array = new int[] {15,7,10,11,9,3,5};
        f.selectionSort(array, 0);
        assertArrayEquals(ascending, array);
    }
    @Test
    public void descendingSelectionSortWorks(){
        System.out.println("Testing that selectionSort works");
        array = new int[] {15,7,10,11,9,3,5};
        f.selectionSort(array, 1);
        assertArrayEquals(descending, array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void numberWrongSelectionSort() {
        array = new int[] {11,7,15,10,3,5,9};
        DateTime ora = new DateTime();
        System.out.println(ora);
        System.out.println("Eccezione -> numero richiesta ordinamento");
        f.selectionSort(array,2);
        System.out.println(ora);
    }
}
