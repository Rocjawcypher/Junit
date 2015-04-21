import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;
public class RBTreeTests {

	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(RBTreeTests.class);
		List<Failure> failures=result.getFailures();
		for (Failure failure : failures){
			System.out.println(failure);
		}

	}
	@Before //This means before/after EACH TEST. beforeclass means before any of the tests
	public void setUp(){
		
	}
	@After
	public void tearDown(){
		
	}
	@Test
	public void example(){
		assertEquals(true,true);
	}


}
/*Steps of project
1--Draw Control Flow Graph for each method- Link to other CFGs as needed
2--Find at test paths that achieve edge coverage for each (Make note of which CFGs are dependent on which or if they aren't [prime])
3--Generate Test data for each
4--Write Test method for each 
5--Write runners for all Prime tests
6--Run
7--Document Errors found and by which tests
8--Correct errors in all tests
9--Repeat 6-8 until no errors
10-Write runners for all tests that are only dependent on tested methods
11-Repeat 6-10 until all tests run without errors.
*/
