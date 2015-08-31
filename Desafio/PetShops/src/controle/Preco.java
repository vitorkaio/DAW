package controle;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tipos.Agendamento;
import tipos.Cliente;

@WebServlet("/relatorio")
public class Preco extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {


		ArrayList<Cliente>tab = new ArrayList<>();
		String data1 = req.getParameter("data1");
		String data2 = req.getParameter("data2");
		String url;
		float faturamento = 0;

		if(data1 == null)
			data1 = "01/01/2000";

		if(data2 == null)
			data2 = "01/01/2100";


		Agendamento agenda = (Agendamento)getServletContext().getAttribute("agenda");

		if(agenda == null)
			url = "erro.jsp";

		else{
			// Verifica qual serviço foi feito a partir da data passada.
			for(int contador = 0; contador < agenda.getQuantidade(); contador++){

				Cliente cliente = agenda.getCliente(contador);

				// Se a data do serviço do cliente for igual ou maior salva no array.
				if(Data.intervalo(data1, data2, cliente.getData()) == true){

					tab.add(cliente);

					if(cliente.getServico().equalsIgnoreCase("Tosa") == true)
						faturamento += 35;

					else if(cliente.getServico().equalsIgnoreCase("Banho") == true)
						faturamento += 20;

					else
						faturamento += 50;

				}

			}

		}

		// verifica se o array de serviços está vazio.
		if(tab.isEmpty() == true)
			url = "erro.jsp";

		else
			url = "relatorio.jsp";

		// Verifica a integridade da data.
		if(Data.verificaData(data1) == false)
			url = "erro.jsp";

		// Verifica a integridade da data.
		if(Data.verificaData(data2) == false)
			url = "erro.jsp";

		ServletContext app = getServletContext();
		app.setAttribute("tab", tab);

		app = getServletContext();
		app.setAttribute("faturamento", faturamento);


		//Redirecting
		res.sendRedirect(url);

	}

}
