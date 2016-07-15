Decorator pattern allows a user to add new functionality to an existing object without altering its structure. 
This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

The Decorator design pattern attach additional responsibilities to an object dynamically.
It is wrap up at another object.It will extend functionality of object without affecting any other object.
Decorators provide a alternative to subclassing for extending functionality.
Read more at http://www.java2blog.com/2012/07/decorator-design-pattern.html#0umAQf7Gc06g2e7w.99

Also known as:
Wrapper 
When to use it:

1. to add responsibilities to individual objects dynamically without affecting other objects.
2. for responsibilities that can be withdrawn,
3. When extension by subclassing is impractical.Sometimes a large number of independent extensions are possible and would produce an explosion of subclasses to support every combination.
Or class definition may be hidden or otherwise unavailable for subclassing.

Example - Encryption/Crypto operation with AES or DES. Can make decision on Run time.
Example 02- In this example,we will decorate a simple room with color and curtains.

Difference between adapter and decorator pattern is - adaptar pattern make a wraper on two incompatible object. 
but decorator pattern change/add/extend the functionality of an object in run time.