# JetsProject
![](https://static.wikia.nocookie.net/gundam/images/7/77/MSZ-006_-_Zeta_Gundam_-_Front_View.jpg/revision/latest?cb=20180630134003)

## Program Overview
This program prints a menu of options for the user to choose from. The options include the following:

List out the gundams
Fly all jets (lists all the gundams, but with the addition of time until running out of fuel)
View fastest jet
View jet with longest range
Shoot Bazookas! (Special Zaku Functionality)
Beam Saber Attack! (Special MSZ-006 Functionality)
Add a gundam to the hangar
Remove a gundam from the hangar
Quit

By typing in the corresponding number, the user can have the program complete the menu option. Once an action is complete, the program will reprint the menu and the user will be prompted to select another option. This will continue until the user selects the option to quit.


## Topics/Technologies Used
Abstract Classes & Abstract Methods
Interfaces
Exceptions (throws exception & try/catch blocks)
for and foreach loops
Scanner
Superclasses and Subclasses
Super() constructor
Switch
Objects
TimeUnit.MILLISECONDS.sleep(); method
ArrayList
Getters and Setters
toString()
constructors
Encapsulation
Override
if statements


## Lessons Learned
In this project I learned about implementing Abstract classes and Interfaces to ensure that our classes implement all of the correct methods. I also learned a lot more about how subclasses and superclasses interact with each other. I feel much more confident in particular with accessing Superclass fields in the subclass.

I also learned about the sleep() method from the TimeUnit library (class?), which allowed me to implement so extra functionality to the methods from my interfaces that I think made the project a bit more fun.

I still don't feel great about exceptions. I tried to implement this in my code in spots where the Scanner is being used, since a bad input can crash the program. Even though I did put try/catch blocks in and it will print the catch statement, the program won't continue to run after the fact. I'm not sure if this is an issue with Scanners not being able to recover from bad inputs, or if I am simply implementing the try/catch block incorrectly.

## How To Run
To run this program, Select the menu option you want to access by typing in the corresponding number. When adding or removing a gundam from the hangar, further input is required from the user. Read the prompts and input the appropriate data to add or remove a gundam.