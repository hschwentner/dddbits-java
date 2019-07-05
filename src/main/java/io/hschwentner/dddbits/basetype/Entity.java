package io.hschwentner.dddbits.basetype;

import io.hschwentner.dddbits.annotation.DomainEntity;

@DomainEntity
public abstract class Entity<ID> {

	private final ID identity;

	protected Entity(ID identity) {
		if (identity == null) {
			throw new IllegalArgumentException("identity must not be null");
		}
			
		this.identity = identity;
	}

	public final ID identity() {
		return identity;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [id=" + identity + "]";
	}

	@Override
	public final int hashCode() {
		return identity.hashCode();
	}
	
	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("rawtypes")
		Entity other = (Entity) obj;
		if (identity == null) {
			if (other.identity != null)
				return false;
		} else if (!identity.equals(other.identity))
			return false;
		return true;
	}

}
