package main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vespertino
 */
public class NifTest {
    
    public NifTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test del metodo toString de la clase NIF.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Nif instance = new Nif(12345678);
        String expResult = "12345678-Z";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    
}
