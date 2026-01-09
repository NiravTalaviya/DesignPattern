
## Prototype Design pattern
1. We have complex object that is costly to create. To create more instances of such class, we use an existing instance as
our prototype.
2. Prototype will allow us to make copies of existing object & save us from having to recreate objects from scratch.
3. The class must implement Cloneable interface.
4. The method should declare CloneNotSupportedException in throws clause to give subclasses chance to decide whether to support cloning.


