https://spring.io/guides/gs/accessing-mongodb-data-rest/

Install MongoDB here:

> sudo apt-get install mongodb-server 

Start the mongo service
> sudo service mongodb start

Launch the mongo client
> mongo

Stop the mongo service
> sudo service mongodb stop

Run
> ./gradlew bootRun

Test
> curl http://localhost:8080
> curl http://localhost:8080/people
> curl -i -X POST -H "Content-Type:application/json" -d '{  "firstName" : "Frodo",  "lastName" : "Baggins" }' http://localhost:8080/people
> curl http://localhost:8080/people/search
> curl http://localhost:8080/people/search/finByLastName?name=Baggins

Uninstall
> sudo apt-get remove mongodb-server

