package com.github.ignalva.gijon;

import java.util.ArrayList;
import java.util.HashMap;

import com.github.ignalva.gijon.R;
import com.github.ignalva.gijon.model.*;
import com.github.ignalva.gijon.parser.*;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Marker;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.ShareActionProvider;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {
	
	private GoogleMap map;
	
	public static HashMap<Marker,Model> ModelMarkers = new HashMap<Marker,Model>();
	
	private DrawerLayout drawerLayout;
	private ListView drawerList;
	private ArrayList<Layer> drawerItems;
	private GijonActionBarDrawerToggle drawerToggle;
	private ShareActionProvider shareActionProvider;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		try{
			setContentView(R.layout.activity_main);
			
			//Inicializamos menu Drawer Layout
			drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
			drawerList = (ListView) findViewById(R.id.left_drawer);
			drawerItems = new ArrayList<Layer>();
			    
			map = ((SupportMapFragment)  getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
			map.setMyLocationEnabled(true);			
			map.setInfoWindowAdapter(new DirectorioInfoWindowAdapter(getLayoutInflater().inflate(R.layout.directorio_info_contents, null)));
			
			drawerItems.add(new Layer<Banco>(map,new BancosParser()));
			drawerItems.add(new Layer<BarCafe>(map,new BarCafeParser()));
			drawerItems.add(new Layer<Biblioteca>(map,new BibliotecaParser()));
			drawerItems.add(new Layer<CajeroCiudadano>(map,new CajeroCiudadanoParser()));
			drawerItems.add(new Layer<AparcamientoMinusvalidos>(map,new AparcamientoMinusvalidosParser()));
			drawerItems.add(new Layer<AparcamientoMotos>(map,new AparcamientoMotosParser()));
			drawerItems.add(new Layer<CentroSanitario>(map,new CentroSanitarioParser()));
			drawerItems.add(new Layer<Gasolinera>(map,new GasolineraParser()));
			drawerItems.add(new Layer<Hotel>(map,new HotelParser()));
			drawerItems.add(new Layer<Ludoteca>(map,new LudotecaParser()));
			drawerItems.add(new Layer<Administracion>(map,new AdministracionParser()));
			drawerItems.add(new Layer<Albergue>(map,new AlbergueParser()));
			drawerItems.add(new Layer<Alojamiento>(map,new AlojamientoParser()));
			drawerItems.add(new Layer<AlquilerCoche>(map,new AlquilerCocheParser()));
			drawerItems.add(new Layer<Parking>(map,new ParkingParser()));
			drawerItems.add(new Layer<EdificioTuristico>(map,new EdificioTuristicoParser()));
			drawerItems.add(new Layer<AreaRecreativa>(map,new AreaRecreativaParser()));
			drawerItems.add(new Layer<Wifi>(map,new WifiParser()));
			drawerItems.add(new Layer<Universidad>(map,new UniversidadParser()));
			drawerItems.add(new Layer<VinosTapas>(map,new VinosTapasParser()));
			drawerItems.add(new Layer<Juzgados>(map,new JuzgadosParser()));
			drawerItems.add(new Layer<Taxis>(map,new TaxisParser()));
			drawerItems.add(new Layer<Artesania>(map,new ArtesaniaParser()));
			drawerItems.add(new Layer<AseoPublico>(map,new AseoPublicoParser()));
			drawerItems.add(new Layer<Asociacion>(map,new AsociacionParser()));
			drawerItems.add(new Layer<AsociacionVecinos>(map,new AsociacionVecinosParser()));
			drawerItems.add(new Layer<Boleras>(map,new BolerasParser()));
			drawerItems.add(new Layer<Bomberos>(map,new BomberosParser()));
			drawerItems.add(new Layer<CajeroEmtusa>(map,new CajeroEmtusaParser()));
			drawerItems.add(new Layer<Webcam>(map,new WebcamParser()));
			drawerItems.add(new Layer<Camping>(map,new CampingParser()));
			drawerItems.add(new Layer<Futbol>(map,new FutbolParser()));
			drawerItems.add(new Layer<Golf>(map,new GolfParser()));
			drawerItems.add(new Layer<CasaAldea>(map,new CasaAldeaParser()));
			drawerItems.add(new Layer<Casino>(map,new CasinoParser()));
			drawerItems.add(new Layer<Lectura>(map,new LecturaParser()));
			drawerItems.add(new Layer<CentroCultural>(map,new CentroCulturalParser()));
			drawerItems.add(new Layer<AtencionCiudadana>(map,new AtencionCiudadanaParser()));
			drawerItems.add(new Layer<Cine>(map,new CineParser()));
			drawerItems.add(new Layer<Formacion>(map,new FormacionParser()));
			drawerItems.add(new Layer<Footing>(map,new FootingParser()));
			drawerItems.add(new Layer<Colegio>(map,new ColegioParser()));
			drawerItems.add(new Layer<Comercio>(map,new ComercioParser()));
			drawerItems.add(new Layer<Confiteria>(map,new ConfiteriaParser()));
			drawerItems.add(new Layer<Polideportivo>(map,new PolideportivoParser()));
			drawerItems.add(new Layer<SaludEspecializada>(map,new SaludEspecializadaParser()));
			drawerItems.add(new Layer<SaludMental>(map,new SaludMentalParser()));
			drawerItems.add(new Layer<SaludPrimaria>(map,new SaludPrimariaParser()));
			drawerItems.add(new Layer<ServiciosSociales>(map,new ServiciosSocialesParser()));
			drawerItems.add(new Layer<CentroDia>(map,new CentroDiaParser()));
			drawerItems.add(new Layer<CruzRoja>(map,new CruzRojaParser()));
			drawerItems.add(new Layer<Policia>(map,new PoliciaParser()));
			drawerItems.add(new Layer<Farmacia>(map,new FarmaciaParser()));
			drawerItems.add(new Layer<Heladeria>(map,new HeladeriaParser()));
			drawerItems.add(new Layer<GaleriaArte>(map,new GaleriaArteParser()));
			drawerItems.add(new Layer<GijonBici>(map,new GijonBiciParser()));
			drawerItems.add(new Layer<Llagar>(map,new LlagarParser()));
			drawerItems.add(new Layer<Mirador>(map,new MiradorParser()));
			drawerItems.add(new Layer<Parque>(map,new ParqueParser()));
			drawerItems.add(new Layer<Piscina>(map,new PiscinaParser()));
			drawerItems.add(new Layer<Playa>(map,new PlayaParser()));
			drawerItems.add(new Layer<Pub>(map,new PubParser()));
			drawerItems.add(new Layer<PuntoLimpio>(map,new PuntoLimpioParser()));
			drawerItems.add(new Layer<InfoTurista>(map,new InfoTuristaParser()));
			drawerItems.add(new Layer<InfoTuristaAuto>(map,new InfoTuristaAutoParser()));
			drawerItems.add(new Layer<CocheElectrico>(map,new CocheElectricoParser()));
			drawerItems.add(new Layer<Exposiciones>(map,new ExposicionesParser()));
			drawerItems.add(new Layer<Teatro>(map,new TeatroParser()));
			drawerItems.add(new Layer<TiendaGastro>(map,new TiendaGastroParser()));
			drawerItems.add(new Layer<TiendaGourmet>(map,new TiendaGourmetParser()));
			drawerItems.add(new Layer<Trafico>(map,new TraficoParser()));
			
			drawerList.setOnItemClickListener(new SlideMenuClickListener());			
			drawerList.setAdapter(new DrawerListAdapter(getApplicationContext(),drawerItems));
			
			// enabling action bar app icon and behaving it as toggle button
			getSupportActionBar().setDisplayHomeAsUpEnabled(true);
			getSupportActionBar().setHomeButtonEnabled(true);
	        
			drawerToggle = new GijonActionBarDrawerToggle(this,drawerLayout,R.drawable.ic_drawer,R.string.app_name,R.string.app_name);
			
			drawerLayout.setDrawerListener(drawerToggle);			
		}
		catch(Exception e){
			Log.e(getClass()+".onCreate", e.toString(),e);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		try{
		    // Inflate the menu items for use in the action bar
			getMenuInflater().inflate(R.menu.main_activity_actions, menu);
			
			MenuItem searchItem = menu.findItem(R.id.action_search);
			MenuItem shareItem = menu.findItem(R.id.action_share);
		    SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
		    
		    // Configure the search info and add any event listeners
		    // ...
		    
		    shareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);
		    shareActionProvider.setShareIntent(shareIntent());
		    
		}
		catch (Exception e) {
			Log.e(getClass()+".onCreateOptionsMenu", e.toString(),e);
		}
		
	    return super.onCreateOptionsMenu(menu);
	}

    private Intent shareIntent () { //Revisar!!
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("type/plain");
        shareIntent.setType("image/*");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"SUBJECT");
        shareIntent.putExtra(Intent.EXTRA_TEXT,"TEXT TEXT");
        return shareIntent;
    }
    
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		try{
			// toggle nav drawer on selecting action bar app icon/title
	        if (drawerToggle.onOptionsItemSelected(item)) return true;
	        
		    // Handle presses on the action bar items
		    switch (item.getItemId()) {
		        case R.id.action_search:
		            //...
		            return true;
		        case R.id.action_share:
		            //...
		            return true;
		        case R.id.action_call:
		            //...
		            return true;
		        case R.id.action_web_site:
		            //...
		            return true;
		        case R.id.action_new_email:
		            //...
		            return true;
		        case R.id.action_favorite:
		            //...
		            return true;
		        case R.id.action_refresh:
		            //...
		            return true;
		        case R.id.action_about:
		            //...
		            return true;
		        default:
		            return super.onOptionsItemSelected(item);
		    }
		}
		catch (Exception e) {
			Log.e(getClass()+".onOptionsItemSelected", e.toString(),e);
			return super.onOptionsItemSelected(item);
		}

	}
	
	@Override
    public boolean onPrepareOptionsMenu(Menu menu) {
		try{
	        // if nav drawer is opened, hide the action items
	        boolean drawerOpen = drawerLayout.isDrawerOpen(drawerList);
	        menu.findItem(R.id.action_search).setVisible(!drawerOpen);
	        //...
		}
		catch (Exception e) {
			Log.e(getClass()+".onPrepareOptionsMenu", e.toString(),e);
		}
        return super.onPrepareOptionsMenu(menu);
    }
	
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
	    // Sync the toggle state after onRestoreInstanceState has occurred.
	    drawerToggle.syncState();
	}
	 
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
	    // Pass any configuration change to the drawer toggles
	    drawerToggle.onConfigurationChanged(newConfig);
	}
	    
	private class SlideMenuClickListener implements ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			paintLayer(position);
		}
	}
	
	private void paintLayer(int position){
		try{
			drawerItems.get(position).paint();		
	        drawerList.setItemChecked(position, true);
	        drawerList.setSelection(position);
	        drawerLayout.closeDrawer(drawerList);			
		}
		catch (Exception e) {
			Log.e(getClass()+".paintLayer", e.toString(),e);
		}
	}

}
