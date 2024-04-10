package modelos;

public class Ciudad { 
	private String nombre; 
	private int cantidadHabitantes; 
	private int numeroLocalidades; 
	
	public Ciudad(String nombre, int cantidadHabitantes, int numeroLocalidades) {
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
        this.numeroLocalidades = numeroLocalidades;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public int getNumeroLocalidades() {
        return numeroLocalidades;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadHabitantes(int cantidadHabitantes) {
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public void setNumeroLocalidades(int numeroLocalidades) {
        this.numeroLocalidades = numeroLocalidades;
    }
	

}
