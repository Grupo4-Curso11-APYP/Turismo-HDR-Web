import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import utils.Crypt;

public class HasheoTest {

		
	String passwordTest_1 = "Rinjdael";
	String passwordTest_2 = "leadjniR";
	
	@Test
	public void hasheoTest() {
		Object hashed = Crypt.hash(passwordTest_1);
		Assert.assertFalse(hashed.equals(passwordTest_1));
	}

	@Test
	public void hasheoTestValidoInvalido() {
		Assert.assertTrue(Crypt.match(passwordTest_1, Crypt.hash(passwordTest_1)));
		Assert.assertFalse(Crypt.match(passwordTest_2, Crypt.hash(passwordTest_1)));
	}

}
