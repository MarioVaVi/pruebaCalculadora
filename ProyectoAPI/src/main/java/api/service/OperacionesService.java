package api.service;

import java.io.Serializable;
/**
 * The Interface Operaciones.
 */
public interface OperacionesService extends Serializable {
	
	/**
	 * Sumador.
	 *
	 * @param elemento1 the elemento 1
	 * @param elemento2 the elemento 2
	 * @return the double
	 */
	public Double sumador (Double elemento1,Double elemento2);
	
	/**
	 * Restador.
	 *
	 * @param elemento1 the elemento 1
	 * @param elemento2 the elemento 2
	 * @return the double
	 */
	public Double restador (Double elemento1,Double elemento2);

}
