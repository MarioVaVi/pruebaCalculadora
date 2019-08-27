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
	private Double elemento1;

	/** The elemento 2. */
	private Double elemento2;

	/**
	 * Gets the elemento 1.
	 *
	 * @return the elemento 1
	 */
	public Double getElemento1() {
		return elemento1;
	}

	/**
	 * Sets the elemento 1.
	 *
	 * @param elemento1 the new elemento 1
	 */
	public void setElemento1(Double elemento1) {
		this.elemento1 = elemento1;
	}

	/**
	 * Gets the elemento 2.
	 *
	 * @return the elemento 2
	 */
	public Double getElemento2() {
		return elemento2;
	}

	/**
	 * Sets the elemento 2.
	 *
	 * @param elemento2 the new elemento 2
	 */
	public void setElemento2(Double elemento2) {
		this.elemento2 = elemento2;
	}

}
