package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Hotel extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.hotel_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.hotel_icon;
	}

	@Override
	public int getString() {
		return R.string.Hoteles;
	}

}
