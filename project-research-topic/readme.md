# EDOM - Project Research Topic

In this folder you should add **all** artifacts developed for the investigative topic of the project.

There is only one folder for this task because it is a team task and, as such, usually there will be no need to create individual folders.

**Note:** If for some reason you need to bypass these guidelines please ask for directions with your teacher and **always** state the exceptions in your commits and issues in bitbucket.

## Introduction

This document, written in the context of EDOM (Engenharia de Dominio) curricular unit of MEI (Mestrado em Engenharia Informática) course at ISEP (Instituto Superior de Engenharia do Porto), presents an analysis of **MoDisco**. Firstly an introduction of MoDisco and MDRE will be detailed as well as how these two relate with each other. Then the benefits of using MoDisco and a pratical use case will be elaborated, expliciting how the domain and application engineering are applied. Lastly MoDisco alternatives will be presented.

## MoDisco

### What is MoDisco ?

MoDisco (Model Discovery) is a generic, extensible and global *MDRE* approach that provides a ready-to-use framework implemented on top of the Eclipse Platform as an official Eclipse Project [1].
It aims at supporting the reverse engineering of IT legacy systems which are to be updated by new developers who don't know its architecture.
Being a fully open source framework that relies only on generic components and thus providing extensibility for new technologies support, MoDisco differentiates from other MDRE technologies as these are built with specific language parsers, grammars and metamodels that are licensed as properietary. One of the biggest issues when working with legacy systems for organizations is the financial costs that it brings (passar esta parte dos custos para benefits of MoDisco)
**talvez mais algo aqui**

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

### Benefits of using MoDisco

### A pratical use case of MoDisco

### MoDisco alternatives


#### References

1 - https://www.researchgate.net/publication/261599648_MoDisco_a_Model_Driven_Reverse_Engineering_Framework, 27/11/2019
2- https://www.geeksforgeeks.org/software-engineering-reverse-engineering/