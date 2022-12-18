package com.univlittoral.philippe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.univlittoral.philippe.entity.LivreEntity;


@Repository
public interface LivreRepository extends JpaRepository<LivreEntity, Long> {

}
