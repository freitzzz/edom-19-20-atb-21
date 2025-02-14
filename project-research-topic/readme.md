# EDOM - Project Research Topic


## Introduction

This document, written in the context of EDOM (Engenharia de Dominio) curricular unit of MEI (Mestrado em Engenharia Informática) course at ISEP (Instituto Superior de Engenharia do Porto), presents an analysis of **MoDisco**. Firstly an introduction of MoDisco and MDRE will be detailed as well as how these two relate with each other. Then the benefits of using MoDisco and a pratical use case will be elaborated. Lastly MoDisco alternatives will be presented.

## MoDisco

### What is MoDisco ?

MoDisco (Model Discovery) is a generic, extensible and global *MDRE* approach that provides a ready-to-use framework implemented on top of the Eclipse Platform as an official Eclipse Project [1].
It aims at supporting the reverse engineering of IT legacy systems which are to be updated by new developers who don't know its architecture.
Being a fully open source framework that relies only on generic components and thus providing extensibility for new technologies support, MoDisco differentiates from other MDRE technologies as these are built with specific language parsers, grammars and metamodels that are licensed as properietary.

### What is MDRE ?

MDRE (Model Driven Reverse Engineering) is the process of applying MDE (Model Driven Engineering) principles and techniques to reverse engineering in order to generate relevant model-based views of a system whose architecture is unknown (e.g. legacy systems). Reverse Engineering in software is the process of recreating the design of the software based on its artifacts (executables, code, documentation) [2].
It differs from *forward engineering* in the sense that forward engineering intends to use software design to create software implementations. MDRE aims to build and use models from the system implementation (using MDE), creating high-level views such as domain and object models, in order to improve maintenance and evolution processes [1].
Thus it is possible to benefit from MDRE in MDSE (Model Driven Software Evolution) processes.
As an example, imagine that a consulting company hires a team of developers to maintain a really old software (legacy system) that has no documentation, doesn't follow common language conventions and does not apply any design patterns. At first this might look like an impossible job, yet if the team applies MDRE processes, it will be able to generate proper views of the software, which will be useful to analyze this one and to mark a starting point of the maintenance.


### How MoDisco and MDRE relate with each other

As a high-level framework, MoDisco aims to provide support for the main challenges that MDRE proposes to provide solution, being these:

- Avoid information loss due to the heterogeneity of legacy systems: Being a process to identify the *unknown* all information is relevant and it is very important that no pieces of information are discarded, even if these don't match a common pattern;

- Improve comprehension of the legacy system: Whatever the intention of the reverse engineering process is, the first goal is to be able to understand what the system does. To do such, MDRE aims to provide high abstract views of the system that provide the most relevant information instead of simple low-level representations such as code traceability;

- Manage scalability: Typically targeted legacy system are very huge and complex systems, occupying larges amounts of data. A MDRE tool must be able to load, query and transform the systems with no issues and in reduced time;

- Adapt/Port existing solutions to different needs: MDRE solutions must be agnostic of the technology, as focusing on a single legacy techonology closes the door for future legacy techonologies. Also these solutions must be transversal to any reverse engineering scenarios.

MoDisco does not provide a complete solution for all specific reverse engineering scenarios, yet its goal is to provide basic blocks that interconnect with each other to build any MDRE solution on top of it. In order to do such, MoDisco tries to overcome the challenges above by identifying the main steps and components commonly used in MDRE solutions and then assembles these in a generic and extensible approach. This approach takes into account a set of characteristics, being these:

- Genericity: By using technology-independent standards such as metamodels and customized model-based components. Specific technology details is supported by integration additional dedicated features into the generic ones;

- Extensibility: By decoupling the represented information as models and the different consecutive process steps as MDE operation workflows;

- Full Coverage: If necessary to fully cover the source artefacts, multiple views of the system with different abstraction levels that use different viewmodels, are conceived;

- Facilated Automation: By using already available MDE techniques, parts of the MDRE process are easily automated.

These characteristics are achieved by focusing on a homogeneous world of models instead than a heterogeneous world of legacy system, as the first principle to immediately get initial models that represent the artifacts of the legacy system. These models are sufficiently accurate to be used as a starting point of the MDRE scenario which MoDisco is being used as they are the input for any MDE operation.

