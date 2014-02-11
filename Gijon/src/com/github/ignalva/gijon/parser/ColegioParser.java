package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Colegio;

public class ColegioParser extends DirectorioParser<Colegio> {

	public ColegioParser() {
		super("http://datos.gijon.es/doc/educacion/colegios.json");
	}

	@Override
	public Colegio newModel() {
		return new Colegio();
	}

}
