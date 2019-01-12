package net.riking.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.riking.entity.model.TAtcContent;

@Repository
public interface TAtcContentRepo extends JpaRepository<TAtcContent, Long> {
	

}
