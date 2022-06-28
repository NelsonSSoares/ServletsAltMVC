package br.com.alura.gerenciador.acao;

import org.apache.taglibs.standard.extra.spath.ParseException;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;
import br.com.alura.gerenciador.servlet.Date;
import br.com.alura.gerenciador.servlet.Integer;
import br.com.alura.gerenciador.servlet.RequestDispatcher;
import br.com.alura.gerenciador.servlet.ServletException;
import br.com.alura.gerenciador.servlet.SimpleDateFormat;
import br.com.alura.gerenciador.servlet.String;

public class NovaEmpresa {
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		request.setAttribute("empresa", empresa.getNome());
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
	}
}
