package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.SaludMental;

public class SaludMentalParser extends DirectorioParser<SaludMental> {

	public SaludMentalParser() {
		super("http://datos.gijon.es/doc/salud/centros-salud-mental.json");
	}

	@Override
	public SaludMental newModel() {
		return new SaludMental();
	}

}
