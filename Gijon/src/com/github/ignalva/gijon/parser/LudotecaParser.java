package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Ludoteca;

public class LudotecaParser extends DirectorioParser<Ludoteca> {

	public LudotecaParser() {
		super("http://datos.gijon.es/doc/informacion/ludotecas.json");
	}

	@Override
	public Ludoteca newModel() {
		return new Ludoteca();
	}


}
