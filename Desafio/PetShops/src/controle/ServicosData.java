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

@WebServlet("/pesquisa")
public class ServicosData extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		ArrayList<Cliente>servicos = new ArrayList<>();
		
	    String data = req.getParameter("data");
	    String url = "";
	    
	    if(data == null)
	    	data = "01/01/2000";
	    
	    Agendamento agenda = (Agendamento)getServletContext().getAttribute("agenda");
	    
	    if(agenda == null){
	    	url = "erro.jsp";
	    }
	    
	    else{
	    	
	    	// Verifica qual serviço foi feito a partir da data passada.
		    for(int contador = 0; contador < agenda.getQuantidade(); contador++){
		    	
		    	Cliente cliente = agenda.getCliente(contador);
		    	
		    	// Se a data do serviço do cliente for igual ou maior salva no array.
		    	if(Data.comparaDatas(data, cliente.getData()) == true)
		    		servicos.add(cliente);
		    	
		    }
	    	
	    }
	    
	    
	    // verifica se o array de serviços está vazio.
	    if(servicos.isEmpty() == true)
	    	url = "erro.jsp";
	    
	    else
	    	url = "lista.jsp";
	    
	    // Verifica a integridade da data.
	    if(Data.verificaData(data) == false)
	        url = "erro.jsp";
	    
	    ServletContext app = getServletContext();
		app.setAttribute("servicos", servicos);
		
		//Redirecting
		res.sendRedirect(url);
	    
	}

}
