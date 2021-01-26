# Week 7 SOA/MSA Topics

- [SOAP](https://www.w3.org/TR/2000/NOTE-SOAP-20000508/)
  - WSDL
    - definition, types, message, porttype, operation, binding, service, port
    - [Binding styles](https://www.ibm.com/support/knowledgecenter/SSFTBX_8.5.7/com.ibm.wbpm.wid.integ.doc/access/topics/rwsdlstyle.html)
  - Contract first/contract last
  - XML Namespaces
  - [JAX-WS](https://docs.oracle.com/javaee/6/tutorial/doc/bnayl.html)
  - [JAXB](https://www.oracle.com/technical-resources/articles/javase/jaxb.html)
  - SOAP Engine
    - [Apache CXF](https://cxf.apache.org/)
  - SOAP envelope
  - SOAP vs. REST

- SOA - Service Oriented Architecture

- MSA - Microservice Architecture
  - Advantages/disadvantages
  - [Microservices](https://martinfowler.com/articles/microservices.html)
  - [Architecture](https://dzone.com/articles/design-patterns-for-microservices)
  - [ACID vs BASE](https://www.dataversity.net/acid-vs-base-the-shifting-ph-of-database-transaction-processing/#)
  - Infrastructure Services
    - Gateway
      - [Zuul](https://github.com/Netflix/zuul/wiki)
        - Filters
        - Ribbon
    - Discovery & Registry
      - [Eureka](https://github.com/Netflix/eureka/wiki)
    - [Configuration](https://spring.io/guides/gs/centralized-configuration/)
    - Circuit Breaker
      - [Hytrix](https://github.com/Netflix/Hystrix/wiki/How-it-Works)
    - [Monitoring/Tracing](https://dzone.com/articles/microservices-part-6-distributed-tracing-with-spri)
    - [Message Broker/Queue](https://spring.io/guides/gs/messaging-rabbitmq/)

- [Containerization (Docker)](https://www.docker.com/)
- [Orchestration (Kubernetes)](https://kubernetes.io/)

- [PCF](https://run.pivotal.io/)
  - [Architecture](https://docs.cloudfoundry.org/)
  - [Components](https://docs.cloudfoundry.org/concepts/architecture/)
  - Web Console
  - Buildpacks
  - Custom Buildpacks
  - CLI
  - Services
  - Scaling
  - Containerization
    - Garden
