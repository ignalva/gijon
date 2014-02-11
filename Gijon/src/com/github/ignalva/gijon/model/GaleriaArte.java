package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class GaleriaArte extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.galeriaarte_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.galeriaarte_icon;
	}

	@Override
	public int getString() {
		return R.string.GaleriaArte;
	}

}
