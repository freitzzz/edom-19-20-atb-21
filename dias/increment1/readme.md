# EDOM - Project Increment 1

## Validations to the requirements metamodel

### Model

|  Validation                            |  Justification                                   |
|----------------------------------------|--------------------------------------------------|
|  Must have title                       |   A model should have a title to be identified   |

### RequirementGroup

|  Validation                                  |  Justification                                               |
|----------------------------------------------|--------------------------------------------------------------|
|  Must have name                              |   A RequirementGroup should have a name                      |
|  ID must exist                               |   RequirementGroup should have an ID                         |
|  ID must be unique                           |   The ID should be unique to identify the requirement group  |

### Requirement

|  Validation                         |  Justification                                                         |
|-------------------------------------|------------------------------------------------------------------------|
|  ID must exist                      | Should have an ID                                                      |
|  ID must be unique                  | The ID should be unique to identify the requirement                    |
|  Must have title                    | A Requirement should have a name                                       |
|  Must have created date             | Must have a creation date to identify when the requirement was created |

### Comment

|  Validation                              |  Justification                                                               |
|------------------------------------------|------------------------------------------------------------------------------|
|  Must have subject                       | A comment should have a subject to know what it is about                     |
|  Must have body                          | Comment must have body to be described                                       |
|  Must have author                        | The author must exist to identify who wrote the comment                      |
|  Must have created date                  | Must have a creation date to identify when the comment was created           |