import com.mycompany.studentregsystem.student;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul
 * Write a simple unit test using JUnit to 
 * make sure that all the above works (e.g. get getUsername()) as expected.
 */
public class StudentRegTest {
    
    public static student x;

    
    @BeforeClass
    public static void setUpClass() {
        

        
        
       // x = new student("Tim", 20, "20/09/1996", 15350786, course, modules);
        
    }
    @Test
    public void Test() {

        x = new student("Tim", 20, "20/09/1996", 15350786, "Civil", "Maths, Structures");
        //x = new student();

        String username = x.getUsername();
        assertEquals("Tim20", username);
    }
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
