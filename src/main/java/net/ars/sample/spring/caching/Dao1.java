package net.ars.sample.spring.caching;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Component;

@Component("Repo1")
public class Dao1 implements IfDao1 {

	@Override
	@CacheEvict(value="default",key="#e1.id1")
	//@CacheEvict(value="default",key="#root.args[0].id1")
    public Long save(Entity1 e1) {
		
	    return (long)(100 * Math.random());
    }

}
