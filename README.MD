# Study project

This project simulates a vehicle store with use cases as: Vehicle registration, Vehicle selling, report generation.

# Summary

- There are 3 microservices reponsible for business rule
- One api-gateway for security and load balancing
- Service discovery using Consul
- Kafka and Zookeeper as message broker
- NonRelational database MongoDB, to store selling records
- Relational database Postgres, to store vehicles information
- Redis as record cache
