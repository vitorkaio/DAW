package controle;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tipos.Agendamento;
import tipos.Cliente;

@WebServlet("/tt")
public class Prestacao extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	 Cliente prestacao = new Cliente();	
	 String url;
	 
	 Agendamento agenda = (Agendamento)getServletContext().getAttribute("agenda");
	 
	 if(agenda == null)
	    	url = "erro.jsp";
	
	 else{
	    	// Verifica qual serviço foi feito a partir da data passada.
		    for(int contador = 0; contador < agenda.getQuantidade(); contador++){
		    	
		    	Cliente cliente = agenda.getCliente(contador);
		    	
		    	// Se a data do serviço do cliente for igual ou maior salva no array.
		    	if(Data.prestacao(cliente.getData()) == true)
		    		prestacao = cliente;
		    	
		    }
	    	
	    }
	 
	 if(prestacao == null)
		 url = "index.jsp";
	 
	 else
		 url = "index.jsp";
		 
	req.setAttribute("prestacao", prestacao);
	
	RequestDispatcher dispatcher = req.getRequestDispatcher(url);
	dispatcher.forward(req, res);
		
	
	}

}
