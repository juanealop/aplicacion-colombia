package controladores;

import java.util.List;
import java.util.Scanner;

import modelos.Ciudad;
import persistencia.CiudadDAO;
import persistencia.CiudadDAOImpl;

public class CiudadController {
	private Scanner in = new Scanner(System.in);
	private CiudadDAO dao = new CiudadDAOImpl();
	
	public void agregarCiudad() { 
		String nombre; 
		int habitantes,localidades; 
		System.out.println("nombre");
		nombre = in.nextLine();
		System.out.println("habitantes");
		habitantes = in.nextInt(); 
		System.out.println("localidades");
		localidades = in.nextInt();
		
		
		Ciudad ciudad = new Ciudad(nombre,habitantes,localidades);
	
		
		
		dao.agregarCiudad(ciudad);
		
		
	}
	public List<Ciudad> obtenerCiudad(){
		
		return dao.obtenerCiudad();
		
	}
	
	public Ciudad buscarCiudades(String nombre) {
		
		return dao.buscarCiudad(nombre);
		
	}
	
	/*
	public void actualizarDepartamento(Departamento departamento) {
		
		
		dao.actualizarDepartamento(departamento);
	}
	*/
	
	
	
	
	public void eliminarCiudad(String nombre) {
		
		
		dao.eliminarCiudad(nombre);
	}
	
	
}
