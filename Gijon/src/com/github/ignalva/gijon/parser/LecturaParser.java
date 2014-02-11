package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Lectura;

public class LecturaParser extends DirectorioParser<Lectura> {

	public LecturaParser() {
		super("http://datos.gijon.es/doc/cultura-ocio/centro-lectura.json");
	}

	@Override
	public Lectura newModel() {
		return new Lectura();
	}

}
