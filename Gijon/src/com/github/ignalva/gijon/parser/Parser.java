package com.github.ignalva.gijon.parser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import com.github.ignalva.gijon.model.Model;

public abstract class Parser<T extends Model> {

	protected String urlString;

	public Parser(String urlString){
		this.urlString=urlString;
	}
	
	protected String readUrl() throws Exception {
	    BufferedReader reader = null;
	    try {
	        URL url = new URL(urlString);
	        reader = new BufferedReader(new InputStreamReader(url.openStream()));
	        StringBuffer buffer = new StringBuffer();
	        int read;
	        char[] chars = new char[1024];
	        while ((read = reader.read(chars)) != -1)
	            buffer.append(chars, 0, read); 

	        return buffer.toString();
	    } finally {
	        if (reader != null)
	            reader.close();
	    }
	}
	
	public abstract List<T> parse() throws Exception;
	public abstract T newModel();
	public abstract int count();
}
