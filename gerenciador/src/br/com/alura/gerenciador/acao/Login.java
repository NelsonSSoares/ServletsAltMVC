package br.com.alura.gerenciador.acao;

public class Login implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Banco banco = new Banco();
		Usuario usuario = banco.existeUsuario(login, senha);
		
		if(usuario != null) {
			return "redirect:entrada?acao=ListaEmpresas";
		}else {
			return "redirect:entrada?acao=LoginForm";
		}
		
		
	};
	
}
