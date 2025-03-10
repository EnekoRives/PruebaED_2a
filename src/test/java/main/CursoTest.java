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
public class CursoTest {
    
    public CursoTest() {
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
     * Metodo que prueba que el constructor asigna correctamente el nombre y que el metodo getNombre() funcione correctamente
     */
    @Test
    public void testCurso(){
        Curso c = new Curso("TestCurso");
        String expResult = "TestCurso";
        String result = c.getNombre();
        assertEquals(expResult,result);
        
    }
    
    
}
