package it.unical.ingsw;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class FunnyAlgorithmsTest {
    private static FunnyAlgorithms f;

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


}
