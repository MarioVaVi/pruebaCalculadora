package main.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class ResponseRestador.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseRestador")
public class ResponseRestador {

	    /** The solucion. */
    	private Double solucion;

		/**
		 * Gets the solucion.
		 *
		 * @return the solucion
		 */
		public Double getSolucion() {
			return solucion;
		}

		/**
		 * Sets the solucion.
		 *
		 * @param solucion the new solucion
		 */
		public void setSolucion(Double solucion) {
			this.solucion = solucion;
		}
}
