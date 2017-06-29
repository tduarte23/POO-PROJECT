package object_colections;
import java.util.*;
import java.time.*;
public class ColeçãoConsultas {
	
	private ArrayList<Consulta> colConsultas;
	
	public ColeçãoConsultas(){
		colConsultas = new ArrayList<Consulta>();
	}
	
	public void adicionaConsulta(Consulta c){
		colConsultas.add(c);
	}
	
	public int qtdConsultasData(LocalDate date){
		int i=0;
		for(Consulta c: colConsultas){
			if(date.equals(c.getData())){
				i++;
			}
		}
		return i;
	}
	
	public ArrayList<Consulta> listagemConsultas(){
		ArrayList<Consulta> listConsulta = new ArrayList<Consulta>();
		for(Consulta c: colConsultas){
			listConsulta.add(c);
		}
		return listConsulta;
	}
	
	public int qntConsultasMédico(String nome){
		int i=0;
		for(Consulta c: colConsultas){
			if(nome.equals(c.getMedico().getNome()));
			i++;
		}
		return i;
	}
	
	public ArrayList<Consulta> listaConsultasPorPaciente(String nome){
		ArrayList<Consulta> listConsPPaciente = new ArrayList<Consulta>();
		for(Consulta c: colConsultas){
			if(nome.equals(c.getPaciente().getNome())){
				listConsPPaciente.add(c);
			}
		}
		return listConsPPaciente;
	}
}
