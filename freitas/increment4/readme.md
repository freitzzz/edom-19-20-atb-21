# EDOM - Project Increment 4


In this folder you should add **all** artifacts developed for the project increment 4.

**Note:** If for some reason you need to bypass these guidelines please ask for directions with your teacher and **always** state the exceptions in your commits and issues in bitbucket.


## Code Generation Strategy

The strategy used for the code generation using Acceleo is inspired by the given [example](https://bitbucket.org/mei-isep/pt.isep.edom.acceleo.example/src/master/src/pt/isep/edom/acceleo/example/main/generate.mtl) for this increment, yet it differentiates from the example in some aspects. The strategy used for the generation in this increment is that each different transformation has their own generation **template**. This is done in order to separate transformation responsibilities, which eases the process of creating the generated code, as well as to refactor it in the future. Just like the example demonstrates, interfaces were conceived for metamodel models, being these:

|Interface|Description|
|---------|-----------|
|Actor|Allows to mark that a concretization is an actor model, and specifies that an actor can be executed by defining an `execute` method|
|UseCase|Allows to mark that a concretization is an use case model, and specifies that an use case can be executed by defining an `execute` method|
|Entity|Allows to mark that a concretization is an entity of a use case, and specifies that an entity allows the access of its name and identifier by defining `name` and `id` methods|

Additionaly other interfaces were defined that produce the behavior of design patterns, being these:

|Interface|Description|
|---------|-----------|
|Factory|Produces functionalities that allow the creation of entities, use cases, actors and repositories|
|Repository|Produces functionalities that allow the management of entities (Save, Find, Update, Delete)|


The following tables summarizes the transformations that were taken in account:

|Template Signature|Description|
|------------------|-----------|
|`generateJavaConsoleApplication`|The entrypoint for the generation of the code. Generates a main class with a menu that describes the actors that can be interacted with|
|`generateFactoryInterface`|Generates a file that describes an interface for the `Factory` design pattern|
|`generateFactoryImpl`|Generates a file that represents an implementation class of the factory interface|
|`generateFactorySingleton`|Generates a file that represents a class that acts as a singleton of the factory interface|
|`generateRepositoryInterface`|Generates a file that describes an interface for the `Repository` pattern|
|`generateEntityRepositoryInterface`|Generates a file that represents an interface for a specific entity, which extends the behavior of the repository interface|
|`generateEntityInterface`|Generates a file that describes the entity interface|
|`generateActorInterface`|Generates a file that describes the actor interface|
|`generateUseCaseInterface`|Generates a file that describes the use case interface|
|`generateRepositoryImpl`|Generates a file that represents the entity repository interface implementation for a specific entity|
|`generateEntityImpl`|Generates a file that represents the entity interface implementation for a specific interface|
|`generateActorImpl`|Generates a file that represents the actor interface implementation for an actor that is not associated with any use cases. The `execute` method implementation prints a message warning that the actor is not associated with any use cases|
|`generateActorWithAssociationsImpl`|Generates a file that represents the actor interface implementation for an actor that is associated with a set of use cases. The `execute` method implementation presents a menu that allows the interaction with all the use cases which the actor is associated with|
|`generateUseCaseImpl`|Generates a file that represents the use case interface implementation for an use case that does not provide CRUD operations. The `execute` method implementation prints a message warning that the use case has no operations to interact with|
|`generateIncludeUseCaseImpl`|Generates a file that represents the use case interface implementation for an use case that includes other use cases. The `execute` method implementation creates an instance of each included use case and executes them|
|`generateCRUDUseCaseImpl`|Generates a file that represents the use case interface implementation for an use case that provides CRUD operations. The `execute` method implementation presents a menu for interacting with these operations|
|`generateCRUDEntityUseCaseImpl`|Generates a file that represents the use case interface implementation for an use case that provides CRUD operations for a specific entity. The `execute` method implementation presents a menu for interacting with these operations for the specific entity|


## Use Case Metamodel and DSL Update

In order to allow the definition that an use case can provide CRUD operations and is related to an entity, the metamodel was updated to include a new model named `Comment`. This model has a description field which allows the definition of the comment meaning. The `UseCase` model now includes a containment relationship with `Comment` model in order to define comments for use cases.
Consequentially the DSL was also updated to reflect the changes of the metamodel. It now describes that an use case can have comments by the defining the following grammar rule:

`('usecase' '{' usecase+=UseCase ( "," usecase+=UseCase)* '}' )?`

Just like it is represented in the example diagrams, to define that an use case provides CRUD operation and is related to an entity, it is necessary to define comments which description matches `CRUD` and `Entity:` strings.


## Manual Code Editing Support

In order to support the manual editing of code, in some generation templates it was defined a *javadoc* that marks that a class should not be override by future code generations using the `@generated NOT` rule. The templates in which this javadoc was added are:

- `generateFactorySingleton` - This was performed in order allow the modification of the repository interface realization to be used in the execution of the console application.
- `generateUseCaseImpl` - This was performed in order allow the extensibility of the use case behaviour.

Although the mechanism applied automatically generates these javadoc comments on the first generation of the code, these comments could also be added manually after code generation.