package persistencia;

import java.util.List;
import java.util.ArrayList;

import modelos.Departamento;

public class DepartamentoDAOImpl implements DepartamentoDAO {
	
	private List<Departamento> departamentos = new ArrayList<>();
	

	@Override
	public void agregarDepartamento(Departamento departamento) {      
		// TODO Auto-generated method stub
		departamentos.add(departamento);
	}

	@Override
	public List<Departamento> obtenerDepartamentos() {
		// TODO Auto-generated method stub
		//return new ArrayList<>(departamentos);
		 List<Departamento> copiaDepartamentos = new ArrayList<>(departamentos);
		    
		    for (Departamento departamento : copiaDepartamentos) {
		        System.out.println(departamento);
		    }
		    
		    return copiaDepartamentos;
	}

	@Override
	public Departamento buscarDepartamento(String nombre) {
		// TODO Auto-generated method stub
		/*
		return departamentos.stream()
                .filter(departamento -> departamento.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
                */
		
		Departamento departamentoEncontrado = departamentos.stream()
	            .filter(departamento -> departamento.getNombre().equalsIgnoreCase(nombre))
	            .findFirst()
	            .orElse(null);

	    if (departamentoEncontrado != null) {
	        System.out.println("Información del departamento:");
	        System.out.println("Nombre: " + departamentoEncontrado.getNombre());
	        System.out.println("Capital: " + departamentoEncontrado.getCapital());
	        System.out.println("Población: " + departamentoEncontrado.getPoblacion());
	        System.out.println("Descripción: " + departamentoEncontrado.getDescripcion());
	    } else {
	        System.out.println("No se encontró el departamento con el nombre: " + nombre);
	    }

	    return departamentoEncontrado;
	    

	}

	@Override
	public void actualizarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub 
		int index = departamentos.indexOf(buscarDepartamento(departamento.getNombre()));
		if(index >= 0) {
			
			
			departamentos.set(index, departamento);
		}
		
	}

	@Override
	public void eliminarDepartamento(String nombre) {
		// TODO Auto-generated method stub
		departamentos.removeIf(departamento->departamento.getNombre().equalsIgnoreCase(nombre));
	}
	

}
