package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.GaleriaArte;

public class GaleriaArteParser extends DirectorioParser<GaleriaArte> {

	public GaleriaArteParser() {
		super("http://datos.gijon.es/doc/cultura-ocio/galerias-arte.json");
	}

	@Override
	public GaleriaArte newModel() {
		return new GaleriaArte();
	}

}
