package main.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class ResponseRestador.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "responseRestador")
public class ResponseRestador {

	/** The solucion. */
	private Double solucion;

	public Double getSolucion() {
		return solucion;
	}

	public void setSolucion(Double solucion) {
		this.solucion = solucion;
	}
}
