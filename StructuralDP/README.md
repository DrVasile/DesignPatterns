# Topic: *Structural Design Patterns*
### Author: *Drumea Vasile*
------
## Objectives :
__1. Study the Structural Design Patterns__

__2. Implement several of them in a project__

## Theory :
In Software Engineering, Structural Design Patterns are those that ease the design by identifying a simple way to realize relationships between entities.

Some examples of this kind of design patterns are :

   * Adapter
   * Bridge
   * Composite
   * Filter
   * Decorator
   * Facade
   * Fly-weight
   * Proxy
   
## Implementation :
In this project I've implemented 5 structural design patterns using the idea from the previous project with the creational patterns. Here also the main object is the _**Player**_. It has 5 String attributes with the basic information about the player (i.e. name, surname, gender, sport and position) and also a list of teammates.

The last attribute which is the list of teammates is used in the _**Composite Pattern**_. The _**Composite Pattern**_ is used when we need a way to treat a whole group of objects in a similar manner. In my case I have the list of teammates which in some cases are treated equally in team related stuff, and by this approach I compose another entity which is the team using the base object _**Player**_.

For the _**Filter Pattern**_ I have the interface _**Criteria**_ implemented in different classes based on the criteria of filtration. For example in the class _**CriteriaMale**_ I've implemented the method from the interface to get a list of only male players.

Above the _**Player**_ class I have the _**PlayerInterface**_ in which I specify that all the players should implement the  _**getDescription()**_ method. In  _**Player**_ class I have the basic implementation, but to be able to modify it at runtime I've added the  _**PlayerDecorator**_ abstract class which then is extended by  _**CaptainPlayer**_ class. In it I add a bit of text which states that the current player is the captain. 

## Screenshot
![](/images/Capture1.PNG)
