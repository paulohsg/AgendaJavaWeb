package br.com.agenda.jdbc.test;

import java.util.Calendar;

import br.com.agenda.jdbc.dao.ContatoDao;
import br.com.agenda.jdbc.model.Contato;

public class TestInsert {

	public static void main(String[] args) {
		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Paulo Henrique");
		contato.setEmail("paulohenrique@gmail.com");
		contato.setEndereco("R. Ledio N 24 Veiga jd");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conexão!!!
		ContatoDao dao = new ContatoDao();

		// método elegante
		dao.adiciona(contato);
		System.out.println("Gravado!");

	}

}
