package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Futbol;

public class FutbolParser extends DirectorioParser<Futbol> {

	public FutbolParser() {
		super("http://datos.gijon.es/doc/deporte/campos-futbol.json");
	}

	@Override
	public Futbol newModel() {
		return new Futbol();
	}

}
