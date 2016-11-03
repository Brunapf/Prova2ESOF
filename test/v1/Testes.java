package v1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class Testes {

	@Test
	public void exemplo() {
		Pessoa p1 = new Pessoa("Fulano", false, false);
		Pessoa p2 = new Pessoa("Ciclana", false, false);
		Pessoa p3 = new Pessoa("Beltrana", false, false);
		
		Fila f = new Fila();
		
		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Fulano");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "Ciclana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Beltrana");
		
		f.removePessoa(proximo);
	
		
	}
	
	@Test
	public void testegravida() {
		Pessoa g1 = new Pessoa("Fulano", false, false);
		Pessoa g2 = new Pessoa("Ciclana", true, false);
		
		Fila f = new Fila();
		
		f.addPessoa(g1);
		f.addPessoa(g2);
		
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Ciclana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "Fulano");
		
		f.removePessoa(proximo);
		
	}
	
	@Test
	public void testeproblema() {
		
		Pessoa p1 = new Pessoa("Fulano", false, false);
		
		Fila f = new Fila();
		
		Pessoa proximo = f.proximoFila();
		
			if (proximo == null){
				Assert.assertNull(proximo);
			}
		
		
		
	}
	
	
}
