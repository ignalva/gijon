package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.TiendaGastro;

public class TiendaGastroParser extends DirectorioParser<TiendaGastro> {

	public TiendaGastroParser() {
		super("http://datos.gijon.es/doc/turismo/tiendas-gastronomicas.json");
	}

	@Override
	public TiendaGastro newModel() {
		return new TiendaGastro();
	}

}
