package main.java.adapter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import main.java.util.Pair;

/**
 * This class will provide adaptors
 */

@Service
@SuppressWarnings("rawtypes")
public class AdapterFactory {

	private Map<Pair<Class, Class>, Adapter> adapters;
	
	public AdapterFactory() {
		adapters = new HashMap<>();
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
