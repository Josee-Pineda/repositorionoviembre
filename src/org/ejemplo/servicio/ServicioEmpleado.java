package org.ejemplo.servicio;

/*
 * NINGUN EMPLEADO DEBE TENER UN BONO MAYOR A 10,000
 * 
 * NINGUN EMPLEADO DEBE TENER UN PRESTAMO MAYOR A 5,000
 */


public class ServicioEmpleado {
	
	public double salarioBono(double salario, double bono) {
		return salario + bono;
	}
	
	public double salarioPrestamo(double salario, double prestamo) {
		return salario + prestamo;
	}

}
