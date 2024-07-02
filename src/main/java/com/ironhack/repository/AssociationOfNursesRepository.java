package com.ironhack.repository;
import com.ironhack.model.AssociationOfNurses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationOfNursesRepository extends JpaRepository<AssociationOfNurses, String> {

}
