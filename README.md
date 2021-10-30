# CRUD-SpringBoot-MongoDB
Heyy Coders!!! My name is Shashwat Sharma and in this repository we will learn how to do CRUD Operation in Spring-boot framework. <br>
C - Create <br>
R - Read <br>
U - Update <br>
D - Delete <br>

## How to Connect MongoDB Atlas with Spring-boot Framework
I have explained in detail in this [repository](https://github.com/shashwat2910/MongoDB-SpringBoot) <br>
Just follow those steps

## If you are done connecting with it then just let's begin 

## Overview Of the API we are coding

|Methods   	|Urls   	|Actions   	|
|---	|---	|---	|
|POST   	|   /api/tutorials  	| create new Tutorial  	|
| GET  	| 	/api/tutorials  	|  	retrieve all Tutorials 	|
|   GET	|  /api/tutorials/:id 	| 	retrieve a Tutorial by :id	  	|
|   PUT	| /api/tutorials/:id  	| 	update a Tutorial by :id 	 	|
|   DELETE	|  	/api/tutorials/:id 	|  	delete a Tutorial by :id 	|
|  DELETE 	|   /api/tutorials	|  	delete all Tutorials 	|
|  GET 	|  /api/tutorials/published 	|  	find all published Tutorials 	|   

<br>
<br>

## Your directory
![](pics/img1.png)
<br>
The one with red dash file is where your whole logic of api code goes there.
<br>
The one with orange dash file is your model. It contains the detail you want to provide.
<br>
The one with blue dash file is your interface file. It extends the mongo repository model. 
<br>
The one with brown file JUST IGNORE it !!
<br>


# Tutorial.java the Model file

```
    @Id
    private String id;
    private String title;
    private String description;
    private boolean published;
```
- id: it contains individual object ID of every tutorial we make
- title : it contains the title of the tutorial
- description : it contains description of the tutorial
- published: it is a boolean value true or false. Whether the tutorial has been published yet or not
<br>

## Get and Set Method
```
public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
```
We are set for the model

# TutorialRepository.java interface
```
public interface TutorialRepository extends MongoRepository<ModelName, String>
```
Our Model is Tutorial
```
public interface TutorialRepository extends MongoRepository<Tutorial, String>
```




