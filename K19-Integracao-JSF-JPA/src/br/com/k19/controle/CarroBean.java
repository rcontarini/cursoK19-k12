package br.com.k19.controle;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

import br.com.k19.modelo.Carro;
import br.com.k19.modelo.CarroRepository;

@ManagedBean
public class CarroBean {

	private Carro carro = new Carro();
	
	private List<Carro> carros;

	public void adicionaCarro() {
		EntityManager manager = this.getEntityManager();
		CarroRepository repository = new CarroRepository(manager);

		repository.adiciona(this.carro);
		this.carro = new Carro();
		this.carros = null;
	}

	public List<Carro> getCarros() {
		if(this.carros == null){
			
			EntityManager manager = this.getEntityManager();
			CarroRepository repository = new CarroRepository(manager);
			
			System.out.println("Chamando o repositorio");
			this.carros = repository.buscarTodos();
		}
		
		return this.carros;
	}

	private EntityManager getEntityManager() {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpServletRequest request = (HttpServletRequest) ec.getRequest();
		EntityManager manager = (EntityManager) request.getAttribute("EntityManager");

		return manager;

	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
}
