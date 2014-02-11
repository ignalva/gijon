package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.ServiciosSociales;

public class ServiciosSocialesParser extends DirectorioParser<ServiciosSociales> {

	public ServiciosSocialesParser() {
		super("http://datos.gijon.es/doc/sociedad-bienestar/servicios-sociales.json");
	}

	@Override
	public ServiciosSociales newModel() {
		return new ServiciosSociales();
	}

}
