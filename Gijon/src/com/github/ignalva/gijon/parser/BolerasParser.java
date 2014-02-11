package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Boleras;

public class BolerasParser extends DirectorioParser<Boleras> {

	public BolerasParser() {
		super("http://datos.gijon.es/doc/deporte/boleras.json");
	}

	@Override
	public Boleras newModel() {
		return new Boleras();
	}

}
