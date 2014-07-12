# Standalone Example 3

The following application combines Spring, Hibernate, and MySQL to allow a user to access a database without a server.

## Preamble

This project extends my prevoius project.

>[ryankane/standaloneexample2](https://github.com/ryankane/standaloneexample2)

I added Spring-Data support and refactored the entity classes to extend an abstract base class.

## About

The application heavily uses autowiring to inject beans. The SERVICE layer is used to map DTO objects to their ENTITY counterparts which will then be sent to the DAO layer where spring-data's REPOSITORY interfaces will handle DATABASE CRUD operations.

### Project Dependencies

* Spring 3.2.6.RELEASE
* Hibernate 4.2.2.Final
* MySQL