package pl.bydgoszcz.ciecierski.dockerluczniczqa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerLuczniczqaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerLuczniczqaApplication.class, args);
    }

}

/*
localhost:8080/luczniczqa

docker
localhost:1505/luczniczqa
15.05 - deadline konkursu

docker build -f Dockerfile -t luczniczqa:v1 .



 */