package controle;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tipos.Agendamento;
import tipos.Cliente;

@WebServlet("/addCliente")
public class InsereCliente extends HttpServlet{
	
	private Agendamento agenda = new Agendamento();
	private static int quantidade = 0;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		
		String nome = req.getParameter("nome"),
			   email = req.getParameter("email"),
			   nomeCao = req.getParameter("nomeCao"),
			   porteCao = req.getParameter("porte"),
			   raca = req.getParameter("raca"),
			   data = req.getParameter("data");
		
		// Tratando campos vazios.
		data = preenche(data);
		email = preenche(email);
		nomeCao = preenche(nomeCao);
		porteCao = preenche(porteCao);
		raca = preenche(raca);
		
		String[] servico = req.getParameterValues("servico");
		
		StringBuffer ser = new StringBuffer();
		
		if(servico == null)
			ser.append("");
		
		else{
			
			for(String s : servico){
				
				if(ser.length() > 0)
					ser.append(" e ");
				
				ser.append(s);
				
			}
			
		}
		
		
		Cliente cliente = new Cliente(email, nome, nomeCao, porteCao, raca, data, ser.toString());
		String url;
		
		if (verificaDados(cliente) == false)
			url = "erro.jsp";
		
		else if(agenda.addCliente(cliente) == false)
			url = "erro.jsp";
		
		else{
			
			url = "index.jsp";
			quantidade++;
		}
		
		ServletContext app = getServletContext();
		app.setAttribute("agenda", agenda);
		
		//Redirecting
		res.sendRedirect(url);
		
		
	}
	
	// Verifica a integridade dos dados.
		private boolean verificaDados(Cliente cliente){
			
			if(Data.verificaData(cliente.getData()) == false)
				return false;
			
			if(cliente.getNome().equalsIgnoreCase("") == true)
				return false;
			
			if(cliente.getNomeCao().equalsIgnoreCase("") == true)
				return false;
			
			if(cliente.getPorteCao().equalsIgnoreCase("") == true)
				return false;
			
			if(cliente.getEmail().equalsIgnoreCase("") == true)
				return false;
			
			if(cliente.getRaca().equalsIgnoreCase("") == true)
				return false;
			
			if(cliente.getServico().equalsIgnoreCase("") == true)
				return false;
			
			return true;
		}
		
		// Método que preenche variavéis vazias.
        private String preenche(String dado){
        	
        	if(dado == null)
        		return "";
        	
        	return dado;
        	
        }
}
