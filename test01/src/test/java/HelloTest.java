package test;

import de.home.dev.Hello;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest{
    @Test 
    public void hasAGreeting(){
        Hello h = new Hello();
        assertNotNull("have greeting", h);        
    }    
}