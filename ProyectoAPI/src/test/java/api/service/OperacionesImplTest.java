package api.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import api.ApiConfig;

@SpringBootTest(classes = ApiConfig.class)
@ExtendWith(SpringExtension.class)
class OperacionesImplTest {

	// Variables
	protected static final Double ZERO = 0.0;
	protected static final Double ELEMENTO1 = 2.0;
	protected static final Double ELEMENTO2 = 1.0;
	protected static Double RESULTADO_SUMA = 0.0;
	protected static Double RESULTADO_RESTA = 0.0;
	protected static Double RESULTADO_DIVISION = 0.0;
	protected static Double RESULTADO_MULTPLICACION = 0.0;

	@InjectMocks
	private OperacionesServiceImpl operacionesServiceImpl;

	@BeforeEach
	public void onInit() {
		RESULTADO_SUMA = ELEMENTO1 + ELEMENTO2;
		RESULTADO_RESTA = ELEMENTO1 - ELEMENTO2;
		RESULTADO_DIVISION = ELEMENTO1 / ELEMENTO2;
		RESULTADO_MULTPLICACION = ELEMENTO1 * ELEMENTO2;
	}

	@Test
	public void test_sumador() {
		assertTrue(operacionesServiceImpl.sumador(ELEMENTO1, ELEMENTO2).equals(RESULTADO_SUMA));
	}

	@Test
	public void test_restador() {
		assertTrue(operacionesServiceImpl.restador(ELEMENTO1, ELEMENTO2).equals(RESULTADO_RESTA));
	}

	@Test
	public void test_multiplicador() {
		assertTrue(operacionesServiceImpl.mutiplicador(ELEMENTO1, ELEMENTO2).equals(RESULTADO_MULTPLICACION));
	}

	@Test
	public void test_divisor() {
		assertTrue(operacionesServiceImpl.divisor(ELEMENTO1, ELEMENTO2).equals(RESULTADO_DIVISION));
	}

	@Test
	public void test_divisor_por_cero_exception() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			operacionesServiceImpl.divisor(ELEMENTO1, ZERO);
		});
	}

}
