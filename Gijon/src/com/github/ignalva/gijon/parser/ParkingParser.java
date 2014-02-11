package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Parking;

public class ParkingParser extends DirectorioParser<Parking> {

	public ParkingParser() {
		super("http://datos.gijon.es/doc/transporte/aparcamientos.json");
	}

	@Override
	public Parking newModel() {
		return new Parking();
	}

}
