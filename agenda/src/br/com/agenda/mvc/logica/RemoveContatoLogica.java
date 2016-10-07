package br.com.agenda.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.jdbc.dao.ContatoDao;
import br.com.agenda.jdbc.model.Contato;

public class RemoveContatoLogica implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		long id = Long.parseLong(req.getParameter("id"));
		Contato contato = new Contato();
		contato.setId(id);
		ContatoDao dao = new ContatoDao();
		dao.remove(contato);
		System.out.println("Excluindo contato... ");
		return "mvc?logica=RemoveContatosLogica";
	}
}