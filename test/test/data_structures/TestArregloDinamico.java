package test.data_structures;

import model.data_structures.ArregloDinamico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArregloDinamico {

	private ArregloDinamico arreglo;
	private static int TAMANO=100;
	
	@Before
	public void setUp1() {
		arreglo= new ArregloDinamico(TAMANO);
	}

	public void setUp2() {
		for(int i =0; i< TAMANO*2; i++){
			arreglo.agregar(""+i);
		}
	}

	@Test
	public void testArregloDinamico() {
		// TODO
		assertTrue(arreglo!=null);
		assertEquals(0, arreglo.darTamano()); //ArregloDinamico con cero elementos (tamaño actual = 0)
		
	}

	@Test
	public void testDarElemento() {
		setUp2();
		// TODO
		assertTrue("No es el elemento esperado", arreglo.darElemento(5).compareTo(""+5)==0);
		assertFalse("El elemento no debería estar en el arreglo", arreglo.darElemento(2).compareTo(" "+2)==0);
		assertNull(arreglo.darElemento(300));
		assertNotNull(arreglo.darElemento(6));
	
		
		
	}

}
