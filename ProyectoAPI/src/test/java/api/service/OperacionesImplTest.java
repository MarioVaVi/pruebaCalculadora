package api.service;

import static org.junit.Assert.assertTrue;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import api.ApiConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApiConfig.class)
public class OperacionesImplTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@InjectMocks
	protected OperacionesServiceImpl operacionesServiceImpl;

	// Variables
	protected static final Double ZERO = 0.0;
	protected static final Double ELEMENTO1 = 2.0;
	protected static final Double ELEMENTO2 = 1.0;
	protected static Double RESULTADO_SUMA = 0.0;
	protected static Double RESULTADO_RESTA = 0.0;
	protected static Double RESULTADO_DIVISION = 0.0;
	protected static Double RESULTADO_MULTPLICACION = 0.0;

	@Before
	public void init() {
		// Aqui se rellenan las variables necesarias para realizar los test
		// y se crean los mocks en caso de ser necesario (No es el caso)

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
		thrown.expect(IllegalArgumentException.class);
		operacionesServiceImpl.divisor(ELEMENTO1, ZERO);
		Assertions.assertThat(IllegalArgumentException.class);
	}
}
