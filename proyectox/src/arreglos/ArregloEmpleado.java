package arreglos;

import java.util.ArrayList;

import objetos.Empleado;

public class ArregloEmpleado {
	private ArrayList<Empleado> arrEmpleado;
	
	public ArregloEmpleado() {
		arrEmpleado = new ArrayList<Empleado>();
	}
	
	public Empleado buscarPorCodigo(String codigo) {
		
		for (int i=0;i<arrEmpleado.size();i++){
			
			if(codigo.equals(arrEmpleado.get(i).getStrCodigo()))
			
			return arrEmpleado.get(i);
		}
		
		return null;
	}
	public void agregar(Empleado empleado) {
		arrEmpleado.add(empleado);
	}
	
	public int tamano() {
		return arrEmpleado.size();
	}
	
	public void eliminar(Empleado empleado) {
		arrEmpleado.remove(empleado);
	}
	
	public Empleado obtener(int posicion) {
		
		return arrEmpleado.get(posicion); 
	}
}
