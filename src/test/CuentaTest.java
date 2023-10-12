package test;
import pkg.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	static Cuenta cu1,cu2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cu1 = new Cuenta("12345","Juan",50);
		cu2 = new Cuenta("67890","Pepe",0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cu2.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRetirar() {
		cu2.Retirar(200);
		assertEquals(-200,cu2.getSaldo()); 
	}
	@Test
	void testIngresar() {
		cu2.ingresar(1000);
		assertEquals(1000,cu2.getSaldo());
	}
	
	@Test
	void test0014() {
		assertEquals(cu1.getSaldo(), 50);
		assertEquals(cu2.getSaldo(), 0);

		cu1.Retirar(200);
		cu2.Retirar(350);
		cu1.ingresar(100);
		cu2.Retirar(200);
		cu2.Retirar(150);
		cu1.Retirar(200);
		cu2.ingresar(50);
		cu2.Retirar(100);
		
		assertEquals(cu1.getSaldo(), -250);
		assertEquals(cu2.getSaldo(), -450);
	}


}
