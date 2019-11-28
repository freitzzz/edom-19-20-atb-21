# EDOM - Project Increment 4

## 1 - Options regarding the code generation

My options regarding code generation are very similar to those presented on the slides.
First, a class was created for each use case model that shows the actors of this use case model and prompts the user to choose one of them. For each actor, is created a class that allows the user to choose a use case associated with the actor through the association element. After that, is created a class for each use case and in that class there is a function that shows the CRUD operations if the use case has a comment with the description "CRUD", or shows the included use cases if they exists, or call a class to be developed by the programmer.
There is also a class that allows the user to perform the CRUD operations. For this, a hashmap collection was used.

## 2 - Update to the use case metamodel

A "Comment" class was created in the metamodel for use by the "UseCase" class, because a use case can have multiple comments. A comment has a description.


## 3 - Proposals to support the manual editing of code

If the use case has no comment with the description "CRUD" and doesn't have included use cases, the programmer should develop what is desired. When the usecase matches this situation, the code calls a function that has the comment "@generated NOT". With this comment, code generation will not replace the function that may have been previously changed by the programmer.