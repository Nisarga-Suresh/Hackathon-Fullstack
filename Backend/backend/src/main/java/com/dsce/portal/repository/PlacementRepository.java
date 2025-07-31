package com.dsce.portal.repository;

import com.dsce.portal.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long> {
    
    List<Placement> findByActive(Boolean active);
    
    List<Placement> findByActiveOrderByCreatedAtDesc(Boolean active);
    
    List<Placement> findByDeadlineAfter(LocalDate date);
    
    List<Placement> findByActiveAndDeadlineAfter(Boolean active, LocalDate date);
    
    List<Placement> findByCompanyNameContainingIgnoreCase(String companyName);
    
    List<Placement> findByPositionContainingIgnoreCase(String position);
    
    long countByActive(Boolean active);
}