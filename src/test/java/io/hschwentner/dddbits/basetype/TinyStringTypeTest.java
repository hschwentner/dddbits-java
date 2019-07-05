package io.hschwentner.dddbits.basetype;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.hschwentner.dddbits.basetype.TinyStringType;

class TinyStringTypeTest {
	
	class Firstname extends TinyStringType {

		public Firstname(String value) {
			super(value);
		}
		
	}

	class Lastname extends TinyStringType {

		public Lastname(String value) {
			super(value);
		}
		
	}

	@Test
	void givenAValueObject_whenGetValue_thenValueIsEqualToTheString() {
		// given
		TinyStringType vo = new TinyStringType("The string value") {
		};

		// when
		String value = vo.value();
		
		// then
		assertThat(value).isEqualTo("The string value");
	}
	
	@Test
	void givenTwoValueObjectsOfSameTypeWithSameValue_whenEquals_thenTrue() {
		// given
		Firstname vo1 = new Firstname("Otto");
		Firstname vo2 = new Firstname("Otto");
		
		// when
		boolean equal = vo1.equals(vo2);
		
		// then
		assertThat(equal).isTrue();
	}

	@Test
	void givenTwoValueObjectsOfDifferentSubtypeWithSameValue_whenEquals_thenFalse() {
		// given
		Firstname vo1 = new Firstname("Otto");
		Lastname vo2 = new Lastname("Otto");
		
		// when
		@SuppressWarnings("unlikely-arg-type")
		boolean equal = vo1.equals(vo2);
		
		// then
		assertThat(equal).isFalse();
	}

	@Test
	void givenAValueObject_whenCallingToString_thenItReturnsSubClassNameAndValue() {
		// given
		Firstname vo = new Firstname("Otto");
		
		// when
		String string = vo.toString();
		
		// then
		assertThat(string).isEqualTo("Firstname [Otto]");
	}

}
