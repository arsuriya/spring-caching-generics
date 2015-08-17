package net.ars.sample.spring.caching;

import java.io.Serializable;

public interface GenericDao<ID extends Serializable, ENTITY> {
	public ID save(ENTITY e);
}
