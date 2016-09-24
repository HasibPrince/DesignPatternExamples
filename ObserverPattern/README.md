#Observer Pattern
The observer pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

The object which is being watched is called the subject. The objects which are watching the state changes are called observers or listeners.

#Example
Let's say a program which maintains the statistics of Football. If something is happened in a football match, then different entities are needed to be notified. 
In this case Observer Pattern is applicaple. such as, statistics of a player and a team are two entities. Here these two entities are needed to be notified when
a goal is scored. Then this two entities will register with their subject to get notification, here Scoreboard is the subject which is responsibple to track the goal. When Scoreboard
will find that goal is scored, then he will send notification to all observers.

#Evaluation
The observer pattern allows for the Open Closed principle. This principle states that a class should be open for extensions without the need to change the class.

Using the observer pattern a subject can register an unlimited number of observers. If a new listener wants to register with the subject, no code change in the subject is necessary.

Using the listener pattern decouples the subject from its observers. Only the observers have direct knowledge about the subject.
