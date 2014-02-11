package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class SaludPrimaria extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.saludprimaria_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.saludprimaria_icon;
	}

	@Override
	public int getString() {
		return R.string.SaludPrimaria;
	}

}
