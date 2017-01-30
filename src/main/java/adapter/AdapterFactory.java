package main.java.adapter;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import main.java.model.TravixRequest;
import main.java.model.TravixResponse;
import main.java.service.supplier.model.CrazyAirRequest;
import main.java.service.supplier.model.CrazyAirResponse;
import main.java.service.supplier.model.ToughJetRequest;
import main.java.service.supplier.model.ToughJetResponse;
import main.java.util.Pair;

/**
 * This class will provide adaptors
 */

@Service
@SuppressWarnings("rawtypes")
public class AdapterFactory {

	private Map<Pair<Class, Class>, Adapter> adapters;
	
	@PostConstruct
	public void setup() {
		adapters = new HashMap<Pair<Class,Class>, Adapter>();
		
		registerAdapter(CrazyAirResponse.class, TravixResponse.class, new CrazyAirToTravixResponse());
		registerAdapter(ToughJetResponse.class, TravixResponse.class, new ToughJetToTravixResponse());
		registerAdapter(TravixRequest.class, CrazyAirRequest.class, new TravixToCrazyAirRequest());
		registerAdapter(TravixRequest.class, ToughJetRequest.class, new TravixToToughJetRequest());
	}
	
	@SuppressWarnings("unchecked")
	public <F,T> T adaptFromTo(F from, Class<T> toClass ) {
		Pair<Class, Class> pair = new Pair<>(from.getClass(), toClass);
		
		if (adapters.get(pair) == null) {
			// Runtime Exception is thrown as if we try to get an nonexistent, it has to be added first 
			throw new RuntimeException("Adapter from " + from.toString() + " to " + toClass.toString() + " not registered");
		}
		Adapter<F, T> adapter = adapters.get(pair);
		
		return adapter.adapt(from);
	}
	
	public void registerAdapter(Class class1, Class class2, Adapter adapter) {
		Pair<Class, Class> pair = new Pair<>(class1, class2);
	
		adapters.put(pair, adapter);
	}
}
