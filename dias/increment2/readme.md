# EDOM - Project Increment 2

## The formatting added to the requirements DSL

### Model

A new line is added after the "{" keyword and all content inside the "{" and "}" keywords is indented. Each of the Model's Requirement Group is traversed to be formatted, and a new line is added before and after each Requirement Group formatting. At the end of Model, before the "}" keyword, a new line is added.

### RequirementGroup

Requirement Group formatting is very similar to that of Model. Also formatted in the same way as Model are all Requirement Group children that can be Requirement Group and Requirements.

### Requirement

In Requirement all Comments of Requirement are formatted and then a new line is added between the "{" and "}" keywords for the Requirement Version and then the contents of Version are indented.

### Comment

In Comment a new line is added between the "{" and "}" keywords and then the comment content is indented.


## The unit tests added to the requirements DSL

The test validates a Model in text. If this Model is wrong, the test will show this error. For example, if the model has a requirement that the "created" field does not conform to the date format of the created string to date converter, the test will give an error.