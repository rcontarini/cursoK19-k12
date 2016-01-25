package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsereEditora {
	public static void main(String[] args) {

		try {

			Connection conexao = ConnectionFactory.createConnection();

			Scanner entrada = new Scanner(System.in);

			System.out.println("Digite o nome da editora: ");
			String nome = entrada.nextLine();

			System.out.println("Digite o email da editora: ");
			String email = entrada.nextLine();

			entrada.close();

			String sql = "INSERT INTO Editora (nome, mail) VALUES (?, ?)";

			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setString(1, nome);
			comando.setString(2, email);

			System.out.println("Executando comando .....");
			comando.execute();

			System.out.println("Fechando a conexao .....");
			conexao.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
