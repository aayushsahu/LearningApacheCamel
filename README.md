*Important gradle commands*
```bash
gradle clean build
gradle build
```

*For pulling active mq docker image and running it in docker*
```bash
docker pull rmohr/activemq
docker run -p 61616:61616 -p 8161:8161 rmohr/activemq

docker start 215d2d88c193
docker kill 215d2d88c193
docker remove 215d2d88c193
```