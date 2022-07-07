package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.servlet.Integer;
import br.com.alura.gerenciador.servlet.String;

public class RemoveEmpresa {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Removendo empresa");
		
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		return "redirect:entrada?acao=ListaEmpresas";
		
		
	}
}
