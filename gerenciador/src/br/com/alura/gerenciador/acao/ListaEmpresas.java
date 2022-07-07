package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

public class ListaEmpresas {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("listando empresa");
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		request.setAttribute("empresas", lista);
		
		return "forward:listaEmpresas.jsp"
	}
}
