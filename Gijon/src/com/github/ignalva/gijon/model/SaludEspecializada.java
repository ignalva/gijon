package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class SaludEspecializada extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.saludespecial_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.saludespecial_icon;
	}

	@Override
	public int getString() {
		return R.string.SaludEspecializada;
	}

}
