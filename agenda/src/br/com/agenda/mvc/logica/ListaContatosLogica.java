package br.com.agenda.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.jdbc.dao.ContatoDao;
import br.com.agenda.jdbc.model.Contato;

public class ListaContatosLogica implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<Contato> contatos = new ContatoDao().getLista();
		req.setAttribute("contatos", contatos);
		return "/WEB-INF/jsp/lista-contatos.jsp";
	}
}