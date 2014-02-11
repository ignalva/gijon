package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Mirador;

public class MiradorParser extends DirectorioParser<Mirador> {

	public MiradorParser() {
		super("http://datos.gijon.es/doc/medio-ambiente/miradores.json");
	}

	@Override
	public Mirador newModel() {
		return new Mirador();
	}

}
