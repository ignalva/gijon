package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class AparcamientoMotos extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.motorbike_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.motorbike_icon;
	}

	@Override
	public int getString() {
		return R.string.AparcamientoMotos;
	}
}
