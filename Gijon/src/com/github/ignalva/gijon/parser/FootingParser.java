package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Footing;

public class FootingParser extends DirectorioParser<Footing> {

	public FootingParser() {
		super("http://datos.gijon.es/doc/informacion/circuitos-footing.json");
	}

	@Override
	public Footing newModel() {
		return new Footing();
	}

}
