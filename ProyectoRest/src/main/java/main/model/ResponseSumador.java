package main.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class ResponseSumador.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "responseSumador")
public class ResponseSumador implements Serializable {
	 
	private static final long serialVersionUID = 8888L;

	    /** The solucion. */
    	private Double solucion;

		public Double getSolucion() {
			return solucion;
		}

		public void setSolucion(Double solucion) {
			this.solucion = solucion;
		}
}
