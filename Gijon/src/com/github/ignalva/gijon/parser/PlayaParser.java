package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Playa;

public class PlayaParser extends DirectorioParser<Playa> {

	public PlayaParser() {
		super("http://datos.gijon.es/doc/turismo/playas.json");
	}

	@Override
	public Playa newModel() {
		return new Playa();
	}

}
