# Factory Method pattern
We want to move the object creation logic from our code to a separate class

1. We start by creating a class for our creator
2. Most defining characteristic of factory method pattern is “**subclasses providing the actual instance**”. So, static methods returning object instances are technically not GoF factory methods.

### Example

1. Great example of java.util.Collection

```java
public abstract class AbstractCollection<E> implements Collection<E> {
	protected AbstractCollection() {
	}
	
	// This is example of factory method, subclass of this will return actual instance
	public abstract Iterator<E> iterator(); 
```

### When to use this ?

- Use factory method pattern when you want to delegate object instantiation to subclasses, you’d want to do this when you have “product” inheritance hierarchy and possibility of future additions to that.