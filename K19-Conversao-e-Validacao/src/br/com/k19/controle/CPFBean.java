package br.com.k19.controle;

import javax.faces.bean.ManagedBean;

import br.com.k19.modelo.CPF;

@ManagedBean
public class CPFBean {
	
	@br.com.k19.beanvalidators.CPF
	private CPF cpf;

	public CPF getCpf() {
		return cpf;
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}

}
