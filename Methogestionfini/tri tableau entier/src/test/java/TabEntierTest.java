import static org.junit.Assert.*;

import org.junit.Test;


public class TabEntierTest {
	int tabD[]={5,4,3,2,1};
	int tabC[]={1,2,3,4,5};
	TabEntier tabT = new TabEntier(tabC);
	TabEntier tabN = new TabEntier(tabD);
	@Test
	public void testTabEntier() {
		TabEntier tabl =  new TabEntier(tabD);
        assertEquals(tabD, tabl.getTab());
	}

	/*@Test
	public void testTri() {
		tabN.tri();
                assertEquals(tabT,tabN);
	}

	@Test
	public void testAfficher() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTab() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTab() {
		fail("Not yet implemented");
	}*/

}

