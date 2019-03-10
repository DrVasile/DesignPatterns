# Topic: *Structural Design Patterns*
### Author: *Drumea Vasile*
------
## Objectives :
__1. Study the Creational Design Patterns__

__2. Implement them in real projects__

## Theory :
In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.

Some examples of this kind of design patterns are :

   * Singleton
   * Builder
   * Prototype
   * Object Pooling
   * Factory Method
   * Abstract Factory
   
## Implementation :
In this project I've implemented 5 creational design patterns i.e. (Singleton, Builder, Prototype, Factory Method and Abstract Factory) with the emphasis on the fundamental object _**Player**_. The player class contains 4 attributes and the *get* and *set* methods as you can see in *Player.java* file. Also in that file is a method called *clone()* which is used to return a clone of the object if it exists in the *HashMap* which I'm maintaining in _**AbstractFactory**_ class.

The simplest DP, Singleton I've implemented in _**FactoryCreator**_ class. For this I use a static and volatile (In case of different threads) attribute for the instance. Then I declare the constructor as private so that the class could be instantiated only from _getInstance()_ method which is a static one and by a simple if i.e. : 
~~~
if (instance == null) {
    synchronized (FactoryCreator.class) {
        if (instance == null) {
            instance = new FactoryCreator();
        }
    }
 }
 ~~~
to check if the instance is null I create a new one is needed. In the meantime I use synchronized to escape the case of 2 threads trying to instantiate at the same time.

The builder DP ensures that a program can create different objects by the same creational process. In my project there are 2 stages to create the player. First is chosen the factory by the sport and then in the coresponding factory is chosen a builder class. I've put some text with the description of the position of the player for the sake of example, it could have been extended to more abstract functions. 

For the prototype DP as I said previously I maintain a *HashMap* with *String*, *Player* pairs to find each time if I've created a player with the current sport or not. In the affirmative case I return a clone.

The factory methods that I've used in my project are in _**PlayerBuilder**_ class. There are multiple classes which inherit the top one. Then based on the position parameter it is chosen one of them.

Above that I have the factories which get the coresponding builder for each sport. These factories extend the _**AbstractFactory**_ it being used in _**FactoryCreator**_ class which is just an additional level of abstraction in which the factory is chosen and returned in the _**Main**_ class. 

The proccess from _**FactoryCreator**_ till builder is in the following lines:
~~~
 FactoryCreator creator = FactoryCreator.getInstance();
 AbstractFactory playerFactory = creator.getFactory(sport);
 PlayerBuilder builder = playerFactory.getBuilder(position);
~~~

## Screenshot
![](/images/Capture.PNG)
