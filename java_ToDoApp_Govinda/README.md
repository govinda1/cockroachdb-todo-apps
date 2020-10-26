## Important note

Add the following header in a comment at the beginning of each source
file, and fill in your name and the year.

   Copyright [2020] [Govinda Dhirde]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

   Project

   Maven Project

   Language

   Java

   Spring Boot

   2.2.6

   Project Metadata

   Group: com.govinda
   Artifact: todoApp
   Name: todoApp
   Package name: com.govinda.todoApp
   Packaging: Jar
   Java: 8


   Create User Script:

   > CREATE USER IF NOT EXISTS maxroach;

   Create Database Script:

   > CREATE DATABASE todo_data;

   Grant all access for maxroach user on todo_data database; 

   > GRANT ALL ON DATABASE todo_data TO maxroach;

   Create table todo in todo_data DB.

   > CREATE TABLE IF NOT EXISTS todo (id INT PRIMARY KEY, description String, status String, createdDate Date, completedDate Date);

   Insert first record into database.

   > INSERT INTO todo (id, description, status, createdDate , completedDate) VALUES (1, 'First todo task', 'new','2020-10-25',null);

