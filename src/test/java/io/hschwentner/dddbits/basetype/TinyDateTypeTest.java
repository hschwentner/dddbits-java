package io.hschwentner.dddbits.basetype;

import static org.assertj.core.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import io.hschwentner.dddbits.basetype.TinyDateType;

class TinyDateTypeTest {

	class DateOfBirth extends TinyDateType {

		public DateOfBirth(int year, int month, int dayOfYear) {
			super(year, month, dayOfYear);
		}
		
	}

	class DateOfIssue extends TinyDateType {

		public DateOfIssue(int year, int month, int dayOfYear) {
			super(year, month, dayOfYear);
		}
		
	}

	@Test
	void givenValueObject_whenGetProperties_thenPropertiesAreEqualToTheDate() {
		// given
		TinyDateType vo = new TinyDateType(2012, 12, 6) {
		};

		// when
		int year = vo.year();
		int month = vo.month();
		int day = vo.day();
		
		// then
		assertThat(year).isEqualTo(2012);
		assertThat(month).isEqualTo(12);
		assertThat(day).isEqualTo(6);
	}
	
	@Test
	void givenAValueObject_whenGetValue_thenValueIsEqualToTheDate() {
		// given
		TinyDateType vo = new TinyDateType(2012, 12, 6) {
		};

		// when
		LocalDate value = vo.value();
		
		// then
		assertThat(value).isEqualTo(LocalDate.of(2012, 12, 6));
	}
	
	@Test
	void givenTwoValueObjectsOfSameTypeWithSameValue_whenEquals_thenTrue() {
		// given
		DateOfBirth vo1 = new DateOfBirth(2012, 12, 6);
		DateOfBirth vo2 = new DateOfBirth(2012, 12, 6);
		
		// when
		boolean equal = vo1.equals(vo2);
		
		// then
		assertThat(equal).isTrue();
	}

	@Test
	void givenTwoValueObjectsOfSameTypeWithDifferentValue_whenEquals_thenFalse() {
		// given
		DateOfBirth vo1 = new DateOfBirth(2012, 12, 6);
		DateOfBirth vo2 = new DateOfBirth(2014, 1, 18);
		
		// when
		boolean equal = vo1.equals(vo2);
		
		// then
		assertThat(equal).isFalse();
	}

//	// TODO: this is debatable. Do we really want this to show the possibility?
//	@Test
//	void givenTwoValueObjectsOfDifferentSubtypeWithSameValue_whenEquals_thenTrue() {
//		// given
//		var vo1 = new DateOfBirth(2012, 12, 6);
//		var vo2 = new DateOfIssue(2012, 12, 6);
//		
//		// when
//		@SuppressWarnings("unlikely-arg-type")
//		boolean equal = vo1.equals(vo2);
//		
//		// then
//		assertThat(equal).isTrue();
//	}

	@Test
	void givenAValueObject_whenCallingToString_thenItReturnsSubClassNameAndValue() {
		// given
		DateOfBirth vo = new DateOfBirth(2012, 12, 6);
		
		// when
		String string = vo.toString();
		
		// then
		assertThat(string).isEqualTo("DateOfBirth [2012-12-06]");
	}

}
