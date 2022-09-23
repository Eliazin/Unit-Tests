package calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraJunitTest {

	//Inicio dos testes de soma
	@SuppressWarnings("deprecation")
	@Test
	public void SomarDoisNumerosPositivos() {
		Soma somatoria = new Soma();
		int soma = somatoria.somar(3, 7);

		Assert.assertEquals(10, soma); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SomarComUmNumeroZero() {
		Soma somatoria = new Soma();
		int soma = somatoria.somar(3, 0);

		Assert.assertEquals(3, soma); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SomarComDoisNumerosZero() {
		Soma somatoria = new Soma();
		int soma = somatoria.somar(0, 0);

		Assert.assertEquals(0, soma); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SomarComUmNumeroNegativo() {
		Soma somatoria = new Soma();
		int soma = somatoria.somar(-3, 0);

		Assert.assertEquals(-3, soma); //Nenhum erro encontrado na função
	}	//Fim dos testes de soma

	//Inicio dos testes de subtração
	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairDoisNumerosPositivos() {
		Subtracao sub = new Subtracao();
		int subtra = sub.subtracao(3, 7);
		Assert.assertEquals(-4, subtra); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairComUmNumeroZero() {
		Subtracao sub = new Subtracao();
		int subtra = sub.subtracao(3, 0);
		Assert.assertEquals(3, subtra); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairComDoisNumerosZero() {
		Subtracao sub = new Subtracao();
		int subtra = sub.subtracao(0, 0);
		Assert.assertEquals(0, subtra); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairComUmNumeroNegativo() {
		Subtracao sub = new Subtracao();
		int subtra = sub.subtracao(4, -7);
		Assert.assertEquals(11, subtra); //Nenhum erro encontrado na função
	} //Fim dos testes de subtração

	//Inicio dos testes de multiplicação
	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarDoisNumerosPositivos() {
		Multiplicacao mult = new Multiplicacao();
		int multipli = mult.multiplicacao(3, 7);
		Assert.assertEquals(21, multipli); //Nenhum erro encontrado na função
	} 

	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarComUmNumeroZero() {
		Multiplicacao mult = new Multiplicacao();
		int multipli = mult.multiplicacao(3, 0);
		Assert.assertEquals(0, multipli); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarComDoisNumerosZero() {
		Multiplicacao mult = new Multiplicacao();
		int multipli = mult.multiplicacao(0, 0);
		Assert.assertEquals(0, multipli); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarComUmNumeroNegativo() {
		Multiplicacao mult = new Multiplicacao();
		int multipli = mult.multiplicacao(3, -4);
		Assert.assertEquals(-12, multipli); //Nenhum erro encontrado na função
	} //Fim dos testes de multiplicação

	//Inicio dos testes de divisão
	@SuppressWarnings("deprecation")
	@Test
	public void DividirDoisNumerosPositivos() {
		Divisao div = new Divisao();
		double divi = div.divisao(3, 7);
		Assert.assertEquals(0.42857142857142857142857142857143, divi); //Erro encontrado ao usar variável int, recomendado utilizar float ou double
	}

	@SuppressWarnings("deprecation")
	@Test
	public void DividirComUmNumeroZero() {
		Divisao div = new Divisao();
		double divi = div.divisao(3, 0);
		Assert.assertEquals(0.0, divi); //Erro encontrado ao usar variável int e é necessário adicionar estrutura condicional para divisão com zero
	}

	@SuppressWarnings("deprecation")
	@Test
	public void DividirComDoisNumerosZero() {
		Divisao div = new Divisao();
		double divi = div.divisao(0, 0);
		Assert.assertEquals(0.0, divi); //Erro encontrado ao usar variável int e é necessário adicionar estrutura condicional para divisão com zero
	}

	@SuppressWarnings("deprecation")
	@Test
	public void DividirComUmNumeroNegativo() {
		Divisao div = new Divisao();
		double divi = div.divisao(3, -4);
		Assert.assertEquals(-0.75, divi); //Erro encontrado ao usar variável int e é necessário adicionar estrutura condicional para divisão com zero
	}
}
