package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Trafico;

public class TraficoParser extends DirectorioParser<Trafico> {

	public TraficoParser() {
		super("http://datos.gijon.es/doc/transporte/trafico.json");
	}

	@Override
	public Trafico newModel() {
		return new Trafico();
	}

}
