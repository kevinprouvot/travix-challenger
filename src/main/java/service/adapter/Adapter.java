package main.java.service.adapter;

public interface Adapter<F, T> {

	T adapt(F object);
}
