package main;

import java.time.LocalDate;
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
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test del metodo getNif, of class Persona.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        Persona instance = new Persona(12345678);
        Nif expResult = new Nif(12345678);
        Nif result = instance.getNif();
        assertEquals(expResult, result);
    }


//    /**
//     * Test of getNombre method, of class Persona.
//     */
//    @Test
//    public void testGetNombre() {
//        System.out.println("getNombre");
//        Persona instance = new Persona();
//        String expResult = "";
//        String result = instance.getNombre();
//        assertEquals(expResult, result);
//    }
//
//
//    /**
//     * Test of getGenero method, of class Persona.
//     */
//    @Test
//    public void testGetGenero() {
//        System.out.println("getGenero");
//        Persona instance = new Persona();
//        char expResult = ' ';
//        char result = instance.getGenero();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//
//    /**
//     * Test of getNacimiento method, of class Persona.
//     */
//    @Test
//    public void testGetNacimiento() {
//        System.out.println("getNacimiento");
//        Persona instance = new Persona();
//        LocalDate expResult = null;
//        LocalDate result = instance.getNacimiento();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getEdad method, of class Persona.
//     */
//    @Test
//    public void testGetEdad() {
//        System.out.println("getEdad");
//        Persona instance = new Persona();
//        int expResult = 0;
//        int result = instance.getEdad();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of toString method, of class Persona.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Persona instance = new Persona();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//    }
    
}
