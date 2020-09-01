package dev.dao;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.entite.Plat;

class PlatDaoMemoireTest {
	private PlatDaoMemoire platDaoMemoire;

	@BeforeEach
	void setUp() {
		this.platDaoMemoire = new PlatDaoMemoire();
	}

	@Test
	void listerPlatsVideALInitialisation() {
		assertEquals(new ArrayList<Plat>(), this.platDaoMemoire.listerPlats());
	}

	@Test
	void ajouterPlatCasPassants() {
		assertEquals(new ArrayList<Plat>(), this.platDaoMemoire.listerPlats());
		this.platDaoMemoire.ajouterPlat("sushis", 123456);
		ArrayList<Plat> list = new ArrayList<>();
		list.add(new Plat("sushis",123456));
		assertEquals(list, this.platDaoMemoire.listerPlats());
	}
}
