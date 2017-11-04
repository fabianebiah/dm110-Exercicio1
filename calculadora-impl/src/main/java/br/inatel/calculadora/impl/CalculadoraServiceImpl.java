package br.inatel.calculadora.impl;

import br.inatel.calculadora.api.CalculadoraService;
import br.inatel.calculadora.api.Resultado;

public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public Resultado soma(int num1, int num2) {
		Resultado result = new Resultado();
		result.setNumero1(num1);
		result.setNumero2(num2);
		int resultado = num1 + num2;
		result.setResultado(resultado);
		return result;
	}

	@Override
	public Resultado subtrai(int num1, int num2) {
		Resultado result = new Resultado();
		result.setNumero1(num1);
		result.setNumero2(num2);
		int resultado = num1 - num2;
		result.setResultado(resultado);
		return result;
	}

}
