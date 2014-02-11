package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Administracion;

public class AdministracionParser extends DirectorioParser<Administracion> {

	public AdministracionParser() {
		super("http://datos.gijon.es/doc/informacion/administracion.json");
	}

	@Override
	public Administracion newModel() {
		return new Administracion();
	}

}
