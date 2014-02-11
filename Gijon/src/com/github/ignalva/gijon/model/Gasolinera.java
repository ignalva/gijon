package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Gasolinera extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.gasstation_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.gasstation_icon;
	}

	@Override
	public int getString() {
		return R.string.Gasolineras;
	}

}
