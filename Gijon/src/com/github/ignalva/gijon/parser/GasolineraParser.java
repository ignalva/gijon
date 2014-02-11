package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Gasolinera;

public class GasolineraParser extends DirectorioParser<Gasolinera> {

	public GasolineraParser() {
		super("http://datos.gijon.es/doc/transporte/gasolineras.json");
	}

	@Override
	public Gasolinera newModel() {
		return new Gasolinera();
	}

}
