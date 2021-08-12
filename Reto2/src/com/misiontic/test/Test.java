package com.misiontic.test;

import com.misiontic.aseguradora.Aseguradora;

public class Test {
	  public static void main(String[] args) {
	  int salario = 1810050; 
	  int diasTrabajados = 152; 
	  Aseguradora.liquidarPrestaciones(salario, diasTrabajados); 
	  Aseguradora.liquidarSegSocial(salario, diasTrabajados);
	  }
}
