# EDOM - Project Increment 1


In this folder you should add **all** artifacts developed for the project increment 1.

**Note:** If for some reason you need to bypass these guidelines please ask for directions with your teacher and **always** state the exceptions in your commits and issues in bitbucket.

## Requirements Metamodel Validations

For this metamodel, the following validations were proposed and implemented using OCL:

**Model** model

|Validation|Explanation|
|----------|-----------|
|Must have a title|A title identifies the model, so it is required for a model to have one|
|Title length must greater or equal than three (3)|This validation is imposed as a model represents a project. Projects are normally named with acronyms which length varies between [3, 10[|
|||

**Requirement Group** model

|Validation|Explanation|
|----------|-----------|
|Must have a name|A name identifies the group of requirements, so it is required for a requirement group to have one|
|Name length must greater or equal than five (5)|This validation is imposed as a way to promote better identification of groups (e.g. FR is less identifiable than Functional Requirements)|
|Must have a description|This validation grants that a requirement group is described|
|Description length must be greater or equal than ten (10)|This validation is imposed in order to promote higher quality of group descriptions|
|Cannot have Sub Requirements Group with same name|As a name identifies a group of requirements, it does not make sense to aggregate requirement groups which have the same identification|
|||

**Requirement** model

|Validation|Explanation|
|----------|-----------|
|Must have a title|A title identifies a requirement, so it is required for a requirement to have one|
|Title length must greater or equal than five (5)|This validation is imposed as a way to promote better identification of requirements (e.g. SMD is less identifiable than Show Meal Designation)|
|Must have a description|This validation grants that a requirement is described|
|Description length must be greater or equal than ten (10)|This validation is imposed in order to promote higher quality of requirements descriptions|
|State cannot be resolved if resolution is invalid|It is not possible for a requirement to be resolved/done if its resolution is invalid|
|State cannot be approved if resolution is invalid|It is not possible for a requirement to be approved if its resolution is invalid|
|State cannot be reviewed if resolution is invalid|It is not possible for a requirement to be reviewed/verified if its resolution is invalid|
|Must have a creation date|A requirement requires a creation date to be established|
|Must have an author|A requirement is created by an individual so its identification needs to be established|
|Author length must be greater or equal than three (3)|This is imposed in order to promote better identification of authors|
|||

**Version** model

|Validation|Explanation|
|----------|-----------|
|Major cannot be lower than zero (0)|This is imposed as to grant that version major numbers are not negative|
|Minr cannot be lower than zero (0)|This is imposed as to grant that version minor numbers are not negative|
|Service cannot be lower than zero (0)|This is imposed as to grant that version service numbers are not negative|
|||

**Comment** model

|Validation|Explanation|
|----------|-----------|
|Must have an author|A comment is made by an individual so its identification needs to be established|
|Author length must be greater or equal than three (3)|This is imposed in order to promote better identification of authors|
|Must have a body|This validation grants that a comment is described|
|Body length must be greater or equal than fifteen (15)|This validation is imposed in order to promote higher quality of comments|
|Must have a subject|A subject identifies a comment, so it is required for a comment to have one|
|Subject length must be greater or equal than ten (10)|This validation is imposed in order to promote better identification of comments|
|Must have a creation date|A comment requires a creation date to be established|
|||

## Representations for Requirements Diagram

For the requirements metamodel two possible diagram representations using *[Plant UML](http://plantuml.com/)* were studied and implemented.

The first representation is very similar to the one used to represent the mindmap metamodel, which uses **Graphviz**. This representation represents each model using circles, and connects each one of the models using an arrow, as seen in **Figure 1**.

![FIGURE_1](requirements/instances/puml_images/circles.svg)
<center><i>Figure 1 - Gorgeous Food Application requirements visualization using Graphviz</i></center>

Even though this representation displays all requirements models, it lacks support in differentiating models and their properties. For example, an individual which does not know anything about the *Gorgeous Food Application* wouldn't properly recognize that *Manage Meals* and *Manage Unserved Meals* were two different **requirement groups**. This recognition is also affected due to models properties not being represented in the diagram.

In order to improve the lack of comprehension in requirements metamodel, an alternative diagram representation was implemented using an [*object diagram*](http://plantuml.com/object-diagram) as seen in **Figure 2**.

![FIGURE_2](requirements/instances/puml_images/object_diagram_with_descriptions.svg)
<center><i>Figure 2 - Gorgeous Food Application requirements visualization using object diagram</i></center>

In this representation it is now possible to identify each model property as models are now UML objects. Also, the recognition of requirements models is now more clear as the initials of each model are explicit in object headers.

## Possible Problems on the Coding of Diagrams Generation

The generation of *mindmap* and *requirements* metamodels is done by transforming a model instance into a PlantUML file which contains the diagram syntax. This transformation is done using a **Java** program that enables the use of EMF libraries and follows a set of steps as seen below:

1. Create a [*resource set*](http://download.eclipse.org/modeling/emf/emf/javadoc/2.5.0/org/eclipse/emf/ecore/resource/ResourceSet.html) of the model instance to retrieve the model
2. Create a string containing the diagram PlantUML syntax by reading model values
3. Write the string to a file

**Step 1** requires the use of resource sets which is an in-memory representation of a metamodel. As seen in **Code Snippet 1**,to create this resource set, it is necessary to indicate the framework which resource factory is to be used to read the model instance. The generator uses a factory of instances that are represented using the **XMI** notation, which files extension are identified by `.xmi`. If the model instance being transformed is not a XMI document or does not comply with the file extension, an exception is thrown and the program is terminated.

After the creation of the resource set it is necessary to load the model and retrieve it as an *EObject* and to parse the object as a metamodel model object. The program always parses the object as the metamodel *root model*. For example in the mindmap generator, it parses the object as a *Map* model and in the requirements generator it parses as a *Model* model. This parse is only successful if the root of the model instance is in fact the metamodel root model. If not an exception is thrown and the program is terminated.

In **Step 2**, it is expected that the model instance complies with the metamodel validations which are implemented in OCL. If not it is possible that an exception is thrown as the program tries to read values from *null* models.


```
Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

// Initialize the model
RequirementsPackage.eINSTANCE.eClass();

// Obtain a new resource set
ResourceSet resSet = new ResourceSetImpl();

Resource resource = resSet.getResource(URI.createURI(requirementsInstanceAsFile.getAbsolutePath()), true);

// now load the content.
PrintWriter writer=null;
try {
  resource.load(Collections.EMPTY_MAP);

  EObject root = resource.getContents().get(0);
  Model loadedModel=(Model)root;

  ...
```
<center><i>Code Snippet 1 - Retrieving the root model of a requirements model instance</i></center>