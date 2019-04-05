package pn.example.apiserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pn.example.apiserver.entity.ExampleUser;

@Repository
public interface ExampleUserRepository extends JpaRepository<ExampleUser,Long>{

}