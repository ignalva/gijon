package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.BarCafe;

public class BarCafeParser extends DirectorioParser<BarCafe> {

	public BarCafeParser() {
		super("http://datos.gijon.es/doc/informacion/bares-cafes.json");
	}

	@Override
	public BarCafe newModel() {
		return new BarCafe();
	}


}
