package io.hschwentner.dddbits.basetype;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TinyWholeTypeTest {
	
	class Weight extends TinyWholeType<String, String> {

		public Weight(String size, String sizeUnit) {
			super(size, sizeUnit);
		}
		
	}

	class Length extends TinyWholeType<String, String> {

		public Length(String length, String lenghtUnit) {
			super(length, lenghtUnit);
		}
		
	}

	@Test
	void givenAValueObject_whenGetValue_thenValueIsEqualToTheString() {
		// given
		TinyWholeType<String, String> vo = new TinyWholeType<String, String>("100", "m") {
		};

		// when
		String value = vo.value();

		// then
		assertThat(value).isEqualTo("100");
	}

	@Test
	void givenAValueObject_whenGetUnit_thenUnitIsEqualToTheString() {
		// given
		TinyWholeType<String, String> vo = new TinyWholeType<String, String>("100", "m") {
		};

		// when
		String unit = vo.unit();

		// then
		assertThat(unit).isEqualTo("m");
	}

	@Test
	void givenTwoValueObjectsOfSameTypeWithSameValue_whenEquals_thenTrue() {
		// given
		Weight vo1 = new Weight("200", "kg");
		Weight vo2 = new Weight("200", "kg");
		
		// when
		boolean equal = vo1.equals(vo2);
		
		// then
		assertThat(equal).isTrue();
	}

	@Test
	void givenTwoValueObjectsOfDifferentSubtypeWithSameValue_whenEquals_thenFalse() {
		// given
		Weight vo1 = new Weight("200", "kg");
		Length vo2 = new Length("100", "m");
		
		// when
		@SuppressWarnings("unlikely-arg-type")
		boolean equal = vo1.equals(vo2);
		
		// then
		assertThat(equal).isFalse();
	}

	@Test
	void givenAValueObject_whenCallingToString_thenItReturnsSubClassNameAndValue() {
		// given
		Weight vo = new Weight("200", "kg");

		// when
		String string = vo.toString();
		
		// then
		assertThat(string).isEqualTo("Weight [200 kg]");
	}

}
