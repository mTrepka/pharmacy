package com.wiorektrepka.repository;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.List;

@Entity(name = "address")
public class Address extends PanacheEntity {
	public String gmina;
	public String kodPocztowy;
	public String miejscowosc;
	public String nazwaUlicy;
	public String numerDomu;
	public String numerLokalu;
	public String poczta;
	public String powiat;
	public String wojewodztwo;

	public static List<Address> findByWojewodztwo(String wojewodztwo) {
		return list("wojewodztwo", wojewodztwo);
	}


	public String getGmina() {
		return gmina;
	}

	public void setGmina(String gmina) {
		this.gmina = gmina;
	}

	public String getKodPocztowy() {
		return kodPocztowy;
	}

	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public String getNazwaUlicy() {
		return nazwaUlicy;
	}

	public void setNazwaUlicy(String nazwaUlicy) {
		this.nazwaUlicy = nazwaUlicy;
	}

	public String getNumerDomu() {
		return numerDomu;
	}

	public void setNumerDomu(String numerDomu) {
		this.numerDomu = numerDomu;
	}

	public String getNumerLokalu() {
		return numerLokalu;
	}

	public void setNumerLokalu(String numerLokalu) {
		this.numerLokalu = numerLokalu;
	}

	public String getPoczta() {
		return poczta;
	}

	public void setPoczta(String poczta) {
		this.poczta = poczta;
	}

	public String getPowiat() {
		return powiat;
	}

	public void setPowiat(String powiat) {
		this.powiat = powiat;
	}

	public String getWojewodztwo() {
		return wojewodztwo;
	}

	public void setWojewodztwo(String wojewodztwo) {
		this.wojewodztwo = wojewodztwo;
	}
}
