package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Universidad extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.university_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.university_icon;
	}

	@Override
	public int getString() {
		return R.string.Universidad;
	}

}
