package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Parque extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.parque_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.parque_icon;
	}

	@Override
	public int getString() {
		return R.string.Parque;
	}

}
