package net.ars.sample.spring.caching;

public class Entity2 {
	private Long id2;

	public Long getId2() {
		return id2;
	}
	
	public void setId2(Long id2) {
		this.id2 = id2;
	}

	@Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((id2 == null) ? 0 : id2.hashCode());
	    return result;
    }

	@Override
    public boolean equals(Object obj) {
	    if (this == obj)
		    return true;
	    if (obj == null)
		    return false;
	    if (getClass() != obj.getClass())
		    return false;
	    Entity2 other = (Entity2) obj;
	    if (id2 == null) {
		    if (other.id2 != null)
			    return false;
	    } else if (!id2.equals(other.id2))
		    return false;
	    return true;
    }
}
