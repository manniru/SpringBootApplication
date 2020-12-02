cd /Users/mannir/esystems/SpringBootApplication/ServiceA
mvn clean && mvn package
docker image build -t servicea .


cd /Users/mannir/esystems/SpringBootApplication/ServiceB
mvn clean && mvn package
docker image build -t serviceb .

docker network rm servicea-serviceb
docker network create servicea-serviceb

docker container run --network servicea-serviceb --name servicea -p 10091:10091 -d servicea

docker container run --network servicea-serviceb --name serviceb -p 10092:10092 -d serviceb

http://localhost:10091/

microservice1


http://localhost:10091/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/service-a-ctrl/welcome
http://localhost:10092/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/service-a-ctrl/welcome