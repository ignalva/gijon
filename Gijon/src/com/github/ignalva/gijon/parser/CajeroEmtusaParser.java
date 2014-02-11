package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.CajeroEmtusa;

public class CajeroEmtusaParser extends DirectorioParser<CajeroEmtusa> {

	public CajeroEmtusaParser() {
		super("http://datos.gijon.es/doc/transporte/cajeros-emtusa.json");
	}

	@Override
	public CajeroEmtusa newModel() {
		return new CajeroEmtusa();
	}

}
