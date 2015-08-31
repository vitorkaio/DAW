package tipos;

import java.util.ArrayList;

public class Agendamento {
	
	private ArrayList<Cliente>agenda;
	
	public Agendamento(){
		
		if(agenda==null){
			agenda = new ArrayList<>();
		}
	}

	public ArrayList<Cliente> getAgenda() {
		return agenda;
	}
	
	public boolean addCliente(Cliente cliente){
		
		if(verificaExiste(cliente.getData()) == -1)
			return false;
		
		agenda.add(cliente);
		
		return true;
	}
	
	public final Cliente getCliente(int indice){
		
		return agenda.get(indice);
	}
	
	public int getQuantidade(){
		
		return agenda.size();
	}
	
	// Verifica se a data já existe.
	private int verificaExiste(String data){
		
		int contador;
		
		for(contador = 0; contador < agenda.size(); contador++){
			
			Cliente cliente = agenda.get(contador);
			
			if(cliente.getData().equalsIgnoreCase(data) == true)
				return -1;
			
		}
		
		return contador;
	}

}
