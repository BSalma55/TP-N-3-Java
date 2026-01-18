Getting into Practice: Input/Output

Exercice 1: Simulate the ls command:

During the execution of this program, I first enter the full path of a directory. The program then creates a File object corresponding to this path, and I check whether the directory exists and whether it is actually a directory. If the path is invalid, I display an error message and stop the program. Otherwise, I retrieve the list of files and subdirectories contained in the directory. For each element, I determine its type (file or directory) and I check its access permissions, namely readability, writability, and whether it is hidden. Finally, I display the full path, the type, and the access rights of each element, in a format similar to the ls command, and the program ends normally.

Code :


<img width="1117" height="778" alt="image" src="https://github.com/user-attachments/assets/efc77048-acda-4178-be0f-e9db41fc80d9" />

Exécution du code :


<img width="1092" height="77" alt="image" src="https://github.com/user-attachments/assets/506ee4ea-9106-42ed-84d6-29a6ad2031d7" />


Exercise 2: Objects Serialization in products.dat


This application is designed to manage a collection of products using object serialization in Java. The products are stored in a file named products.dat, allowing the data to be preserved even after the program is closed.

Each product is represented by a Product class that implements the Serializable interface. This class contains several attributes such as ID, name, brand, price, description, and quantity in stock.

The application is structured using an object-oriented approach. An interface called IProduitMetier defines the main operations for managing products, including adding a product, displaying all products, searching for a product by its ID, deleting a product, and saving the product list to a file. These methods are implemented in the MetierProduitImpl class, which manages a list of products and handles reading and writing data to the file using object streams.

At startup, the application automatically loads the products stored in the products.dat file, if it exists. Then, an interactive menu is displayed in a loop, allowing the user to view all products, search for a product by ID, add new products, delete products, or save the data. The program continues to run until the user chooses to exit.



Code :


<img width="1170" height="670" alt="image" src="https://github.com/user-attachments/assets/19c9a3c3-a421-438a-93a0-b34579d8fee6" />

<img width="1045" height="772" alt="image" src="https://github.com/user-attachments/assets/b37a7369-5b3f-44fd-9ad8-3d45f6c44b2d" />

<img width="1262" height="535" alt="image" src="https://github.com/user-attachments/assets/e4f5cc41-6dda-4345-9661-24ad07488954" />

<img width="1291" height="706" alt="image" src="https://github.com/user-attachments/assets/353e69bb-8f42-41c0-ae0d-0a0f9ab4e07c" />

<img width="1383" height="765" alt="image" src="https://github.com/user-attachments/assets/74dbd22d-d3ee-49fe-be33-72cc47e4ff68" />

<img width="1068" height="548" alt="image" src="https://github.com/user-attachments/assets/b5c2f8c1-d97a-4c90-8fea-106bc7854327" />


Exécution code : 


<img width="1253" height="753" alt="image" src="https://github.com/user-attachments/assets/04ad5e05-6034-4b37-94f0-f396447e0f88" />
<img width="820" height="777" alt="image" src="https://github.com/user-attachments/assets/9ddefc54-bfb9-43ed-a733-a7139c96b9f0" />


Getting into Practice: Input/Output

Exercice 1: Simulate the ls command:


The Calculator program is designed to perform basic arithmetic operations while handling common errors. It consists of a Calculator class with three main methods. The divide(a, b) method returns the result of dividing a by b and displays an error message if the user tries to divide by zero. The convertToNumber(text) method converts a string into a numeric value and handles invalid input by displaying an appropriate error message. The calculate(operation, a, b) method performs one of the four basic operations: addition, subtraction, multiplication, or division, and shows an error message if the operation is not supported. The program is structured to ensure safe execution by returning NaN for invalid operations or inputs. A test class allows the user to enter numbers and an operation, calls the corresponding methods of the Calculator class, and displays the result or an error message. This implementation demonstrates proper error handling, code reuse, and user-friendly interaction.


Code :

<img width="1325" height="807" alt="image" src="https://github.com/user-attachments/assets/738651ed-74ca-4055-8e80-439c18809cc2" />
<img width="950" height="332" alt="image" src="https://github.com/user-attachments/assets/b4f3b376-7cd9-42bf-b901-bdd990375044" />

Exécution du Code :

<img width="843" height="342" alt="image" src="https://github.com/user-attachments/assets/fcfb2d0b-2ae0-43bf-951b-04b9d2cc9320" />


Exercise 2:

I created a TooFastException class that inherits from Exception. This class has no attributes, and its constructor takes a speed value as a parameter, which it includes in a custom message to indicate that the speed is too high.

The Vehicle class has no attributes and provides an empty constructor. It contains a method testSpeed(int speed) that checks whether the speed exceeds 90. If it does, it throws a TooFastException; otherwise, it prints that the speed is safe.

In the main method, I created a Vehicle object and called the testSpeed() method with two different speeds, one of which is above 90. I used a try-catch block to catch the exception and display the call stack (stack trace), showing exactly where the exception was thrown in the program. This implementation demonstrates creating a custom exception, handling it, and using the stack trace in Java.

Code :

<img width="1172" height="171" alt="image" src="https://github.com/user-attachments/assets/41a2c7fb-a7b7-48d3-bde0-0bf0c68d8c8d" />
<img width="1025" height="562" alt="image" src="https://github.com/user-attachments/assets/8bda6e55-5a66-4f76-b3da-63d4bac7388c" />


Exécution du code :

<img width="1082" height="183" alt="image" src="https://github.com/user-attachments/assets/1a687757-9441-4406-930f-8ed3f6c48f0c" />





