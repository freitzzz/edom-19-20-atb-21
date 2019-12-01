# EDOM - Project Research Topic

In this folder you should add **all** artifacts developed for the investigative topic of the project.

There is only one folder for this task because it is a team task and, as such, usually there will be no need to create individual folders.

**Note:** If for some reason you need to bypass these guidelines please ask for directions with your teacher and **always** state the exceptions in your commits and issues in bitbucket.

## MoDisco

### What is MoDisco ?

MoDisco (Model Discovery) is a generic, extensible and global *MDRE* approach that provides a ready-to-use framework implemented on top of the Eclipse Platform as an official Eclipse Project [1].
It aims at supporting the reverse engineering of IT legacy systems which are to be updated by new developers who don't know its architecture.
Being a fully open source framework that relies only on generic components and thus providing extensibility for new technologies support, MoDisco differentiates from other MDRE technologies as these are built with specific language parsers, grammars and metamodels that are licensed as properietary. One of the biggest issues when working with legacy systems for organizations is the financial costs that it brings (passar esta parte dos custos para benefits of MoDisco)
**talvez mais algo aqui**

### What is MDRE ?

### What are MoDisco goals ?

### How MoDisco and MDRE relate with each other

### Extending MoDisco functionalities

### Benefits of using MoDisco

MoDisco facilitates the creation of reverse engineering solutions for software understanding, evolution, and modernization by providing an extensible, reusable model-based framework that makes it easy to understand legacy systems [2].
The metamodel-driven approach followed in MoDisco enables covering different levels of abstraction and satisfying several degrees of detail depending on the needs of the reverse engineering scenario. 
The use of MDE techniques allows the decomposition and automation of the reverse processes. They can be divided in smaller steps focusing on speciﬁc tasks, and be largely automated thanks to the appropriate chaining of corresponding MDE operations (notably model transformations). 
With MoDisco, the treatment of the potentially huge amount of concerned data can be simplified because the models of the systems are the elements actually processed rather than directly the systems themselves. The performance observed on the key MoDisco components are already acceptable for an industrial use in several concrete scenarios. 

### A pratical use case of MoDisco

MoDisco can be used to automate massive refactoring tasks on a large Java application in order to improve both performances or code readability.
To perform this refactoring, there is first reverse engineering from the input Java application by using the MoDisco Java metamodel and correspondig model discoverer. After that, exists a restructuring of the obtained application model thanks to model transformations in Java, and lastly, there is a forward engineering of the output Java application from this modified model by running the MoDisco Java generator.

### MoDisco alternatives


#### References

1 - https://www.researchgate.net/publication/261599648_MoDisco_a_Model_Driven_Reverse_Engineering_Framework, 27/11/2019
2 - https://ercim-news.ercim.eu/images/stories/EN88/EN88-web.pdf, 30/11/2019