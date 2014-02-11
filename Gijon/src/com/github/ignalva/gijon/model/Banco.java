package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Banco extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.bank_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.bank_icon;
	}
	
	@Override
	public int getString() {
		return R.string.Bancos;
	}
}
