package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Juzgados;

public class JuzgadosParser extends DirectorioParser<Juzgados> {

	public JuzgadosParser() {
		super("http://datos.gijon.es/doc/informacion/tribunales-juzgados.json");
	}

	@Override
	public Juzgados newModel() {
		return new Juzgados();
	}

}
