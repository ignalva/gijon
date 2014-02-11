package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Webcam;

public class WebcamParser extends DirectorioParser<Webcam> {

	public WebcamParser() {
		super("http://datos.gijon.es/doc/informacion/webcams.json");
	}

	@Override
	public Webcam newModel() {
		return new Webcam();
	}

}
