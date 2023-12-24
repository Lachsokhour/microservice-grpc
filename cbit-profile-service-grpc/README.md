## Check App Matrics
```url
http://localhost:8085/actuator/metrics
```
![img.png](img.png)

## Check Specific Method
```url
http://localhost:8085/actuator/metrics/grpc.server.requests.received?tag=method:FindAll
```