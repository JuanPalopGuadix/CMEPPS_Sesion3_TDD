package test;
import pkg.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	static Cuenta cu;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cu = new Cuenta("12345","Juan",0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cu.ingresar(1000);
		assertEquals(1000,cu.getSaldo());
	}
	@Test
	void testRetirar() {
		cu.Retirar(200);
		assertEquals(-200,cu.getSaldo()); //antes de cada test el salario que se le pasa por constructor es 0 por tanto el salario si le retiro tiene que ser negativo
	}

}
