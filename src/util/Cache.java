package util;

import java.io.Serializable;

public interface Cache {
	public Serializable get(Serializable key);
	public void put(Serializable key, Serializable data);
	public Serializable get(long time, Serializable key);
	public void put(long time, Serializable key, Serializable data);
}
