package com.im.newcrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.newcrm.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
