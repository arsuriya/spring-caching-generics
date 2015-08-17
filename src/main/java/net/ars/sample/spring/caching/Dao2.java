package net.ars.sample.spring.caching;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Component;

@Component("Repo2")
public class Dao2 implements IfDao2 {

	@Override
	@CacheEvict(value="default",key="#e2.id2")
	//@CacheEvict(value="default",key="#root.args[0].id2")
    public Long save(Entity2 e2) {
		
	    return (long)(100 * Math.random());
    }
}
