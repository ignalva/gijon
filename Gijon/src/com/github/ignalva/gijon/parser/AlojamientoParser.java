package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Alojamiento;

public class AlojamientoParser extends DirectorioParser<Alojamiento> {

	public AlojamientoParser() {
		super("http://datos.gijon.es/doc/turismo/alojamientos.json");
	}

	@Override
	public Alojamiento newModel() {
		return new Alojamiento();
	}

}
