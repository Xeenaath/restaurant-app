package dev.service;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.dao.IPlatDao;
import dev.dao.PlatDaoMemoire;

 
class PlatServiceVersion1Test {
	private IPlatDao mockedPlatDao;
	private PlatServiceVersion1 platServiceVersion1;
	@BeforeEach
	void setup() {
		mockedPlatDao = mock(IPlatDao.class);
		this.platServiceVersion1 = new PlatServiceVersion1(mockedPlatDao);
	}
	
	@Test
	void shouldThrowExceptionWhenNameIsInvalid() {
		assertThrows(Exception.class, () -> {
			platServiceVersion1.ajouterPlat("az", 600);
		});
	}
	
	@Test
	void shouldThrowExceptionWhenNumberIsInvalid() {
		assertThrows(Exception.class, () -> {
			platServiceVersion1.ajouterPlat("azer", 12);
		});
	}
	
	@Test
	void verifyThatAjouterPlatIsCalled() {
		platServiceVersion1.ajouterPlat("couscous", 600);

		verify(mockedPlatDao).ajouterPlat("couscous", 600);

	}

}
