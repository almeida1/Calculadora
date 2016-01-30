package br.calc.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.calc.apresentacao.Calculadora;

public class UC01SomaDeParcelas {
	
	static Calculadora calculadora;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculadora = new Calculadora();
	}
	@Test
	public void CT01UC01SomaDeParcelas_com_sucesso() {
		assertEquals("resultado =",5,calculadora.soma(3,2),0);
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}

