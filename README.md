# Start application

Start application with Elastic APM agent:

```shell
java -javaagent:java-monitoring/agent/elastic-apm-agent-1.36.0.jar \
-Delastic.apm.service_name=<service-name> \
-Delastic.apm.secret_token=<apm_token> \
-Delastic.apm.server_url=<elastic_url> \
-Delastic.apm.application_packages=it.lab.demo \
-jar target/apm-java-demo-<version>.jar
```

# Test API

Swagger UI url `http://<server>:<port>/lab/demo/swagger-ui/index.html`