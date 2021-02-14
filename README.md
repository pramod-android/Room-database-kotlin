# Room-database-kotlin
Room database – Kotlin 
01.	Create database schema
02.	Insert data
03.	Read data 
04.	Update data
05.	Delete data
Room 
Build on top of Sqlite-open- helper class
Compile time verification of SQL queries
Less boilerplate code 
Easily integrated with other Architecture components
3 Main components
01.	@Entity
02.	@Dao
03.	@Database
Entity 
Represents a table within the database. Room create a table for each class that has @Entity annotation , the fields in the class corresponds to the columns in the table. Therefour, the entity classes tend to be small model classes that don't contain any logic.

Dao(Data access object)
DAOs are responsible for defining the methods that access the database. This is the place where we write our queries.

Database
Contain the database holder and serves as the main access point for the underlying connection to your app's data.




