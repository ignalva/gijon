package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.SaludPrimaria;

public class SaludPrimariaParser extends DirectorioParser<SaludPrimaria> {

	public SaludPrimariaParser() {
		super("http://datos.gijon.es/doc/salud/centros-salud-primaria.json");
	}

	@Override
	public SaludPrimaria newModel() {
		return new SaludPrimaria();
	}

}
