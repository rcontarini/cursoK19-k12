package br.com.k19.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsereEditoraComJpa {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("livraria-pu");

		EntityManager manager = factory.createEntityManager();

		Editora editora1 = new Editora();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o nome da editora: ");
		editora1.setNome(entrada.nextLine());

		System.out.println("Digite o email da editora: ");
		editora1.setEmail(entrada.nextLine());

		entrada.close();

		manager.persist(editora1);

		manager.getTransaction().begin();
		manager.getTransaction().commit();

		manager.close();
		factory.close();
	}
}
