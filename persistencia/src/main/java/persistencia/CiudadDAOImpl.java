package persistencia;

import java.util.ArrayList;
import java.util.List;

import modelos.Ciudad;
import modelos.Departamento;

public class CiudadDAOImpl  implements CiudadDAO{
private List<Ciudad> ciudades = new ArrayList<>();

@Override
public void agregarCiudad(Ciudad ciudad) {
	// TODO Auto-generated method stub
	
	ciudades.add(ciudad); 
	
}

@Override
public List<Ciudad> obtenerCiudad() {
	// TODO Auto-generated method stub
	List<Ciudad> copiaCiudades = new ArrayList<>(ciudades);
    
    for (Ciudad ciudad : copiaCiudades) {
        System.out.println(ciudad);
    }
    
    return copiaCiudades;
}


@Override
public Ciudad buscarCiudad(String nombre) {
	// TODO Auto-generated method stub
	Ciudad ciudadencontrada = ciudades.stream()
            .filter(ciudad -> ciudad.getNombre().equalsIgnoreCase(nombre))
            .findFirst()
            .orElse(null);

    if (ciudadencontrada != null) {
        System.out.println("Información del departamento:");
        System.out.println("Nombre: " + ciudadencontrada.getNombre());
        System.out.println("Cantidad habitantes: " + ciudadencontrada.getCantidadHabitantes());
        System.out.println("Numero de localidades: " + ciudadencontrada.getNumeroLocalidades());
        
    } else {
        System.out.println("No se encontró el departamento con el nombre: " + nombre);
    }

    return ciudadencontrada;
}

@Override
public void actualizarCiudad(Ciudad ciudad) {
	// TODO Auto-generated method stub
	//int index = ciudad.indexOf(buscarDepartamento(ciudad.getNombre()));
	//if(index >= 0) {
		
		
		//ciudades.set(index, ciudad);
	}


@Override
public void eliminarCiudad(String nombre) {
	// TODO Auto-generated method stub
	ciudades.removeIf(departamento->departamento.getNombre().equalsIgnoreCase(nombre));
}
	

	
}
