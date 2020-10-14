package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Toma el nombre de la clase comercialExp
public class ComercialExp implements Empleados {
	
	@Autowired // Busca una clase que implemente CreacionInformeFinanciero y devuelve algo, algo que luego será inyectado en nuevoInforme
	public ComercialExp(CreacionInformeFinanciero nuevoInforme) { 
		this.nuevoInforme = nuevoInforme; // this.nuevoInforme toma lo devuelto al final
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
//		return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero(); // Referenciando al actualizado nuevoInforme, llama al método getInformeFinanciero
	}
	
	private CreacionInformeFinanciero nuevoInforme; // Recibe toda la info
}


/*
	@Autowired 
Esta anotación permite utilizar la dependencia, empleando un scanner configurado desde el xml.
Es aplicable con un constructor, un setter, un método cualquiera e incluso con un campo de clase.
Desde la version 4.3 de Spring, podemos prescindir de ella cuando soólo tenemos un constructor.
*/