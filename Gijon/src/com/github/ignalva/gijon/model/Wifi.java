package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Wifi extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.wifi_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.wifi_icon;
	}

	@Override
	public int getString() {
		return R.string.Wifi;
	}

}
