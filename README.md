# Netty 5.0 UDP Echo Server

### Bootstrap Server
```
gradlew :server:run -PappArgs="['8080']"
```
### Bootstrap Client
```
gradlew :client:run -PappArgs="['127.0.0.1', '8080']"
```