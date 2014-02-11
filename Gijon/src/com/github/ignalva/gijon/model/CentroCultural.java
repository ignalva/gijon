package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class CentroCultural extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.centrocultural_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.centrocultural_icon;
	}

	@Override
	public int getString() {
		return R.string.CentroCultural;
	}

}
