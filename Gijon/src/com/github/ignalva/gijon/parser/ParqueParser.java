package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Parque;

public class ParqueParser extends DirectorioParser<Parque> {

	public ParqueParser() {
		super("http://datos.gijon.es/doc/turismo/parques-jardines.json");
	}

	@Override
	public Parque newModel() {
		return new Parque();
	}

}
