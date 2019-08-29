package api.service;

import org.springframework.stereotype.Service;

/**
 * The Class OperacionesImpl.
 */
@Service
public class OperacionesServiceImpl implements OperacionesService {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see main.component.Operaciones#sumador(java.lang.Double, java.lang.Double)
	 */
	@Override
	public Double sumador(Double elemento1, Double elemento2) {
		return elemento1 + elemento2;
	}

	/* (non-Javadoc)
	 * @see main.component.Operaciones#restador(java.lang.Double, java.lang.Double)
	 */
	@Override
	public Double restador(Double elemento1, Double elemento2) {
		return elemento1 - elemento2;
	}

	/**
	 * Mutiplicador.
	 *
	 * @param elemento1 the elemento 1
	 * @param elemento2 the elemento 2
	 * @return the double
	 */
	public Double mutiplicador(Double elemento1, Double elemento2) {
		return elemento1 * elemento2;
	}

	/**
	 * Divisor.
	 *
	 * @param elemento1 the elemento 1
	 * @param elemento2 the elemento 2
	 * @return the double
	 */
	public Double divisor(Double elemento1, Double elemento2) {
		if (elemento2 != 0) {
			return elemento1 / elemento2;
		} else {
			throw new IllegalArgumentException("No se puede dividir por 0");
		}
	}

}
