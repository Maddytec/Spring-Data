package br.com.maddytec.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.maddytec.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}
