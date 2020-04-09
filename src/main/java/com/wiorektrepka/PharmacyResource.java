package com.wiorektrepka;

import com.wiorektrepka.repository.Address;
import com.wiorektrepka.repository.Pharmacy;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/pharmacy")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PharmacyResource {

	@GET
	@Path("/wojewodztwo/{wojewodztwo}")
	public List<Pharmacy> getPharmacyByWojewodztwo(@PathParam(value = "wojewodztwo") String wojewodztwo) {
		return Pharmacy.findByWojewodztwo(wojewodztwo);
	}

	@GET
	@Path("/miejscowosc/{miejscowosc}")
	public List<Pharmacy> getPharmacyByMiejscowosc(@PathParam(value = "miejscowosc") String miejscowosc) {
		return Pharmacy.findByMiejscowosc(miejscowosc);
	}

	@GET
	@Path("/id/{id}")
	public Pharmacy getPharmacyById(@PathParam(value = "id") Long id) {
		return Pharmacy.findById(id);
	}

	@GET
	@Path("/powiat/{powiat}")
	public List<Pharmacy> getPharmacyByPowiat(@PathParam(value = "powiat") String powiat) {
		return Pharmacy.findByPowiat(powiat);
	}

}
