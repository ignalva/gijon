package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Wifi;

public class WifiParser extends DirectorioParser<Wifi> {

	public WifiParser() {
		super("http://datos.gijon.es/doc/ciencia-tecnologia/zona-wifi.json");
	}

	@Override
	public Wifi newModel() {
		return new Wifi();
	}

}
