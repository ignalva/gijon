package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class InfoTurista extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.info_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.info_icon;
	}

	@Override
	public int getString() {
		return R.string.InfoTurista;
	}

}
