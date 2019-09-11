package io.hschwentner.dddbits.basetype;

import io.hschwentner.dddbits.annotation.ValueObject;

/**
 * A value object type for types that are based on one type technical type.
 * 
 * @author Henning Schwentner
 * @param <V> The technical type
 */
@ValueObject
abstract class TinyWholeType<V, U> {

	private final V value;
	private final U unit;

	protected TinyWholeType(V value, U unit) {
		this.value = value;
		this.unit = unit;
	}

	public final V value() {
		return value;
	}

	public final U unit() {
		return unit;
	}

	@Override
	public final int hashCode() {
		return value.hashCode();
	}
	
	@Override
	public final String toString() {
		return getClass().getSimpleName() + " [" + value() + " " + unit() + "]";
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
		TinyWholeType other = (TinyWholeType) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
