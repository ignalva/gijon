package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Administracion extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.administracion_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.administracion_icon;
	}

	@Override
	public int getString() {
		return R.string.Administracion;
	}

}
