package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Usuario;

public class Login implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Banco banco = new Banco();
		Usuario usuario = banco.existeUsuario(login, senha);
		
		if(usuario != null) {
			HttpSession session = request.getSession();
			session.setAttribute("usuarioLogado", usuario);
			
			
			return "redirect:entrada?acao=ListaEmpresas";
		}else {
			
			return "redirect:entrada?acao=LoginForm";
		}
		
		
	};
	
}
