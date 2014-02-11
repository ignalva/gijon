package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Farmacia;

public class FarmaciaParser extends DirectorioParser<Farmacia> {

	public FarmaciaParser() {
		super("http://datos.gijon.es/doc/salud/farmacias.json");
	}

	@Override
	public Farmacia newModel() {
		return new Farmacia();
	}

}
