package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		//Criar um gerenciador de entidades:
		
		//Primeiro cria a f�brica:
		EntityManagerFactory fabrica =
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Depois, a fabrica cria os Entities manager
		EntityManager em = fabrica.createEntityManager();
		
		
		
		
		fabrica.close();
	}
	
}
