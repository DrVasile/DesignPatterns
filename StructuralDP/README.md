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
In this project I've implemented 5 structural design patterns using the idea from the previous project with the creational patterns. Here also the main object is the _**Player**_. The hierarchy that builds the _**Player**_ enity is structured in the following way. I have the abstract class _**Player**_ which comprises the signatures of the methods but also has an attribute of type _**PlayerAPI**_, an interface which I use to differentiate the sports between genders. Here is the body of the abstract class :

```
public abstract class Player {

    protected PlayerAPI playerAPI;
    
    public Player(PlayerAPI playerAPI) {
        this.playerAPI = playerAPI;
    }

    abstract void play();
    abstract String getDescription();
    abstract void standards();
}
```

Then, the _**Player**_ class is extended by _**BasicPlayer**_ class. It has 5 String attributes with the basic information about the player (i.e. name, surname, gender, sport and position) and also a list of teammates.

~~~
    private String name;
    private String surname;
    private String gender;
    private String sport;
    private String position;
    private List<BasicPlayer> teammates;
~~~

I've separated a part of implementation from the abstract class using the _**PlayerAPI**_ interface so that they could act without affecting each other. 

__1. Bridge__

As I said in the above statement I have an interface separated from the _**Player**_ class by not implementing it, but using a reference to the interface. That variable ```protected PlayerAPI playerAPI```, is then used in the _**BasicPlayer**_ class which is the bridge between the implementation and the abstract class. Depending on the gender I have 2 classes which implement the method from the interface, for example here is the on for a male player : 

```
@Override
public void standards(String sport) {
    if (sport.equalsIgnoreCase("Volleyball")) {
        System.out.println("The net's height is 2.43 meters!");
    } else {
        System.out.println("The rim's height is 3.05 meters!");
    }
}
```

Now to create a player I give to it also an object reference to a class which implements the API as below :

![](/images/SecondLab/Capture.PNG)

__2. Adapter__ 

For the _**Adapter**_ pattern I have 2 classes, the _**PlayerAdapter**_ and _**PlayerBuilder**_. In the builder class I create the first see if the sport is valid, create the adapter and then execute the specific method. In the adapter class based on sport I create an object of one of the specialized classes _**VolleyballPlayer**_ and _**BasketballPlayer**_ : 

```
PlayerAdapter(String sport, String gender) {
    if (sport.equalsIgnoreCase("Volleyball")) {
        advancedPlayer = new VolleyballPlayer(gender.equalsIgnoreCase("male") ? new MalePlayer() : new FemalePlayer());
    } else {
        advancedPlayer = new BasketballPlayer(gender.equalsIgnoreCase("male") ? new MalePlayer() : new FemalePlayer());
    }
}
```

Below you can see how the builder is used and how he adapts : 

![](/images/SecondLab/Capture.PNG)

The last attribute which is the list of teammates is used in the _**Composite Pattern**_. The _**Composite Pattern**_ is used when we need a way to treat a whole group of objects in a similar manner. In my case I have the list of teammates which in some cases are treated equally in team related stuff, and by this approach I compose another entity which is the team using the base object _**Player**_.

For the _**Filter Pattern**_ I have the interface _**Criteria**_ implemented in different classes based on the criteria of filtration. For example in the class _**CriteriaMale**_ I've implemented the method from the interface to get a list of only male players.

Above the _**Player**_ class I have the _**PlayerInterface**_ in which I specify that all the players should implement the  _**getDescription()**_ method. In  _**Player**_ class I have the basic implementation, but to be able to modify it at runtime I've added the  _**PlayerDecorator**_ abstract class which then is extended by  _**CaptainPlayer**_ class. In it I add a bit of text which states that the current player is the captain. 

## Screenshots
