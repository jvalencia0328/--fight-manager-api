package com.jeanlucavalencia.ufcmanager.repository;

import com.jeanlucavalencia.ufcmanager.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long>  {
}
