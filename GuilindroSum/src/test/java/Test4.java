import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class Test4 {
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	@Test
	public void test() {
		Suma spySuma= Mockito.spy(Suma.class);
		String s= "3,1000,1001,6,1234";
		int[] numeros= new int[5];
		numeros[0]= 3;
		numeros[1]= 1000;
		numeros[2]= 1001;
		numeros[3]= 6;
		numeros[4]= 1234;
		Mockito.when((spySuma.convertidor(s))).thenReturn(numeros);
		int esperado= 3+1000+6;
		int obtenido;
		obtenido= spySuma.sumador(spySuma.convertidor(s));
		assertEquals("Test satisfactorio", esperado,obtenido);
	}

}

