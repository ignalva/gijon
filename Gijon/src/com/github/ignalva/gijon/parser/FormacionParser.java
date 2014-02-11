package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Formacion;

public class FormacionParser extends DirectorioParser<Formacion> {

	public FormacionParser() {
		super("http://datos.gijon.es/doc/educacion/centros-formacion.json");
	}

	@Override
	public Formacion newModel() {
		return new Formacion();
	}

}
