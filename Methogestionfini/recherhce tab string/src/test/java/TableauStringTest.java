package test.java;

import main.java.TableauString;
import junit.framework.TestCase;

public class TableauStringTest extends TestCase {

	public void testRechercheDicho() {
		TableauString a = new TableauString();
		String tab1[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
				"k", "z","y","v","w" };
		
		if(a.rechercheDicho(tab1, "c") != 1)
		{
			fail();
		}
	}

}
