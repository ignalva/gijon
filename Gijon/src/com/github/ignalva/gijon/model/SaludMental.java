package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class SaludMental extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.saludmental_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.saludmental_icon;
	}

	@Override
	public int getString() {
		return R.string.SaludMental;
	}

}
