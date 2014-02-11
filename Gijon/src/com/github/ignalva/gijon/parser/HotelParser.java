package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Hotel;

public class HotelParser extends DirectorioParser<Hotel> {

	public HotelParser() {
		super("http://datos.gijon.es/doc/turismo/hoteles.json");
	}

	@Override
	public Hotel newModel() {
		return new Hotel();
	}


}
