package br.com.alura.gerenciador.acao;

public class LoginForm implements Acao {
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		
		return "forward:formLogin.jsp";
	};
}
