package com.wiorektrepka.repository;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;
import java.util.stream.Collectors;


@Entity(name = "pharmacy")
public class Pharmacy extends PanacheEntity {
	public String adresWWWApteki;
	public String adresWWWSprzedazyWysylkowej;
	public String aptekaCzasowoNieczynna;
	public String dataUruchomieniaApteki;
	public String emailApteki;
	public String nazwa;
	public String numerTelefonu;
	public String rodzaj;
	public String status;

	@OneToOne(cascade = CascadeType.ALL)
	public Address address;
	@OneToMany(cascade = CascadeType.ALL)
	public List<WorkDay> workDays;

	public static List<Pharmacy> findByWojewodztwo(String woj){
		return list("address.wojewodztwo", woj);
	}
	public static List<Pharmacy> findByMiejscowosc(String miejscowosc){
		return list("address.miejscowosc", miejscowosc);
	}

	public static List<Pharmacy> findByPowiat(String powiat) {
		return list("address.powiat", powiat);
	}

	public String getAdresWWWApteki() {
		return adresWWWApteki;
	}

	public void setAdresWWWApteki(String adresWWWApteki) {
		this.adresWWWApteki = adresWWWApteki;
	}

	public String getAdresWWWSprzedazyWysylkowej() {
		return adresWWWSprzedazyWysylkowej;
	}

	public void setAdresWWWSprzedazyWysylkowej(String adresWWWSprzedazyWysylkowej) {
		this.adresWWWSprzedazyWysylkowej = adresWWWSprzedazyWysylkowej;
	}

	public String getAptekaCzasowoNieczynna() {
		return aptekaCzasowoNieczynna;
	}

	public void setAptekaCzasowoNieczynna(String aptekaCzasowoNieczynna) {
		this.aptekaCzasowoNieczynna = aptekaCzasowoNieczynna;
	}

	public String getDataUruchomieniaApteki() {
		return dataUruchomieniaApteki;
	}

	public void setDataUruchomieniaApteki(String dataUruchomieniaApteki) {
		this.dataUruchomieniaApteki = dataUruchomieniaApteki;
	}

	public String getEmailApteki() {
		return emailApteki;
	}

	public void setEmailApteki(String emailApteki) {
		this.emailApteki = emailApteki;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getNumerTelefonu() {
		return numerTelefonu;
	}

	public void setNumerTelefonu(String numerTelefonu) {
		this.numerTelefonu = numerTelefonu;
	}

	public String getRodzaj() {
		return rodzaj;
	}

	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<WorkDay> getWorkDays() {
		return workDays;
	}

	public void setWorkDays(List<WorkDay> workDays) {
		this.workDays = workDays;
	}
}
