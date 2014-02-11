package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Formacion extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.centroformacion_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.centroformacion_icon;
	}

	@Override
	public int getString() {
		return R.string.Formacion;
	}

}
