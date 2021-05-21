# dddbits-java
Helping stuff for Domain-Driven Design style projects in Java/on the JVM. 
<!-- For similar support in .NET see dddbits-csharp. (Or dddbits-net or dddbits-dotnet???) -->

The project contains two types of things: architectural annotations and base types for building blocks.
The architectural annotations are used to express that a class is of a certain kind of building block.
The base types provide infrastructure.

## Architectural annotations
NOTE: The architectural annotations have been ported to and are superseeded by those from [jMolecules](https://github.com/xmolecules/jmolecules).


## Base types
For some of the Building Blocks the infrastructure is often the same.
This infrastructure is provided in the base types.


### Entities
From the Blue Book[1] we know that entities must have an identity.
Typically we want that `equals()` and `hashcode()` are based on this identity.
The base class `Entity<ID>` provides implementations for this.

Example:

```java
import io.hschwentner.dddbits.annotation.*;
import io.hschwentner.dddbits.basetype.*;

@DomainEntity
public class BankAccount extends Entity<IBAN> {

    public BankAccount(IBAN iban) {
        super(iban);
    }

}
```


### Value Objects
Since we don't have value types in Java yet, we have to simulate values with objects.
(That may change with the advent of Project Valhalla.)
For the time being, this means unfortunately that we have to write a lot of boilerplate code for a well-implemented value object.
DDDBITS provide so called tiny types that help to reduce that boilerplate code for simple value types.

Example:

```java
import io.hschwentner.dddbits.annotation.*;
import io.hschwentner.dddbits.basetype.*;

@ValueObject
public class IBAN extends TinyType<String> {

    private IBAN(String ibanString) {
        super(ibanString);
    }

    public IBAN of(String ibanString) {
        return new IBAN(ibanString);
    }

}
```

Value Objects are identityless and immutable.

Immutability in Java comes with only final fields plus methods that never mutate the state.
(That means we only have commands in the sense of command-query-separation[3].)

No identity in Java is reached by overwriting `equals()` with an implementation that is based on the values of the fields.
Such an implementation and similar implementations for `hashcode()` and `toString()` are provide by the `TinyType<V>` super class.


## Installation
To use the DDD bits in your project just install it from the Maven central repository.

### Maven

```xml
<dependency>
  <groupId>io.hschwentner.dddbits</groupId>
  <artifactId>dddbits</artifactId>
  <version>0.0.1</version>
</dependency>
```

### Gradle

```groovy
compile("io.hschwentner.dddbits:dddbits:0.0.1")
```

## Usage
If you're using Jigsaw modules add a dependency to DDDBITS to your module-info.java:
```java
	module com.mycompany.mymodule {
	    requires io.hschwentner.dddbits;
    }
```

## Disclaimer
It is generally good architectural advice to keep your domain layer free from technology.
That is why Clean Architecture got its name; because we keep the model clean.

Thinking Jigsaw modules this means you don't want any other dependency than `requires java.base`.
Honestly, it is bad enough to tie your domain model to a specific programming language.
(Yes, a programming language is technology too.
Unfortunately humanity hasn't found a way to express a domain model without expressing it _in_ something...)

With using the DDDBITS you add a dependency to your domain model.
So think carefully, if you really want to do it.
Sometimes it may be a better way to implement this stuff in the exact way you need it in your project.

## Literature
1. Eric Evans, Domain-Driven Design – Tackling Complexity in the Heart of Software, Addison Wesley, 2004.
2. Vaughn Vernon (@VaughnVernon): Implementing Domain-Driven Design, Addison Wesley, 2013.
3. Bertrand Meyer: Object-Oriented Software Construction.
