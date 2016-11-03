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
		Pessoa g1 = new Pessoa("Bruna", false, false);
		Pessoa g2 = new Pessoa("Fulana", true, false);
		Pessoa g3 = new Pessoa("Ciclana", false, false);
		
		Fila f = new Fila();
		
		f.addPessoa(g1);
		f.addPessoa(g2);
		f.addPessoa(g3);
		
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Fulana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "Bruna");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Ciclana");
		
		f.removePessoa(proximo);
	}
	
	// Teste 'testeproblema' solicitado na revisao de prova feito no dia 02-11-16
	@Test
	public void testeproblema() {
		
		Pessoa p1 = new Pessoa("Fulano", false, false);
		
		Fila f = new Fila();
		
		Pessoa proximo = f.proximoFila();
		
			if (proximo == null){
				Assert.assertNull(proximo);
			}
		
	}
	@Test
	public void testeIdoso() {
		
		Pessoa a1 = new Pessoa("Bruna", false, false);
		Pessoa a2 = new Pessoa("Fulana", true, false);
		Pessoa a3 = new Pessoa("Beltrano", false, true);
		
		Fila f = new Fila();
		
		f.addPessoa(a1);
		f.addPessoa(a2);
		f.addPessoa(a3);
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Beltrano");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "Fulana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Bruna");
		
		f.removePessoa(proximo);	
		
		
		
	}
	
	
}
