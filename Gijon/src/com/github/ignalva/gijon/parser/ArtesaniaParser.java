package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Artesania;

public class ArtesaniaParser extends DirectorioParser<Artesania> {

	public ArtesaniaParser() {
		super("http://datos.gijon.es/doc/turismo/artesania.json");
	}

	@Override
	public Artesania newModel() {
		return new Artesania();
	}

}
