package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.PuntoLimpio;

public class PuntoLimpioParser extends DirectorioParser<PuntoLimpio> {

	public PuntoLimpioParser() {
		super("http://datos.gijon.es/doc/medio-ambiente/puntoslimpios.json");
	}

	@Override
	public PuntoLimpio newModel() {
		return new PuntoLimpio();
	}

}
