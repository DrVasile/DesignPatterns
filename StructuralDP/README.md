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

The last attribute which is the list of teammates is used in the _**Composite**_ Pattern. The _**Composite**_ pattern is used when we need a way to treat a whole group of objects in a similar manner. In my case I have the list of teammates which in some cases are treated equally in team related stuff, and by this approach I compose another entity which is the team using the base object _**Player**_.

## Screenshot
![](/images/Capture1.PNG)
