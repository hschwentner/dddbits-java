package io.hschwentner.dddbits.basetype;

import java.time.LocalDate;

import io.hschwentner.dddbits.annotation.ValueObject;

@ValueObject
public abstract class TinyDateType extends TinyType<LocalDate> {
	
	protected TinyDateType(LocalDate date) {
		super(date);
	}	

	protected TinyDateType(int year, int month, int dayOfMonth) {
		this(LocalDate.of(year, month, dayOfMonth));
	}	

	// TODO: year() vs. getYear im Domain Model?
	public final int year() {
		return value().getYear();
	}

	public final int month() {
		return value().getMonthValue();
	}

	public final int day() {
		return value().getDayOfMonth();
	}
	
}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (!(obj instanceof LocalDateBasedValueObject))
//			return false;
//		LocalDateBasedValueObject other = (LocalDateBasedValueObject) obj;
//		if (date == null) {
//			if (other.date != null)
//				return false;
//		} else if (!date.equals(other.date))
//			return false;
//		return true;
//	}