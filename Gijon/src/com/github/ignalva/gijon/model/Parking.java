package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Parking extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.parking_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.parking_icon;
	}

	@Override
	public int getString() {
		return R.string.Parking;
	}

}
