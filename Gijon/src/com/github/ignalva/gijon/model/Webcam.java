package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Webcam extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.webcam_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.webcam_icon;
	}

	@Override
	public int getString() {
		return R.string.Webcam;
	}

}
