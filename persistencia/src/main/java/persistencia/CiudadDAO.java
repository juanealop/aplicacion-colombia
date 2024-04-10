package persistencia;

import java.util.List;


import modelos.Ciudad;

public interface CiudadDAO {
	void agregarCiudad(Ciudad ciudad);
	List<Ciudad> obtenerCiudad();
	Ciudad buscarCiudad(String nombre);
	void actualizarCiudad(Ciudad ciudad);
	void eliminarCiudad(String nombre);
	
	
}
