## Repository with Eclipse Projects for EDOM Integration Project

Each team should download a copy of this repository and copy it inside their repository.

This is a Maven/Eclipse Multi-module project. The pom.xml file in the base folder includes all other projects as sub-modules.

You should create an empty Eclipse workspace.

You should then use **File/Import.../Existing Maven Projects** and select the base folder of this repository. This will import/open all the projects.

Note: The projects were created with **Eclipse Oxygen**. You should use **Eclipse Oxygen**!

You can build all the projects using Maven by executing **mvn clean install** in the base folder of the repository.

### Domain Engineering

This repository contains projects relating to 5 metamodels and their respective supporting projects:

  - the Metamodel project (pt.isep.edom.project.c?.mm.\*)
  - the DSL project (pt.isep.edom.project.c?.dsl.\*)
  - the ATL project (pt.isep.edom.project.c?.atl.\*)
  - the Acceleo project pt.isep.edom.project.c?.mtl.\*)

The metamodels/dsl are as follow:

  - **usecase**
  - **nav**
  - **rest**
  - **domain**
  - **dbase**  

### Application Engineering

There is also one project that uses the other projects to build an application, the **Gorgeous Food App**.

This project is named **pt.isep.edom.project.gorgeousfood**

This project can be imported and used in the **base** Eclipse (where all other projects are open) but its aim is to be imported and used in a second instance of Eclipse (that will have all the previous plugins active).  
