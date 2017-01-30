package main.java.adapter;

public interface Adapter<F, T> {

	T adapt(F object);
}
