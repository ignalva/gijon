package com.github.ignalva.gijon.parser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import com.github.ignalva.gijon.model.Directorio;

public abstract class DirectorioParser<T extends Directorio> extends Parser<T> {

	private List<T> list;
	
	public DirectorioParser(String urlString) {
		super(urlString);
		list = new ArrayList<T>();
	}

	@Override
	public List<T> parse() throws Exception {

		JSONArray jsonArray= new JSONObject(readUrl()).getJSONObject("directorios").getJSONArray("directorio");
		
		for (int i=0; i < jsonArray.length(); i++){
			T directorio = newModel();
			
			try {
				String dato = jsonArray.getJSONObject(i).getString("correo-electronico");
				if (dato!=null && dato.length()>0) directorio.setEmail(dato);
			} catch (JSONException e) {
				Log.w(getClass()+" parse correo-electronico", e.getMessage(), e);
			}

			try {
				String dato = jsonArray.getJSONObject(i).getString("horario");
				if (dato!=null && dato.length()>0) directorio.setHorario(dato);
			} catch (JSONException e) {
				Log.w(getClass()+" parse horario", e.getMessage(), e);
			}

			try {
				directorio.setTitle(jsonArray.getJSONObject(i).getJSONObject("nombre").getString("content"));
			} catch (JSONException e) {
				Log.e(getClass()+" parse nombre", e.getMessage(), e);
				continue;
			}
					
			try{
				String dato = jsonArray.getJSONObject(i).getJSONObject("telefono").getString("content)");
				if (dato!=null && dato.length()>0) directorio.setTelefono(dato);
			}
			catch (JSONException e) {
				Log.w(getClass()+" parse telefono", e.getMessage(), e);
			}

			try{
				String dato = jsonArray.getJSONObject(i).getString("url");
				if (dato!=null && dato.length()>0) directorio.setUrl(dato);
			}
			catch (JSONException e) {
				Log.w(getClass()+" parse url", e.getMessage(), e);
			}
			
			try {
				String dato = jsonArray.getJSONObject(i).getString("web");
				if (dato!=null && dato.length()>0) directorio.setWeb(dato);
			} catch (JSONException e) {
				Log.w(getClass()+" parse web", e.getMessage(), e);
			}
			
			try {
				JSONObject localizacion = jsonArray.getJSONObject(i).getJSONObject("localizacion");
				if (localizacion.has("content")){
					String[] latlong = localizacion.getString("content").split(" ");
					directorio.setLatitud(Double.parseDouble(latlong[0]));
					directorio.setLongitud(Double.parseDouble(latlong[1]));
				}
			} catch (JSONException e) {
				Log.e(getClass().toString(), e.getMessage(), e);
				continue;
			}
			
			list.add(directorio);
		}
		return list;
	}

	@Override
	public int count(){
		return list.size();
	}
	
}
