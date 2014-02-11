package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Pub;

public class PubParser extends DirectorioParser<Pub> {

	public PubParser() {
		super("http://datos.gijon.es/doc/informacion/pubs.json");
	}

	@Override
	public Pub newModel() {
		return new Pub();
	}

}
