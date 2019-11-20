# EDOM - Project Increment 3


In this folder you should add **all** artifacts developed for the project increment 3.

**Note:** If for some reason you need to bypass these guidelines please ask for directions with your teacher and **always** state the exceptions in your commits and issues in bitbucket.


## Requirements to Use Cases Transformations

In order to transform an instance of requirements model, the following rules have been defined:

1. Uses cases are only modeled by functional requirements
2. A requirement which has a comment with the subject “Actor” identifies an **actor**
3. A requirement which has a comment with the subject “UseCase” identifies an **use case**
4. A requirement which doesn’t have a comment identifies a **use case**
5. A "use case" requirement that has a dependency with an “actor” requirement identifies an **association** between an Use case and an Actor
6. A "actor" requirement that has a dependency with an “use case” requirement identifies an **association** between an Actor and a Use Case
7. A "use case" requirement that has a dependency with an “use case” requirement identifies an **inclusion** between two Use Cases

While developing the transformation using ATL, it is possible to identify that rules 2 and 3 comparsion equality collides with rules 5, 6 and 7 respectively. This is due to both of these rules requiring the comparsion if the requirement is an use case or an actor. To prevent the rule collision, rules 2 and 3 added an extra validation that validated if the requirement had no dependencies. Although this validation bypassed rule collision, it prevented rules 5, 6 and 7 of transforming requirements as use cases or actors, as these requirements have a dependency. To bypass this problem, additional helpers and called rules and have been created, being these:

|Helper|Description|
|------|-----------|
|`actors`|A map (String, UC!Actor) that maps transformed requirements as actors by their names|
|`useCases`|A map (String, UC!UseCase) that maps transformed requirements as use cases by their names|


|Called Rule|Description|
|-----------|-----------|
|`InsertRequirementAsActorInActorsMap`|Transforms a requirement in an actor and inserts transformed model in `transformedActors` map|
|`InsertRequirementAsUseCaseInUseCasesMap`|Transforms a requirement in an use case and inserts transformed model in `transformedUseCases` map|

Consecutively, it was also necessary to update rules 2,3,4,5,6 and 7 to also insert their transformed models in the respective sequences and maps. Rules 5 and 6 can now check if a given requirement has already been transformed, and if not respective called rule is called to transform the requirement. Then the transformed model is assigned in the association model.

The use of the map to store transformed models is necessary as ATL does not allow the access of output models information.

Now associations can be created with not rule collision issues, yet the requirements that are transformed as actors and use cases using the called rules are placed outside of the use case model. This is due to when these rules are called, the transformation scope is within the `association` sequence of the use case model. To prevent this placement, the following helpers have been created:

|Helper|Description|
|------|-----------|
|`transformedActors`|A sequence that contains all transformed requirements in actors|
|`transformedUseCases`|A sequence that contains all transformed requirements in use cases|
|`useCaseModel`|A reference to the use case model being transformed|

When a requirement is transformed as an actor or an use case, the output model is stored in the respective sequence and then assigned in the use case model being transformed, preventing that the output models are stored outside of the use case model.



## Grouping Use Cases with Requirement Group / Subject

It is possible to group use cases by following two approaches:

- Develop a different use cases DSL which allows the use of requirement groups to group use cases. A new model identified as `Subject` which has a name and is mapped by a requirement group. Subject could also contain inner use cases group models the same way as a requirement group can aggregate requirement groups. The introduction of a new model would require to update existing ATL transformations.
- Map requirement group as an use case inclusion. This will allow the definition of the requirement which includes other uses cases as the requirement group.


## Challenge

```
"It is possible to design a grammar for the use case DSL that may result in a situation were it is not required a transformation to generate a use case diagram from the DSL (using PlantUML)"
```

Transforming a textual requirements instance (DSL) to a use cases textual instance (DSL) is the same as coding a generator to create a string that represents a PlantUML diagram, as the final output is **text**. If we design a Use Cases DSL in which it uses PlantUML keywords, after applying the requirements transformation, the output should be a PlantUML string using use cases descriptors.

The following example describes a Use Cases DSL that represents a simple PlantUML use cases diagram:

```
UseCaseModel returns UseCaseModel:
	{UseCaseModel}
		('actor' '{' actor+=Actor ( "," actor+=Actor)* '}' )?
		('association' '{' association+=Association ( "," association+=Association)* '}' )?
		('usecase' '{' usecase+=UseCase ( "," usecase+=UseCase)* '}' )?;

Actor returns Actor:
	{Actor}
	'actor'
	name=EString;

Association returns Association:
		'('
    actor=[Actor|EString]
		') --> ('
    usecase=[UseCase|EString]
    ')';

UseCase returns UseCase:
	{UseCase}
  'usecase'
  ' ('
	name=EString
  ')';
```