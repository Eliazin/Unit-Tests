package calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraJunitTest {

	//Inicio dos testes de soma
	@SuppressWarnings("deprecation")
	@Test
	public void SomarDoisNumerosPositivos() { //Função para testes de soma com dois números positivos
		Soma somatoria = new Soma();
		int soma = somatoria.somar(3, 7);

		Assert.assertEquals(10, soma); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SomarComUmNumeroZero() { //Função para testes de soma com dois números e um sendo 0
		Soma somatoria = new Soma();
		int soma = somatoria.somar(3, 0);

		Assert.assertEquals(3, soma); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SomarComDoisNumerosZero() { //Função para testes de soma com dois números 0
		Soma somatoria = new Soma();
		int soma = somatoria.somar(0, 0);

		Assert.assertEquals(0, soma); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SomarComUmNumeroNegativo() { //Função para testes de soma com dois números, um positivo e um negativo
		Soma somatoria = new Soma();
		int soma = somatoria.somar(-3, 0);

		Assert.assertEquals(-3, soma); //Nenhum erro encontrado na função
	}	//Fim dos testes de soma

	//Inicio dos testes de subtração
	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairDoisNumerosPositivos() { //Função para testes de subtração com dois números positivos
		Subtracao sub = new Subtracao();
		int subtra = sub.subtracao(3, 7);
		Assert.assertEquals(-4, subtra); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairComUmNumeroZero() { //Função para testes de subtração com dois números e um sendo 0
		Subtracao sub = new Subtracao();
		int subtra = sub.subtracao(3, 0);
		Assert.assertEquals(3, subtra); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairComDoisNumerosZero() { //Função para testes de subtração com dois números zerados
		Subtracao sub = new Subtracao();
		int subtra = sub.subtracao(0, 0);
		Assert.assertEquals(0, subtra); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairComUmNumeroNegativo() { //Função para testes de subtração com dois números um sendo negativo e outro positivo
		Subtracao sub = new Subtracao();
		int subtra = sub.subtracao(4, -7);
		Assert.assertEquals(11, subtra); //Nenhum erro encontrado na função
	} //Fim dos testes de subtração

	//Inicio dos testes de multiplicação
	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarDoisNumerosPositivos() { //Função para testes de multiplicação com dois números positivos
		Multiplicacao mult = new Multiplicacao();
		int multipli = mult.multiplicacao(3, 7);
		Assert.assertEquals(21, multipli); //Nenhum erro encontrado na função
	} 

	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarComUmNumeroZero() { //Função para testes de multiplicação com dois números com um deles sendo zero
		Multiplicacao mult = new Multiplicacao();
		int multipli = mult.multiplicacao(3, 0);
		Assert.assertEquals(0, multipli); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarComDoisNumerosZero() { //Função para testes de multiplicação com dois números ambos sendo sendo 0
		Multiplicacao mult = new Multiplicacao();
		int multipli = mult.multiplicacao(0, 0);
		Assert.assertEquals(0, multipli); //Nenhum erro encontrado na função
	}

	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarComUmNumeroNegativo() { //Função para testes de multiplicação com dois números com um deles sendo negativo
		Multiplicacao mult = new Multiplicacao();
		int multipli = mult.multiplicacao(3, -4);
		Assert.assertEquals(-12, multipli); //Nenhum erro encontrado na função
	} //Fim dos testes de multiplicação

	//Inicio dos testes de divisão
	@SuppressWarnings("deprecation")
	@Test
	public void DividirDoisNumerosPositivos() { //Função para testes de divisão com dois números positivos
		Divisao div = new Divisao();
		double divi = div.divisao(3, 7);
		Assert.assertEquals(0.42857142857142857142857142857143, divi); //Erro encontrado ao usar variável int, recomendado utilizar float ou double
	}

	@SuppressWarnings("deprecation")
	@Test
	public void DividirComUmNumeroZero() { //Função para testes de divisão com dois números um positivo e um zero
		Divisao div = new Divisao();
		double divi = div.divisao(3, 0);
		Assert.assertEquals(0.0, divi); //Erro encontrado ao usar variável int e é necessário adicionar estrutura condicional para divisão com zero
	}

	@SuppressWarnings("deprecation")
	@Test
	public void DividirComDoisNumerosZero() { //Função para testes de divisão com dois números de valores zerados
		Divisao div = new Divisao();
		double divi = div.divisao(0, 0);
		Assert.assertEquals(0.0, divi); //Erro encontrado ao usar variável int e é necessário adicionar estrutura condicional para divisão com zero
	}

	@SuppressWarnings("deprecation")
	@Test
	public void DividirComUmNumeroNegativo() { //Função para testes de divisão com um numero negativo e outro positivo
		Divisao div = new Divisao();
		double divi = div.divisao(3, -4);
		Assert.assertEquals(-0.75, divi); //Erro encontrado ao usar variável int e é necessário adicionar estrutura condicional para divisão com zero
	}
}
