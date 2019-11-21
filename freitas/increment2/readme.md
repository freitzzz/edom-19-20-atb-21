# EDOM - Project Increment 2


In this folder you should add **all** artifacts developed for the project increment 2.

**Note:** If for some reason you need to bypass these guidelines please ask for directions with your teacher and **always** state the exceptions in your commits and issues in bitbucket.


## Generated XText Grammar Modifications

The MWE2 workflow generates an XText grammar for the existent requirements metamodel. Yet it is necessary to perform some adjustments to the grammar in order to be able to parse existing requirements XMI models as requirements DSL models, being these:

- Create custom terminals to detect strings that identify date times

  These terminals allow the detection of strings marked in single (') and double (") quotes, and detect if a string matches a date time matches one of the following formats:

  - `YYYY-MM-DD` (e.g. 2018-10-26)
  - `YYYY-MM-DDTHH:MM:SS` (e.g. 2018-10-26T18:51:52)
  - `YYYY-MM-DDTHH:MM:SS+Z` (e.g. 2018-10-26T18:51:52.009+0100)

- Update `Requirement` textual specification to be identified by its `name` field

  As a requirement can have dependencies, and each of these dependencies represents a reference to a requirement, XText needs to be able to identify a Requirement in order to compare which Requirement is to refer as a dependency. By default XText maps an EObject using the field `name`, which obliges the specification of this field in the grammar


Additionaly the grammar could be updated so that each model is proceeded by its identifier, as the identification of models is always required, as well as the introduction of a regular expression to identify enum literals values, as by default these are mapped in capital case.


## DSL Formatting

As seen in the code snippet below, the DSL is designed to be formatted similary as a JSON string, outputing inner models as a cascade.

```
Model {
  title 'Gorgeous Food Application'
  groups {
    RequirementGroup 'Functional Requirements' {
      description 'This group details GFA functional requirements.'
      id '0'
      requirements {
        Requirement 'Save Meal' {
          description 'Allows the creation and save of a meal'
          author 'EDOM'
          created '2019-11-04'
          id '0'
          version Version {
            major 0
            minor 0
            service 1
          }
        }
      }
    }
  }
}
```

In order to be able to output the DSL in this format it was necessary to add code that uses `Formatting2` API. For each open (`{`) and close (`}`) brackets, three conditions were added:
- Append a new line after the open bracket
- Indent the content contained in these brackets
- Append a new line before the closing bracket

Then for each field of the model being formatted it is necessary to append a new line before its keywords definition.

## Unit Tests

A set of unit tests were produced which allowed to test if the created DSL was following the rules defined in the DSL grammar. These were necessary to be implemented as the generated grammar for the DSL was modified to add support for a set of dates.
Additionaly unit tests that verified if the DSL definition was complying with the defined domain rules with the use of OCL.

The following table summarizes the implemented unit tests:

|Unit Test Signature|Description|
|-------------------|-----------|
|`modelThatCompliesWithDSLGrammarSucceedsParse`|Verifies that a model defined using the DSL grammar and that complies with its rules succeeds the DSL parse|
|`modelWithDateWhichIsNotRecognizedByDSLFailsParse`|Verifies that a model defined using the DSL grammar that has an unrecognized date fails the DSL parse|
|`modelWithDateInYYYYMMDDUsingSingleQuotesFormatSucceedsParse`|Verifies that a model defined using the DSL grammar that has a date in the `yyyy-MM-dd` format (e.g. 2019-01-01) and is contained in single quotes (') succeeds the DSL parse|
|`modelWithDateInYYYYMMDDTHHMMSSUsingSingleQuotesFormatSucceedsParse`|Verifies that a model defined using the DSL grammar that has a date in the `yyyy-MM-ddTHH:MM:SS` format (e.g. 2019-01-01T21:30:19) and is contained in single quotes (') succeeds the DSL parse|
|`modelWithDateInYYYYMMDDTHHMMSSZUsingSingleQuotesFormatSucceedsParse`|Verifies that a model defined using the DSL grammar that has a date in the `yyyy-MM-ddTHH:MM:SS+Z` format (e.g. 2019-01-01T21:30:19.000+0004) and is contained in single quotes (') succeeds the DSL parse|
|`modelWithDateInYYYYMMDDUsingDoubleQuotesFormatSucceedsParse`|Verifies that a model defined using the DSL grammar that has a date in the `yyyy-MM-dd` format (e.g. 2019-01-01) and is contained in double quotes (") succeeds the DSL parse|
|`modelWithDateInYYYYMMDDTHHMMSSUsingDoubleQuotesFormatSucceedsParse`|Verifies that a model defined using the DSL grammar that has a date in the `yyyy-MM-ddTHH:MM:SS` format (e.g. 2019-01-01T21:30:19) and is contained in double quotes (") succeeds the DSL parse|
|`modelWithDateInYYYYMMDDTHHMMSSZUsingDoubleQuotesFormatSucceedsParse`|Verifies that a model defined using the DSL grammar that has a date in the `yyyy-MM-ddTHH:MM:SS+Z` format (e.g. 2019-01-01T21:30:19.000+0004) and is contained in double quotes (") succeeds the DSL parse|
|`testNoModelDefinitionFailsParse`|Verifies that a string that has no model definition fails the DSL parse|
|`testModelWithNoTitleDefinitionFailsParse`|Verifies that a model that has no title defined fails the DSL parse|
|`testModelWithTitleLengthLessThanThreeFailsOCLCompliance`|Verifies that a model in which title length is less than three fails OCL compliance|
|`testModelWithTitleLengthGreaterOrEqualThanThreeSucceedsOCLCompliance`|Verifies that a model in which title length is greater or equal than three succeeds OCL compliance|
|`testRequirementGroupWithNameLengthLessThanFiveFailsOCLCompliance`|Verifies that a requirement group in which name length is less than five fails OCL compliance|
|`testRequirementGroupWithNameLengthGreaterOrEqualThanFiveSucceedsOCLCompliance`|Verifies that a requirement group in which name length is greater or equal than five succeeds OCL compliance|
|`testRequirementGroupWithoutDescriptionFailsOCLCompliance`|Verifies that a requirement group that has no description defined fails OCL compliance|
|`testRequirementGroupWithDescriptionLengthLessThanTenFailsOCLCompliance`|Verifies that a requirement group in which description length is less than ten fails OCL compliance|
|`testRequirementGroupWithDescriptionLengthGreaterOrEqualThanTenSucceedsOCLCompliance`|Verifies that a requirement group in which description length is greater or equal than ten succeeds OCL compliance|
|`testRequirementGroupWithSubRequirementGroupsWithSameNameFailsOCLCompliance`|Verifies that a requirement group that contains sub requirement groups with the same name as its parent fails OCL compliance|
|`testRequirementWithoutNameFailsParse`|Verifies that a requirement that has no name defined fails the DSL parse|
|`testRequirementWithTitleLengthLessThanFiveFailsOCLCompliance`|Verifies that a requirement in which name length is less than five fails OCL compliance|
|`testRequirementWithTitleLengthGreaterOrEqualThanFiveSucceedsOCLCompliance`|Verifies that a requirement in which name length is less than five succeeds OCL compliance|
|`testRequirementWithoutDescriptionFailsOCLCompliance`|Verifies that a requirement that has no description defined fails OCL compliance|
|`testRequirementWithDescriptionLengthLessThanTenFailsOCLCompliance`|Verifies that a requirement in which description length is less than ten fails OCL compliance|
|`testRequirementWithDescriptionLengthGreaterOrEqualThanTenSucceedsOCLCompliance`|Verifies that a requirement in which description length is greater or equal than ten succeeds OCL compliance|
|`testRequirementWithoutCreationDateFailsOCLCompliance`|Verifies that a requirement that has no creation date fails OCL compliance|
|`testRequirementWithoutAuthorFailsOCLCompliance`|Verifies that a requirement that has no author defined fails OCL compliance|
|`testRequirementWithAuthorLengthLessThanThreeFailsOCLCompliance`|Verifies that a requirement in which author length is less than three fails OCL compliance|
|`testRequirementWithAuthorLengthGreaterOrEqualThanThreeSucceedsOCLCompliance`|Verifies that a requirement in which author length is greater or equal than three succeeds OCL compliance|
|`testVersionWithMajorLowerThanZeroFailsOCLCompliance`|Verifies that a version in which major is lower than zero fails OCL compliance|
|`testVersionWithMinorLowerThanZeroFailsOCLCompliance`|Verifies that a version in which major is lower than zero fails OCL compliance|
|`testVersionWithServiceLowerThanZeroFailsOCLCompliance`|Verifies that a version in which major is lower than zero fails OCL compliance|
|`testCommentWithoutAuthorFailsOCLCompliance`|Verifies that a comment that has no author defined fails OCL compliance|
|`testCommentWithAuthorLengthLessThanThreeFailsOCLCompliance`|Verifies that a comment in which author length is less than three fails OCL compliance|
|`testCommentWithAuthorLengthGreaterOrEqualThanThreeSucceedsOCLCompliance`|Verifies that a comment in which author length is greater or equal than three succeeds OCL compliance|
|`testCommentWithoutBodyFailsOCLCompliance`|Verifies that a comment that has no body defined fails OCL compliance|
|`testCommentWithBodyLengthLessThanFifteenFailsOCLCompliance`|Verifies that a comment in which body length is less than fifteen fails OCL compliance|
|`testCommentWithBodyLengthGreaterOrEqualThanFifteenSucceedsOCLCompliance`|Verifies that a comment in which body length is greater or equal than fifteen succeeds OCL compliance|
|`testCommentWithoutSubjectFailsOCLCompliance`|Verifies that a comment that has no subject defined fails the OCL compliance|
|`testCommentWithSubjectLengthLessThanTenFailsOCLCompliance`|Verifies that a comment in which subject length is less than ten fails OCL compliance|
|`testCommentWithSubjectLengthGreaterOrEqualThanTenSucceedsOCLCompliance`|Verifies that a comment in which subject length is greater or equal than ten succeeds OCL compliance|
|`testCommentWithoutCreationDateFailsOCLCompliance`|Verifies that a comment that has no creation date defined fails OCL compliance|


## Custom MWE2 Workflow

A custom MWE2 workflow was implemented that performed a set of tasks, being these:

1. Read a requirements DSL file into memory, being the DSL file path the input parameter
2. Apply validations to model
3. Format the model
4. Save the model with the applied formatations
5. Generate a graphical diagram of the DSL

For task 1, two Java classes were conceived, `WorkflowComponentWithSlot` and `ResourceReader`. `WorkflowComponentWithSlot` allows the definition of a MWE2 workflow component that stores a string defined as `Slot`. `ResourceReader` has the responsibility of reading requirements DSL file, and allows the injection of the DSL file path as a class field. By defining this class as a WorkflowComponentWithSlot, it is now possible to receive a string that defines the read of the DSL action. Once the DSL is read, the requirements model is stored in the workflow content by mapping the requirements model object with the component slot. This will allow the access of the  requirements model object using the Workflow Context, by other workflow components defined for tasks 2, 3, 4 and 5.

In task 2, domain validations are applied using OCL. For this a class named `ModelValidator` was conceived which starts by initializing OCL dependencies. Once OCL is initialized and the model is obtained, validations are applied. If these validations are not successful, an `IllegalStateException` is thrown, which will interrupt the workflow.

Task 3 and 4 are both defined in a single Java class entitled as `DSLFormatterAndSaver`. This is due to XText only allows DSL formatation in its saving process. In order to format the DSL, a set of save options of passed as parameter in the DSL save method (`resource.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap());`).

Task 5 allows the generation of a PUML diagram file that represents the DSL as a graphical diagram. This PUML diagram can either be generated as a *Graphiz Dot Diagram* or an UML Object Diagram. In order to implement this decision, a Java class entitled as `GeneratePUMLDiagram` was created which allows the injection of a string that identifies the diagram type being generated. By using a `switch-case` statement, it is possible to compare this string with strings "circles" and "object". Before performing any comparision, the string is converted to lower-case. If the string matches "circles", a function is invoked that allows the generation of a graphviz diagram. If the string matches "object", a function is invoked that allows the generation of an object diagram. If string equality is not met an IllegalStateException is thrown in order to interrupt the workflow execution. These diagram generation functions are defined in two different classes that were implemented in increment 1, which take as input the requirements DSL file path and the path of the file that will contain the generated diagram.

This workflow can either be executed from Eclipse or the command-line as it is defined as a maven goal. It requires the following arguments to be passed:

- `dslFilePath` - Indicates the relative path for the requirements DSL being read
- `diagramType` - Indicates which diagram is to be generated. Can either be circles or object
- `diagramFilePath` - Indicates the relative path where the PUML diagram of the requirements DSL will be generated

```
mvn exec:java@MWE2CustomWorkflow -Dexec.args="src/requirements/dsl/ApplyValidationsFormatterToDSLAndGeneratePUMLDiagram.mwe2 -p dslFilePath= diagramType= diagramFilePath="
```

If no arguments are passed it uses the following default parameter values:

- dslFilePath=requirementsdsl2.rdsl
- diagramType=circles
- diagramFilePath=dsl_circles.puml

```
mvn exec:java@MWE2CustomWorkflow
```