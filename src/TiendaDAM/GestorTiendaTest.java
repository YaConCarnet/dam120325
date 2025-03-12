package TiendaDAM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {

	static GestorTienda gestorTienda;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testCalcularDescuento() {
		GestorTienda gestorTienda = new GestorTienda();
		double resultado1 = gestorTienda.calcularDescuento(1, 100);
		assertEquals(0.1, resultado1);
		double resultado2 = gestorTienda.calcularDescuento(1, 9);
		assertEquals(0.05, resultado2);
		double resultado3 = gestorTienda.calcularDescuento(1, 2);
		assertEquals(0, resultado3);
	}

	@Test
	void testCategorizarProducto() {
	        GestorTienda tienda = new GestorTienda();
	        assertEquals("Económico", tienda.categorizarProducto(5));
	        assertEquals("Estándar", tienda.categorizarProducto(42));
	        assertEquals("Premium", tienda.categorizarProducto(86));
	}
	
	@Test
	void testBuscarProducto() {
		GestorTienda tienda = new GestorTienda();
        String[] inventario = {"Libro", "Marcapáginas", "Ebook"};
        assertEquals("Libro", tienda.buscarProducto(inventario, "Libro"));
        assertNull(tienda.buscarProducto(inventario, "Revista"));
	}
}
