package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Futbol extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.stadium_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.stadium_icon;
	}

	@Override
	public int getString() {
		return R.string.Futbol;
	}

}
