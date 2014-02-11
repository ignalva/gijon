package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class GijonBici extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.bike_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.bike_icon;
	}

	@Override
	public int getString() {
		return R.string.GijonBici;
	}

}
