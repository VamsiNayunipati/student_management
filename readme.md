### Write a program to find the weighted scores of students

The Java Programming class has two types – remote and in-person. For remote students, the weighted score comprises of midterm, final, assignments and discussion. The weights for each are 30%, 30%, 30% and 10% respectively. For in-person students, the weighted score comprises of midterm, final and assignments. The weights for each are 30%, 30% and 40%.

Write a generic class Students.java which has a constructor that takes three parameters – id, name, and type. Type will represent if the student is ‘remote’ or ‘in-person’. A toString() method in this class will display these details for any student object. A generic method score() will be part of this class and it will be implemented by inherited classes. Write accessors and mutators for the data points.

Write two classes RemoteStudents.java and InPersonStudents.java that inherits from Student class. Show the use of constructor from parent class (mind you, RemoteStudents have one additional parameter – ‘discussion’). Implement the abstract method score() of the parent class to calculate the weighted score for both types of students (polymorphism).

Write a driver class JavaProgramming.java which has the main method. Create one remote student object and one in-person student object. The output should show prompts to enter individual scores – midterm, finals, …… etc. and the program will calculate weighted score and display it. Format the output to display up to two decimal places.
