package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Taxis;


public class TaxisParser extends DirectorioParser<Taxis> {

	public TaxisParser() {
		super("http://datos.gijon.es/doc/transporte/taxis.json");
	}

	@Override
	public Taxis newModel() {
		return new Taxis();
	}

}
