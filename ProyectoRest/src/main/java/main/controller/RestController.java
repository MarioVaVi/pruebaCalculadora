package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.corp.calculator.TracerImpl;
import main.component.Operaciones;
import main.model.RequestRestador;
import main.model.RequestSumador;
import main.model.ResponseRestador;
import main.model.ResponseSumador;

/**
 * The Class RestController.
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

	/**  Operaciones. */
	@Autowired
	private Operaciones operaciones;

	/**
	 * Sumador.
	 *
	 * @param datosPeticion the datos peticion
	 * @return the response entity
	 */
	@PostMapping(value = "/sumador", produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<ResponseSumador> sumador(@RequestBody RequestSumador datosPeticion) {
		ResponseSumador respuesta = new ResponseSumador();
		Double solucion = operaciones.sumador(datosPeticion.getElemento1(), datosPeticion.getElemento2());
		respuesta.setSolucion(solucion);
		new TracerImpl().trace(solucion);
		return new ResponseEntity<>(respuesta, HttpStatus.OK);
	}

	/**
	 * Restador.
	 *
	 * @param datosPeticion the datos peticion
	 * @return the response entity
	 */
	@PostMapping(value = "/restador", produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<ResponseRestador> restador(@RequestBody RequestRestador datosPeticion) {
		ResponseRestador respuesta = new ResponseRestador();
		Double solucion = operaciones.restador(datosPeticion.getElemento1(), datosPeticion.getElemento2());
		new TracerImpl().trace(solucion);
		respuesta.setSolucion(solucion);
		return new ResponseEntity<>(respuesta, HttpStatus.OK);
	}
}
