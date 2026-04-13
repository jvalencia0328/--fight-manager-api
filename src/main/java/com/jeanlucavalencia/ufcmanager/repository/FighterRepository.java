package com.jeanlucavalencia.ufcmanager.repository;
import com.jeanlucavalencia.ufcmanager.entity.Fighter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FighterRepository extends JpaRepository<Fighter, Long> {
}
