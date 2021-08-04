package main;

public class Aseguradora {

	static double pension = 12;
	static double salud = 8.5;
	static double riesgosLab = 0.522;
	static double minimo = 908526;

	
	  public static void main(String[] args) {
	  int salario = 1810050; 
	  int diasTrabajados = 152; 
	  Aseguradora.liquidarPrestaciones(salario, diasTrabajados); 
	  Aseguradora.liquidarSegSocial(salario, diasTrabajados);
	  }
	 
	public static double liquidarPrestaciones (int salario, int diasTrabajados) {
		double auxTransporte = 106454;
		double devengado = minimo *2; //devegando es el salario minimo x 2
		double primaServicios;
		
		if (salario <= devengado ) {
			primaServicios = ((salario + auxTransporte)* diasTrabajados)/360;
		}else {
			primaServicios = (salario*diasTrabajados/360);
		}
		double cesantias = primaServicios;
		double intereses = cesantias * (pension/100);
		double vacaciones = (salario*diasTrabajados/720);
		double prestaciones =primaServicios+cesantias+intereses+vacaciones;

		double pestacionesRedondeo = Math.round(prestaciones);
		System.out.println("prestaciones: " + pestacionesRedondeo);
		return pestacionesRedondeo;	
	}
	
	
	public static double liquidarSegSocial(int salario, int diasTrabajados) {
		double valorDia = salario/30;
		double baseSS = valorDia*diasTrabajados;
		
		double saludTotal = baseSS * (salud/100);
		double pensionTotal = baseSS * (pension/100);
		double riesgosTotal = baseSS * (riesgosLab/100);
		double segSocial = saludTotal+pensionTotal+riesgosTotal;
		
		System.out.println("Seguridad social: " + segSocial);
		return segSocial;
		
	}

}
