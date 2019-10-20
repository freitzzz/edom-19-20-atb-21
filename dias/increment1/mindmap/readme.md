# EDOM - Modeling

This is an Eclipse project that should be used as an example for the **Modeling Assignment** (project increment 1) of the EDOM course.

## Description

This project aim is to develop a modeling environment for creating and manipulating **mind map models**. These models will be used as conceptual models that capture very early requirements in a **didactic** *model-driven* software development process.

## Requirements

This is project has been tested with Eclipse Oxygen (package modeling).

We suggest also you install all additional Eclipse modeling components. See Eclipse/Help/"Install Modeling Components".

You should also make sure your Eclipse has the following plugins installed: 
- Plantuml (see [PlantUML](http://plantuml.com)) 
- Asciidoc (See Eclipse/Help/"Eclipse Marketplace..." and search for Asciidoc)

## Running the project without Eclipse

This project includes a file "run-tasks/build.xml" that is an Ant build file that exemplifies how to run the code outside Eclipse.

You need to have Ant installed in your system to run this example.

## Structure of the Project

The Project is a **Modeling Project**.

In the *model* folder you find the *mindemap.ecore* file that contains the metamodel for mind maps models. *Mindmap.aird* is the file that contains the diagram representation of the *mindmap.ecore*. *Mindmap.genmodel* contains specifics for the code generation.

To generate the code for the model open *mindmap.genmodel* and right click in the root element. Select "Generate Model Code" or "Generate All". The code is generated in the folder *src-gen* of the mindmap project. Other projects can be generated (i.e., mindmap.edit and mindmap.editor).

In the folder *src* you find code that exemplifies how to programmatically create and save a mindmap model (i.e., SaveModel.java) and how to load a mindmap model and programmatically generate a visual diagram (i.e., GenerateDot) representing diagram for the mind map (using PlantUML). For the diagram a plantuml textual file describing the mind map diagram is generated. When these files are opened in Eclipse the PlantUML and the Asciidoc plugins are able to display the diagrams.  

These two examples can be executed with Ant using the file "run-tasks/build.xml".

## Setup

You should update "run-tasks/build.xml" to match your installation. Take particular attention to the variables **ECLIPSE_HOME** and **ECLIPSE_WORKSPACE** and also to the list o libraries **run.libraryclasspath**.



 
