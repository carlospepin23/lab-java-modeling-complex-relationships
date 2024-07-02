package com.ironhack.repository;

import com.ironhack.model.EventManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventManagementRepository extends JpaRepository<EventManagement, String> {
}
