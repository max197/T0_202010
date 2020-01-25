package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		// TODO
		setUp2();
		assertEquals(100, modelo.darTamano());
	}

	@Test
	public void testAgregar() {
		// TODO Completar la prueba
		
		//Agrega un elemento despues de haber llenado la capacidad del arreglo
		setUp2();
		modelo.agregar(""+101);
		assertEquals(101, modelo.darTamano());
		
		//Agrega un elemento al Array
		modelo.agregar("");
		assertEquals(102, modelo.darTamano());
		
		//Agrega un duplicado del elemento anterior al Array
		modelo.agregar("");
		assertEquals(103,modelo.darTamano());
		

		
	}

	@Test
	public void testBuscar() {
		setUp2();
		// TODO Completar la prueba
		//busca un elemento determinado en el Array
		String buscado = modelo.buscar(""+3);
		assertTrue("No encontro el elemento que era", buscado.compareTo(""+3)==0);
		
		//busca un elemento que no se debio haber encontrado
		String buscado2 = modelo.buscar(""+101);
		assertNull("No debio haber encontrado ese string", buscado2);
		
		String buscado3 = modelo.buscar(""+9);
		assertNotNull("No debia ser null", buscado3);
		
	}

	@Test
	public void testEliminar() {
		setUp2();
		// TODO Completar la prueba
		String eliminado = modelo.eliminar(""+4);
		assertTrue("El tamaño del arreglo debería ser 99", modelo.darTamano()==99 );
		assertTrue("No se eliminó el elemento correcto", eliminado.compareTo(""+4)==0);
		
		String eliminado2 = modelo.eliminar(""+1);
		assertTrue("El tamaño del arreglo debería ser 98", modelo.darTamano()==98 );
		assertTrue("No se eliminó el elemento correcto", eliminado2.compareTo(""+1)==0);
		
		String eliminado3 = modelo.eliminar(""+0);
		assertTrue("El tamaño del arreglo debería ser 98", modelo.darTamano()==97 );
		assertTrue("No se eliminó el elemento correcto", eliminado3.compareTo(""+0)==0);
		
	}

}
