package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Piscina;

public class PiscinaParser extends DirectorioParser<Piscina> {

	public PiscinaParser() {
		super("http://datos.gijon.es/doc/deporte/piscinas.json");
	}

	@Override
	public Piscina newModel() {
		return new Piscina();
	}

}
