package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import br.com.k19.modelo.Carro;

@ManagedBean
@ApplicationScoped
public class CarroBean {

	List<Carro> carros = new ArrayList<Carro>();
	private Carro carro = new Carro();

	public void adicionaCarro() {
		this.carros.add(this.carro);
		this.carro = new Carro();
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

}
