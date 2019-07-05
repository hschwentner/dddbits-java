package io.hschwentner.dddbits.basetype;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.hschwentner.dddbits.basetype.Entity;

class EntityTest {
	
	class ConcreteEntity extends Entity<Long> {

		public ConcreteEntity(Long id) {
			super(id);
		}
		
	}

	@Test
	void givenANewEntity_whenGetId_thenEqual() {
		// given
		Entity<Long> entityUnderTest = new Entity<Long>(47L) {
		};
		
		// when
		Long id = entityUnderTest.identity();
		
		// then
		assertThat(id).isEqualTo(47L);
	}

	@Test
	void givenTwoEntitiesOfSameTypeWithSameId_whenEquals_thenTrue() {
		// given
		ConcreteEntity entity1 = new ConcreteEntity(47L);
		ConcreteEntity entity2 = new ConcreteEntity(47L);
		
		// when
		boolean equal = entity1.equals(entity2);
		
		// then
		assertThat(equal).isTrue();
	}
	
	@Test
	void givenTwoEntitiesOfDifferentTypeWithSameId_whenEquals_thenFalse() {
		// given
		Entity<Long> entity1 = new Entity<Long>(47L) { };
		Entity<Long> entity2 = new Entity<Long>(47L) { };
		
		// when
		boolean equal = entity1.equals(entity2);
		
		// then
		assertThat(equal).isFalse();
	}
	
	@Test
	void givenAnEntity_whenToString_thenClassnamePlusId() {
		// given
		ConcreteEntity entityUnderTest = new ConcreteEntity(47L);
		
		// when
		String string = entityUnderTest.toString();
		
		// then
		assertThat(string).isEqualTo("ConcreteEntity [id=47]");
	}
	
}
