package calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Soma soma = new Soma();

		// ------------- Inicio dos testes de somatória -------------

		// Cenário de teste 1(somatória): soma de dois valores
		int somatoria = soma.somar(3, 7);
		System.out.println("Resultado teste da somatória: " + somatoria);

		// Cenário de teste 2(somatória): soma de dois valores sendo um 0
		somatoria = soma.somar(3, 0);
		System.out.println("Resultado teste da somatória: " + somatoria);

		// Cenário de teste 3(somatória): soma de dois valores com ambos sendo 0
		somatoria = soma.somar(0, 0);
		System.out.println("Resultado teste da somatória: " + somatoria);

		// Cenário de teste 4(somatória): soma de dois valores sendo um valor negativo
		somatoria = soma.somar(3, -1);
		System.out.println("Resultado teste da somatória: " + somatoria);
		
		// ---- Nenhum erro encontrado na função ------------- Fim dos testes de somatória -------------
		
		// --------------------------------------------------------------
		
		// ------------- Inicio dos testes de subtração -------------

		Subtracao subtra = new Subtracao();

		// Cenário de teste 1(subtração): subtração de dois valores
		int sub = subtra.subtracao(3, 7);
		System.out.println("Resultado teste da subtração: " + sub);

		// Cenário de teste 2(subtração): subtração de dois valores sendo um 0
		sub = subtra.subtracao(3, 0);
		System.out.println("Resultado teste da subtração: " + sub);

		// Cenário de teste 3(subtração): subtração de dois valores com ambos sendo 0
		sub = subtra.subtracao(0, 0);
		System.out.println("Resultado teste da subtração: " + sub);

		// Cenário de teste 4(subtração): subtração de dois valores sendo um valor
		// negativo
		sub = subtra.subtracao(3, -1);
		System.out.println("Resultado teste da subtração: " + sub);

		// ---- Nenhum erro encontrado na função ------------- Fim dos testes de Subtração -------------

		// --------------------------------------------------------------
		
		// ------------- Inicio dos testes de multiplicação -------------

		Multiplicacao multipli = new Multiplicacao();

		// Cenário de teste 1(multiplicação): multiplicação de dois valores
		int mult = multipli.multiplicacao(3, 7);
		System.out.println("Resultado teste da multiplicação: " + mult);

		// Cenário de teste 2(multiplicação): multiplicação de dois valores sendo um 0
		mult = multipli.multiplicacao(3, 0);
		System.out.println("Resultado teste da multiplicação: " + mult);

		// Cenário de teste 3(multiplicação): multiplicação de dois valores com ambos
		// sendo 0
		mult = multipli.multiplicacao(0, 0);
		System.out.println("Resultado teste da multiplicação: " + mult);

		// Cenário de teste 4(multiplicação): multiplicação de dois valores sendo um
		// valor negativo
		mult = multipli.multiplicacao(3, -1);
		System.out.println("Resultado teste da multiplicação: " + mult);

		// ---- Nenhum erro encontrado na função ------------- Fim dos testes de multiplicação -------------
		
		// --------------------------------------------------------------
		
		// ------------- Inicio dos testes de divisão -------------

		Divisao divi = new Divisao();

		// Cenário de teste 1(divisão): divisão de dois valores
		double div = divi.divisao(3, 7);
		System.out.println("Resultado teste da divisão: " + div);

		// Cenário de teste 2(divisão): divisão de dois valores sendo um 0
		div = divi.divisao(3, 0);
		System.out.println("Resultado teste da divisão: " + div); // Erro encontrado relacionado a divisão por inteiro zero, 
		// recomendado transformar as varíaveis de divisão em double ou float

		// Cenário de teste 3(divisão): divisão de dois valores com ambos sendo 0
		div = divi.divisao(0, 0);
		System.out.println("Resultado teste da divisão: " + div); // Erro encontrado relacionado a divisão por inteiro zero, 
		// recomendado transformar as varíaveis de divisão em double ou float

		// Cenário de teste 4(divisão): divisão de dois valores sendo um valor negativo
		div = divi.divisao(3, -1);
		System.out.println("Resultado teste da divisão: " + div);// Erro encontrado relacionado a divisão por inteiro negativo, 
		// recomendado transformar as varíaveis de divisão em double ou float
		
		// ------------- Fim dos testes de divisão -------------
	}
}
