package io.hschwentner.dddbits.basetype;

import io.hschwentner.dddbits.annotation.ValueObject;

/**
 * A value object type for types that are based on one type technical type.
 * 
 * @author Henning Schwentner
 * @param <T> The technical type
 */
@ValueObject
abstract class TinyType<T> {
	
	private final T value;

	protected TinyType(T value) {
		this.value = value;
	}

	public final T value() {
		return value;
	}

	@Override
	public final int hashCode() {
		return value.hashCode();
	}
	
	@Override
	public final String toString() {
		return getClass().getSimpleName() + " [" + value() + "]";
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
		TinyType other = (TinyType) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
