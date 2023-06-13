package com.example.hrworker;

import com.example.hrworker.entities.Worker;
import com.example.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class HrWorkerApplication implements CommandLineRunner {

    @Autowired
    WorkerRepository workerRepository;

    public static void main(String[] args) {

        SpringApplication.run(HrWorkerApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Worker w1 = new Worker(1L, "Maria", 250.0);
        Worker w2 = new Worker(2L, "João", 200.0);
        Worker w3 = new Worker(3L, "Mariana", 300.0);

        workerRepository.saveAll(Arrays.asList(w1, w2, w3));

    }
}
