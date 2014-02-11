package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class CentroSanitario extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.hospital_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.hospital_icon;
	}

	@Override
	public int getString() {
		return R.string.CentrosSanitarios;
	}

}
