## Micronaut 3.1.1 Documentation

- [User Guide](https://docs.micronaut.io/3.1.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.1.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.1.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---
## Feature jdbc-hikari documentation

- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)
## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

docker build -f Dockerfile -t demo.api .

docker-compose -f docker-compose.yml up --build

docker run --name demo.api -d -p 8080:8080 -e APP_URL=jdbc:postgresql://host.docker.internal:5432/demo -e APP_USERNAME:postgres -e APP_PASSWORD:paula@123 demo.api

docker run --name demo.api -d -p 8080:8080 -e APP_URL=jdbc:postgresql://18.188.225.236:5432/demo -e APP_USERNAME:postgres -e APP_PASSWORD:paula@123 ruy0jr0duarte/demo.api