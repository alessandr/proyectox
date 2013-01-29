package principal;

import objetos.*;
import arreglos.*;
import java.util.*;

public class main {

	static ArregloEmpleado arrEmpleado = new ArregloEmpleado();

	public static void main(String[] args) {

		Empleado objEmpleado1 = new Empleado("0021", "Manuel", "Ruiz",
				"Bocanegra", "4562070", 28);
		Empleado objEmpleado2 = new Empleado("0022", "Julio", "Fernandez",
				"Villa El Salvador", "5723065", 32);
		Empleado objEmpleado3 = new Empleado("0025", "Ana Karina", "Llanos",
				"Callao", "994880339", 27);

		insertar(objEmpleado1);
		insertar(objEmpleado2);
		// insertar(objEmpleado3);

		eliminar(objEmpleado3);

		/*
		 * ArrayList<Empleado> arrEmpleado; arrEmpleados = new
		 * ArrayList<Empleado>();
		 * 
		 * arrEmpleado.add(objEmpleado1); arrEmpleado.add(objEmpleado2);
		 * arrEmpleado.add(objEmpleado3);
		 * 
		 * 
		 * for (int i=0; i<arrEmpleados.size();i++){
		 * System.out.println("Codigo: "+arrEmpleados.get(i).getStrCodigo()+
		 * "| Nombres y Apellidos: "+arrEmpleados.get(i).getStrNombre()+
		 * " "+arrEmpleados.get(i).getStrApellido()+
		 * "| Edad: "+arrEmpleados.get(i).getIntEdad()); }
		 * 
		 * // TODO Auto-generated method stub // Empleado objEmpleado; //
		 * objEmpleado = new Empleado();
		 * 
		 * int arreglo[]={1,2,3,4,5}; ArrayList<String> arregloCadena;
		 * arregloCadena=new ArrayList<String>();
		 * 
		 * arregloCadena.add("cadena1"); arregloCadena.add("cadena2");
		 * arregloCadena.add("cadena3"); arregloCadena.add("cadena4");
		 * arregloCadena.add("cadena5");
		 * 
		 * for (int i=0; i<arregloCadena.size();i++){
		 * System.out.println(arregloCadena.get(i)); }
		 * 
		 * arregloCadena.remove(0);
		 * 
		 * for (int i=0; i<arregloCadena.size();i++){
		 * System.out.println(arregloCadena.get(i)); } for (int i=0;
		 * i<arreglo.length; i++){ if (arreglo[i]%2!=0){
		 * System.out.println("posicion="+i+" valor= "+arreglo[i]); } }
		 * 
		 * System.out.println("valor de ultima posicion = "+arreglo[(arreglo.length
		 * -1)]);
		 */
	}

	public static void insertar(Empleado empleado) {

		if (arrEmpleado.buscarPorCodigo(empleado.getStrCodigo()) == null) {
			arrEmpleado.agregar(empleado);
			System.out.println("Empleado agregado");
		} else {
			System.out.println("El empleado ya existe");
		}
	}

	public static void eliminar(Empleado empleado) {
		if (arrEmpleado.buscarPorCodigo(empleado.getStrCodigo()) != null) {
			arrEmpleado.eliminar(empleado);
			System.out.println("El empleado ha sido eliminado");
		} else {
			System.out.println("Empleado no existe!!");
		}
	}

}
