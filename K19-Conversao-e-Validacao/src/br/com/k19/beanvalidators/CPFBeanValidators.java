package br.com.k19.beanvalidators;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPFBeanValidators implements ConstraintValidator<CPF, br.com.k19.modelo.CPF> {

	@Override
	public void initialize(CPF constraintAnnotation) {

	}

	@Override
	public boolean isValid(br.com.k19.modelo.CPF cpf, ConstraintValidatorContext context) {

		int numeroDeIdentificacao = cpf.getNumeroDeIdentificacao();
		int primeiroDigitoVerificador = cpf.getPrimeiroDigitoVerificador();
		int segundoDigitoVerificador = cpf.getSegundoDigitoVerificador();

		return this.validaCPF(numeroDeIdentificacao, primeiroDigitoVerificador, segundoDigitoVerificador);
	}

	public boolean validaCPF(int numeroDeIdentificacao, int primeiroDigitoVerificador, int segundoDigitoVerificador) {

		long primeiroDigito = this.modulo11((long) numeroDeIdentificacao);
		long segundoDigito = this.modulo11((long) numeroDeIdentificacao * 10 + primeiroDigito);

		return primeiroDigitoVerificador == primeiroDigito && segundoDigitoVerificador == segundoDigito;
	}

	private long modulo11(long numero) {
		long soma = 0;
		long multiplicador = 2;
		while (numero > 0) {
			long digito = numero % 10;
			soma += multiplicador * digito;
			numero /= 10;
			multiplicador++;
		}
		long resto = soma % 11;
		if (resto < 2)
			return 0;
		else
			return 11 - resto;

	}

}
