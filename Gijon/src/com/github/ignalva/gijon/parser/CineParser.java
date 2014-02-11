package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Cine;

public class CineParser extends DirectorioParser<Cine> {

	public CineParser() {
		super("http://datos.gijon.es/doc/cultura-ocio/cines.json");
	}

	@Override
	public Cine newModel() {
		return new Cine();
	}

}
