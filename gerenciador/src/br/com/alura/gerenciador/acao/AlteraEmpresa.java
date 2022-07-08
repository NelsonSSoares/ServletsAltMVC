package br.com.alura.gerenciador.acao;

import org.apache.taglibs.standard.extra.spath.ParseException;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;
import br.com.alura.gerenciador.servlet.Date;
import br.com.alura.gerenciador.servlet.Integer;
import br.com.alura.gerenciador.servlet.ServletException;
import br.com.alura.gerenciador.servlet.SimpleDateFormat;
import br.com.alura.gerenciador.servlet.String;

public class AlteraEmpresa {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Date dataAbertura = null;
		
		System.out.println("Alterando empresa" + id);
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		System.out.println(id);
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPelaId(id);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		return "redirect:entrada?acao=ListaEmpresas";
		
		
	}
}
