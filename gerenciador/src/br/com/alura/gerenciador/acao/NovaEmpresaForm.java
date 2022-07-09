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

public class NovaEmpresaForm {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		return "forward:formNovaEmpresa.jsp";
	}
}
