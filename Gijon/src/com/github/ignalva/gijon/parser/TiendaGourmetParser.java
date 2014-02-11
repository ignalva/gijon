package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.TiendaGourmet;

public class TiendaGourmetParser extends DirectorioParser<TiendaGourmet> {

	public TiendaGourmetParser() {
		super("http://datos.gijon.es/doc/informacion/tiendas-gourmet.json");
	}

	@Override
	public TiendaGourmet newModel() {
		return new TiendaGourmet();
	}

}
