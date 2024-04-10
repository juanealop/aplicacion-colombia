package persistencia;

import java.util.List;

import modelos.Departamento;

public interface DepartamentoDAO { 
	void agregarDepartamento(Departamento departamento);
	List<Departamento> obtenerDepartamentos();
	Departamento buscarDepartamento(String nombre);
	void actualizarDepartamento(Departamento departamento);
	void eliminarDepartamento(String nombre);
	
	
	

}
