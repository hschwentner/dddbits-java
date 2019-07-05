package io.hschwentner.dddbits.basetype;

import io.hschwentner.dddbits.annotation.ValueObject;

@ValueObject
public abstract class TinyStringType extends TinyType<String> {

	protected TinyStringType(String value) {
		super(value);
	}
	
}
