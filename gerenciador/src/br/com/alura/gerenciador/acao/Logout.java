package br.com.alura.gerenciador.acao;

public class Logout implements Acao {
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException){
		
		HttpSession session = request.getSession();
		
		//session.removeAttribute("usuarioLogado");
		session.invalidate();
		return "redirect:entrada?acao=LoginForm";
	}
}