In Figure 1 it is possible to observe the proposed architectural stack for MDRE that MoDisco implements. It consists in three layers, that have separate responsibilities, in which the Infrastructure and Technologies layers represent the domain engineering and the Use Cases Layer represents the application engineering. 

![modisco_mdre_architectural_stack](images/modisco_mdre_architectural_stack.png)
<center>Figure 1 - MDRE Framework Architectural Stack</center>

Starting from the bottom we have the **Infrastructure Layer** that provides genericity and automation that are completely independent from the technology or reverse engineering scenario which the MDRE process is being used for. The implementation of this layer consists of generic metamodels (e.g. OMG KDM), viewpoints and model transformations.

In the middle it is possible to find the **Technologies** Layer, that consists in a set of technology-dedicated components that are agnostic of the reverse engineering scenarios (e.g. Java metamodel).

Finally in the **Use Cases Layer** it can be found the components that are related to reverse engineering scenarios (e.g. Java source code refactoring).

An implementation example of the framework can be found below in Figure 2.

![modisco_mdre_architectural_stack_implementation](images/modisco_mdre_architectural_stack_implementation.png)
<center>Figure 1 - MDRE Framework Architectural Stack</center>

### Benefits of using MoDisco

MoDisco facilitates the creation of reverse engineering solutions for software understanding, evolution, and modernization by providing an extensible, reusable model-based framework that makes it easy to understand legacy systems [3].

The metamodel-driven approach followed in MoDisco enables covering different levels of abstraction and satisfying several degrees of detail depending on the needs of the reverse engineering scenario. 

The use of MDE techniques allows the decomposition and automation of the reverse processes. They can be divided in smaller steps focusing on speciﬁc tasks, and be largely automated thanks to the appropriate chaining of corresponding MDE operations (notably model transformations). 

With MoDisco, the treatment of the potentially huge amount of concerned data can be simplified because the models of the systems are the elements actually processed rather than directly the systems themselves. The performance observed on the key MoDisco components are already acceptable for an industrial use in several concrete scenarios.

One of the biggest issues when working with legacy systems reverse engineering for organizations is the financial costs that it brings due to acquisition of specific technology MDRE licenses. MoDisco removes this problem as it is a completely open-source solution that allows the extensibility of the supported technologies by either:
- Complementing the **Use Cases Layer** with other MoDisco components combination, in order to support different MDRE processes;
- Complementing the **Technologies Layer** in order to add support for a specific technology; 
- Directly work on the **Infrastructure Layer**.

### A pratical use case of MoDisco

MoDisco can be used to automate massive refactoring tasks on a large Java application in order to improve both performances or code readability.
To perform this refactoring, there is first reverse engineering from the input Java application by using the MoDisco Java metamodel and correspondig model discoverer. After that, exists a restructuring of the obtained application model thanks to model transformations in Java as seen below in Figure 3.

![model_browser_refactoring](images/model_browser_refactoring.png)
<center>Figure 3 - Discovered and restructured model</center>

Lastly, there is a forward engineering of the output Java application from this modified model by running the MoDisco Java generator as seen in Figure 4.

![code_refactoring](images/code_refactoring.png)
<center>Figure 4 - Before and After code refactoring</center>


### MoDisco alternatives

Although that MoDisco authors have mentioned that there are licensed and proprietary MDRE approaches [1], we were only able to find one alternative which is:

- XIS-Reverse: A Model-Driven Reverse Engineering Approach for Legacy Information Systems [4]

#### References

1 - https://www.researchgate.net/publication/261599648_MoDisco_a_Model_Driven_Reverse_Engineering_Framework, 27/11/2019

2- https://www.geeksforgeeks.org/software-engineering-reverse-engineering/, 01/11/2019

3 - https://ercim-news.ercim.eu/images/stories/EN88/EN88-web.pdf, 30/11/2019

4 - https://fenix.tecnico.ulisboa.pt/downloadFile/1407770020545952/dissertation%20-%20Final2.pdf, 01/12/2019