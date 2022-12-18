package com.univlittoral.philippe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.univlittoral.philippe.entity.AuteurEntity;
import com.univlittoral.philippe.enums.TypeEnum;

@Repository
public interface AuteurRepository extends JpaRepository<AuteurEntity, Long> {
	@Query(value = "SELECT p from AuteurEntity p where type = :type")
	List<AuteurEntity> findByType(@Param("type") final TypeEnum type);
}
