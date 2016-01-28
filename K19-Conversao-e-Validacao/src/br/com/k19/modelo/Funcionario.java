package br.com.k19.modelo;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Funcionario {

	@NotNull(message = "O valor nao pode ser nulo")
	@Min(value = 0, message = "O valor nao pode ser menor que 0")
	private Double salario;
	
	@NotNull(message = "O valor nao pode ser nulo")
	@Min(value = 5, message = " O valor nao pode ser menor que 5")
	@Max(value = 19, message = "O valor nao pode ser maior que 20")
	private Integer codigo;
	
	@NotNull(message = "O valor nao pode ser nulo")
	private Date dataDeAniversario;

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getDataDeAniversario() {
		return dataDeAniversario;
	}

	public void setDataDeAniversario(Date dataDeAniversario) {
		this.dataDeAniversario = dataDeAniversario;
	}
}
