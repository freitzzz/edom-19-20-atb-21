# EDOM - Project Increment 3

## 1 - Transformation between Requirements and Use Cases 

To do this transformation, the requirements metamodel has been changed to ignores "RequirementGroup". Thus, the model became related to the requirements and not to the "RequirementGroup".

### Requirement2Actor

To transform a requirement to an actor we select the functional requirements (type = #FUNCTIONAL) that have at least one comment whose subject is "Actor" and that haven't comments whose subject is "UseCase". The name of the resulting actor will be the same as the title of the respective requirement.
In the "do" part of this rule we create for each requirement dependency an association between the actor transformed from the requirement and the usecases corresponding to the dependencies.


### Requirement2UseCase

To transform a requirement to an use case we select the functional requirements (type = #FUNCTIONAL) that haven't any comment or have at least one comment whose subject is "UseCase" and that haven't comments whose subject is "Actor". The name of the resulting use case will be the same as the title of the respective requirement.  
In the "do" part of this rule we create for each requirement dependency an "include" that will have as usecase field the usecase corresponding to the dependency. After that, we put in the "include" field of generated usecase, these "includes" created on previous "for each". To do this we use a helper called "dependencies".


### Model2UseCaseModel

Transforming the model into the use case model is very simple, because we transform all models into use case models by putting the use case model name equal to the model title. After that, we put in actor field of the use case model the generated actors and we put in usecase field the generated usecases. In the "do" part of this rule, we put in the association field of the use case model the associations created in rule NewAssociation, which were stored in a helper called "associations".


### NewAssociation

A rule has been defined to create a new association. This rule receive as parameters the name to the new association, that is the actor name plus "_" plus the use case name. The association also has an attribute pointing to the generated actor and an attribute pointing to the generated use case. 


### NewInclude

A rule has been defined to create a new "include". This rule receive as parameters two requirements. The name of the new "include" is the first requirement name plus "_" plus the second requirement name. The "include" also has an attribute pointing to the second requirement, which is the use case that matches the existing requirement in the dependencies of the first requirement.


## 2 - Transformation between Requirements and Use Cases which includes RequirementGroup and Subject

Answering the question posed in the goals of this assignment, yes, we could develop a transformation which includes RequirementGroup and Subject.
In this new transformation, we could transform RequirementGroups into Subjects and all the requirements of those RequirementGroups that would not be transformed into actors would be transformed into use cases and would be associated with the respective Subject.