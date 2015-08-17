package net.ars.sample.spring.caching;

public class Entity1 {

	private Long id1;

	public Long getId1() {
		return id1;
	}

	public void setId1(Long id1) {
		this.id1 = id1;
	}

	@Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((id1 == null) ? 0 : id1.hashCode());
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
	    Entity1 other = (Entity1) obj;
	    if (id1 == null) {
		    if (other.id1 != null)
			    return false;
	    } else if (!id1.equals(other.id1))
		    return false;
	    return true;
    }
	
	
}
