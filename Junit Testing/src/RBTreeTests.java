import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;

import RBTreeWithFaults.RBNode;


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
	public void createInfNodeWParamTest(){
		RBNode result=createInfinityNode(new RBNode("String",1,null));
		
		assertEquals(result.Key==Integer.MAX_VALUE,true);
		assertEquals(result.Left.Parent==result,true);
		assertEquals(result.Black,true);
	}
	@Test
	public void createNullNodeTest(){
		RBNode A=new RBNode("String",1,null);
		RBNode result=createNullNode(A);
		
		assertEquals(result.Key==Integer.MIN_VALUE,true);
		assertEquals(result.Parent==A,true);
		assertEquals(result.Black,true);
	}
	@Test
	public void leftChildTest(){
		RBNode A=new RBNode("String",1,null);
		RBNode B=new RBNode("String",1,null);
		leftChild(A,B)							// I think this needs a ";"
		assertEquals(A.Left,B);
		assertEquals(B.Parent,A);
	}
	@Test
	public void rightChildTest(){
		RBNode A = new RBNode("String", 1, null);
		RBNode C = new RBNode("String", 3, null);
		RBNode J = new RBNode(null, null, null);
		RBNode x = RBNode(“String”, 2, A, C, J);
		RBNode y = C;
		leftChild(x, y);
//		assertEquals(
	}// End of rightChildTest() method.
	@Test
	public void minimumNodeTestNullNode(){
		RBNode H=new RBNode ("String", Integer.MIN_VALUE, null,null,null);
		assertEquals(minimumNode(H)==null,true);
	}
	@Test
	public void minimumNodeTestMinNode(){
		RBNode Y=new RBNode ("String", 9, null,null,null);
		RBNode H=new RBNode ("String", Integer.MIN_VALUE, null,null,Y);
		Y.Left=H;
		assertEquals(minimumNode(Y)==Y,true);
	}
	@Test
	public void minimumNodeTestNotMinNode(){
		RBNode Z=new RBNode ("String", 10, null,null,null);
		RBNode Y=new RBNode ("String", 9, null,null,Z);
		RBNode H=new RBNode ("String", Integer.MIN_VALUE, null,null,Y);
		Z.Left=Y;
		Y.Left=H;
		assertEquals(minimumNode(Z)==Y,true);
	}
	@Test
	public void isNullNode(){
		RBNode H=new RBNode ("String", Integer.MAX_VALUE, null,null,Y);
		Z.Left=Y;
		Y.Left=H;
		assertEquals(minimumNode(Z)==Y,true);
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
