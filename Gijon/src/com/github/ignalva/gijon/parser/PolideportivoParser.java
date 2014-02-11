package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Polideportivo;

public class PolideportivoParser extends DirectorioParser<Polideportivo> {

	public PolideportivoParser() {
		super("http://datos.gijon.es/doc/deporte/complejos-deportivos.json");
	}

	@Override
	public Polideportivo newModel() {
		return new Polideportivo();
	}

}
