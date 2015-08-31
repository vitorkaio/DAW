package controle;

import java.time.LocalDate;

public class Data {

	// Verifica se a data está correta.
	public static boolean verificaData(String date){

		boolean valor = date.matches("\\d{2}/\\d{2}/\\d{4}");
		if(valor == false)
			return false;

		// Valida a data.
		String d[] = date.split("/");

		try{

			LocalDate data = LocalDate.of(Integer.parseInt(d[2]), Integer.parseInt(d[1]), Integer.parseInt(d[0]));

		}

		catch(Exception ex){
			return false;
		}
		return true;
	}

	// Verifica se a data 2 é maior ou igual que a data 1.
	public static boolean comparaDatas(String dataUm, String dataDois){
		
		String d1[] = dataUm.split("/");
		String d2[] = dataDois.split("/");
		
		int diaDataUm, mesDataUm, anoDataUm, diaDataDois, mesDataDois, anoDataDois;
		
		try{
		
		// Convertendo as datas para inteiro.
		    diaDataUm = Integer.parseInt(d1[0]);
			mesDataUm = Integer.parseInt(d1[1]);
			anoDataUm = Integer.parseInt(d1[2]);
			diaDataDois = Integer.parseInt(d2[0]);
			mesDataDois = Integer.parseInt(d2[1]);
			anoDataDois = Integer.parseInt(d2[2]);
		}
		
		catch(NumberFormatException ex){
			
			return false;
		}

		// Verifica se o ano de data dois é menor, se sim retorna false.
		if(anoDataDois < anoDataUm)
			return false;
		
		else if(anoDataDois == anoDataUm){
			
			// Verifica se o dia e o mês de data dois é maior ou igual do que data 1.
			if(mesDataDois < mesDataUm)
				return false;
			
			if(mesDataDois == mesDataUm){
				
				if(diaDataDois < diaDataUm)
					return false;
			}
			
		}
		
		return true;
	}
	
    
	// Verifica se tem algum serviço hoje.
	public static boolean prestacao(String dataDois){
		
		LocalDate d = LocalDate.now();
		
		String s[] = d.toString().split("-");
		
		StringBuffer ss = new StringBuffer();
		for(int i = s.length - 1; i >= 0; i--){
			
			ss.append(s[i]);
			ss.append('/');
		}
		
		ss.deleteCharAt(ss.length() - 1);

		if(ss.toString().equalsIgnoreCase(dataDois))
		   return true;
		
		return false;
	}
	
	// Verifica se uma data está contida.
	public static boolean intervalo(String dataUm, String dataDois, String dataTres){
		
		String d1[] = dataUm.split("/");
		String d2[] = dataDois.split("/");
		String d3[] = dataTres.split("/");
		
		int diaDataUm, mesDataUm, anoDataUm, diaDataDois, mesDataDois, anoDataDois,
		    diaDataTres, mesDataTres, anoDataTres;
		
		try{
		
		// Convertendo as datas para inteiro.
		    diaDataUm = Integer.parseInt(d1[0]);
			mesDataUm = Integer.parseInt(d1[1]);
			anoDataUm = Integer.parseInt(d1[2]);
			diaDataDois = Integer.parseInt(d2[0]);
			mesDataDois = Integer.parseInt(d2[1]);
			anoDataDois = Integer.parseInt(d2[2]);
			diaDataTres = Integer.parseInt(d3[0]);
			mesDataTres = Integer.parseInt(d3[1]);
			anoDataTres = Integer.parseInt(d3[2]);
		}
		
		catch(NumberFormatException ex){
			
			return false;
		}
		
		// Verifica se a dataUm é menor que dataDois
		if(anoDataUm > anoDataDois){
			
			int aux = anoDataUm;
			anoDataUm = anoDataDois;
			anoDataDois = aux;
			
			aux = mesDataUm;
			mesDataUm = mesDataDois;
			mesDataDois = aux;
			
			aux = diaDataUm;
			diaDataUm = diaDataDois;
			diaDataDois = aux;
		}
		// Verificando se o ano está dentro do intervalo
		if(anoDataTres < anoDataUm || anoDataTres > anoDataDois)
			return false;
		
		if(anoDataTres >= anoDataUm && anoDataTres <= anoDataDois){
			
			// Verificando se está no mesmo ano da dataUm.
			if(anoDataTres == anoDataUm){
				
				// Verifica se o dia e o mês de data dois é maior ou igual do que data 1.
				if(mesDataTres < mesDataUm)
					return false;
				
				if(mesDataTres == mesDataUm){
					
					if(diaDataTres < diaDataUm)
						return false;
					
				}
				
			}
			
			if(anoDataTres == anoDataDois){
				
				// Verifica se o dia e o mês de data dois é maior ou igual do que data 1.
				if(mesDataTres > mesDataDois)
					return false;
				
				if(mesDataTres == mesDataDois){
					
					if(diaDataTres > diaDataDois)
						return false;
					
				}
				
			}
			
			
		}
		
		
		return true;
	}
	
}
