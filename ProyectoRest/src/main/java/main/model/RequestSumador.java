package main.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class RequestSumador.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestSumador")
public class RequestSumador {

	/** The elemento 1. */
	private double elemento1;

	/** The elemento 2. */
	private double elemento2;

	public double getElemento1() {
		return elemento1;
	}

	public void setElemento1(double elemento1) {
		this.elemento1 = elemento1;
	}

	public double getElemento2() {
		return elemento2;
	}

	public void setElemento2(double elemento2) {
		this.elemento2 = elemento2;
	}
}
