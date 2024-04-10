package controladores;
import modelos.Departamento;
import persistencia.*;
import java.util.List;
import java.util.Scanner;


public class DepartamentoController { 
	private Scanner in = new Scanner(System.in);
	private DepartamentoDAO dao = new DepartamentoDAOImpl();
	
	public void agregarDepartamento() { 
		String nombre,capital,descripcion; 
		int poblacion; 
		System.out.println("nombre");
		nombre = in.nextLine();
		System.out.println("capital");
		capital = in.nextLine(); 
		System.out.println("descripcion");
		descripcion = in.nextLine();
		System.out.println("numero de la poblacion");
		poblacion = in.nextInt();
		
		
		Departamento departamento = new Departamento(nombre,capital,poblacion,descripcion);
		
		
		dao.agregarDepartamento(departamento);
		
		
	}
	public List<Departamento> obtenerDepartamentos(){
		
		return dao.obtenerDepartamentos();
		
	}
	
	public Departamento buscarDepartamentos(String nombre) {
		
		return dao.buscarDepartamento(nombre);
	}
	
	
	public void actualizarDepartamento(Departamento departamento) {
		
		
		dao.actualizarDepartamento(departamento);
	}
	
	
	public void eliminarDepartamento(String nombre) {
		
		
		dao.eliminarDepartamento(nombre);
	}
	
	
	
	
	

}
