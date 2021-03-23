package rs.ac.bg.fon.nprog.biblioteka;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import rs.ac.bg.fon.nprog.biblioteka.interfejs.BibliotekaInterfaceTest;
import rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.Biblioteka;

class BibliotekaTest extends BibliotekaInterfaceTest {

	@BeforeEach
	void setUp() throws Exception {
		biblioteka = new Biblioteka();
	}

	@AfterEach
	void tearDown() throws Exception {
		biblioteka = null;
	}

}
