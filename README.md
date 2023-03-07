```bash
docker build --build-arg VERSION_ID=1 -t lecture/app:0.0.1 .
```
```bash
docker build -f Dockerfile-multistage --build-arg VERSION_ID=2 -t lecture/app:0.0.1 .
```
```bash
docker run -it -d --env-file=.env -p8080:8080 lecture/app:0.0.1
```
```bash
docker-compose up --build --detach
```