package com.wiorektrepka.repository;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity(name = "workDay")
public class WorkDay extends PanacheEntity {
	public String calodobowa;
	public String dzienTygodnia;
	public String otwartaDo;
	public String otwartaOd;

	public String getCalodobowa() {
		return calodobowa;
	}

	public void setCalodobowa(String calodobowa) {
		this.calodobowa = calodobowa;
	}

	public String getDzienTygodnia() {
		return dzienTygodnia;
	}

	public void setDzienTygodnia(String dzienTygodnia) {
		this.dzienTygodnia = dzienTygodnia;
	}

	public String getOtwartaDo() {
		return otwartaDo;
	}

	public void setOtwartaDo(String otwartaDo) {
		this.otwartaDo = otwartaDo;
	}

	public String getOtwartaOd() {
		return otwartaOd;
	}

	public void setOtwartaOd(String otwartaOd) {
		this.otwartaOd = otwartaOd;
	}
}
