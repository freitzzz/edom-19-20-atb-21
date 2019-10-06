# EDOM - Project Increment 1

## List of validations to the requirements metamodel

### Model

|  Validation                            |  Justification                                                                      |
|----------------------------------------|-------------------------------------------------------------------------------------|
|  Title must exist                      |   A model should have a title identify it among its peers                           |
|  Title must have at least 5 characters | In order to have a readable title for a model it should be at least five characters |

### RequirementGroup
- Id
    - Must exist
    - Must be unique
- Name
    - Must exist
    - Must have at least 5 characters
- Description
    - Must exist
    - Must have at least 10 characters

### Requirement
- Id
    - Must exist
    - Must be unique
- Title
    - Must exist
    - Must have at least 5 characters
- Description
    - Must exist
    - Must have at least 10 characters
- Created
    - Must exist
- Comments
    - All comments date creation date must be on the same day or after requirement creation date
- State and resolution
    - Cannot have invalid resolution with approved state
    - Cannot have invalid resolution with resolved state

### Comment

- Subject
    - Must exist
    - Must have at least 5 characters
- Body
    - Must exit
    - Must have at least 5 characters
- Author
    - Must exist
- Created
    - Must exist
