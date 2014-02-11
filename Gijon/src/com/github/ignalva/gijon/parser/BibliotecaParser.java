package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Biblioteca;

public class BibliotecaParser extends DirectorioParser<Biblioteca> {

	public BibliotecaParser() {
		super("http://datos.gijon.es/doc/cultura-ocio/bibliotecas.json");
	}

	@Override
	public Biblioteca newModel() {
		return new Biblioteca();
	}


}
