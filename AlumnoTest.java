package unit9_b;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlumnoTest {
	public Alumno al;

	public AlumnoTest(){
		al = new Alumno();
	}
	
	@Test
	public final void testValidaNif() {
		assertEquals(true, al.validaNif("04084432T"));
		assertEquals(false, al.validaNif("x4084432T"));
		assertEquals(false, al.validaNif("12345678A"));
		assertEquals(true, al.validaNif("15031437V"));
		assertEquals(true, al.validaNif("62831897Z"));
		assertEquals(false, al.validaNif("V5031437V"));
		assertEquals(false, al.validaNif("00000000"));
		assertEquals(false, al.validaNif("HHHHHHHHH"));
		assertEquals(false, al.validaNif("1234G"));
		assertEquals(false, al.validaNif(""));
	}

	@Test
	public final void testCalculaTasaMatricula() {
		
		
		
		
	}

}
