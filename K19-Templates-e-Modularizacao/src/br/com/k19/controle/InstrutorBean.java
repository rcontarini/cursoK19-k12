package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.k19.modelo.Instrutor;

@ManagedBean
public class InstrutorBean {
	
	private List<Instrutor> instrutores = new ArrayList<Instrutor>();
	
	public InstrutorBean(){
		
		Instrutor a = new Instrutor();
		a.setNome("Rodrigo");
		a.setDataDeNascimento("30/01/1991");
		
		Instrutor b = new Instrutor();
		b.setNome("Contarini");
		b.setDataDeNascimento("30/01/1991");
		
		this.instrutores.add(a);
		this.instrutores.add(b);
	}

	public List<Instrutor> getInstrutores() {
		return instrutores;
	}

	public void setInstrutores(List<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}
	
	
}
