# tools-app
SpringBoot REST API CRUD &amp; H2 SimpleApp
You can Create,Read,Update,Delete "tool" object with id, name, and validate_date and store them in H2 database (or edit application.properties and use mysql db engine (spring libraries for MySQL are included)
Test it on [Heroku]: https://tool2-app.herokuapp.com/

App on start creates two instances of TOOL's and add it to H2 Database
You can list them with https://tool2-app.herokuapp.com/api/tools/all or on your localhost/api/tools/all

## How to use the CURD API
Api is availabe at [api/tools]: https://tool2-app.herokuapp.com/api/tools

### You can 
#### List all with GET
list all items in database with /api/tools/all 
https://tool2-app.herokuapp.com/api/tools/all

#### List one item with with GET
https://tool2-app.herokuapp.com/api/tools/?index=[tool_index]

#### Add new with POST
on https://tool2-app.herokuapp.com/api/tools with JSON
```
Example JSON body:
{
    "name": "New Tool",
    "validateTo": "2021-06-11"
}
```
#### Modify with PUT
on https://tool2-app.herokuapp.com/api/tools
Example JSON body:
```
{
    "id": 1,
    "name": "Tool_new_name_1",
    "validateTo": "2021-06-11"
}
```
#### Delete with DELETE
https://tool2-app.herokuapp.com/api/tools/?index=[tool_index]
