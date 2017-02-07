import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class Test3 {
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	@Test
	public void test() {
		Suma spySuma= Mockito.spy(Suma.class);
		String s= "3,6,15,18,46,33";
		int[] numeros= new int[6];
		numeros[0]= 3;
		numeros[1]= 6;
		numeros[2]= 15;
		numeros[3]= 18;
		numeros[4]= 46;
		numeros[5]= 33;
		Mockito.when((spySuma.convertidor(s))).thenReturn(numeros);
		int esperado= 3+6+15+18+46+33;
		int obtenido;
		obtenido= spySuma.sumador(spySuma.convertidor(s));
		assertEquals("Test satisfactorio", esperado,obtenido);
	}

}

