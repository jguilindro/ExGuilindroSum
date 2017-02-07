import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class Test2 {
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	@Test
	public void test() {
		Suma spySuma= Mockito.spy(Suma.class);
		String s= "3,6";
		int[] numeros= new int[2];
		numeros[0]= 3;
		numeros[1]= 6;
		Mockito.when((spySuma.convertidor(s))).thenReturn(numeros);
		int esperado= 9;
		int obtenido;
		obtenido= spySuma.sumador(spySuma.convertidor(s));
		assertEquals("Test satisfactorio", esperado,obtenido);
	}

}
