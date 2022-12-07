# Database
docker run --name ms-postgres -e "POSTGRES_PASSWORD=123456" -p 5432:5432 -d postgres 
    - docker exec -it ms-postgres bash 
    - psql -U postgres 
    - CREATE DATABASE dbveiculo 

docker run --name ms-postgres -e POSTGRES_PASSWORD=123456 -d postgres
# Redis
docker run --name ms-redis -p 6379:6379 -d redis

# Kafka start
$(KAFKA_DIR)/bin/zookeeper-server-start.sh config/zookeeper.properties
$(KAFKA_DIR)/bin/kafka-server-start.sh config/server.properties

# Kafka analysis
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic kafka_test_topic

# Consul (Service Discovery)
docker run -p 8500:8500 -d consul 
