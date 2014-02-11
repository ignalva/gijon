package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Asociacion extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.asociacion_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.asociacion_icon;
	}

	@Override
	public int getString() {
		return R.string.Asociacion;
	}

}
