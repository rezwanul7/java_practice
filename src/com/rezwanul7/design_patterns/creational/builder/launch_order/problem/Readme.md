# Problem
 When there are a large number of parameters to create an object of different configurations then it is hard to maintain the objects creation process.

### Example 1 
 Using a Java Bean with a lot of exposed getters and setters makes the process of different object creation based on different configuration unmaintainable.

### Example 2
Use of telescoping constructors for creating different objects based on different configuration is not scalable too. Since for each new configuration we need to add one more constructor. Sometimes we are in a trap and can not make another legitimate constructor due to the similar constructor method signatures. And also no clear idea of how a sample configuration would be.
 

# Thus
There are two specific problems that we need to solve:

Too many constructor arguments.
Incorrect object state.
This is where the Builder pattern comes into play.
#Solution
Using a Builder class for different configuration can give a flexible api to create differently configured objects.

