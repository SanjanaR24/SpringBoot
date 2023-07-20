package com.example.demo.repository;

import com.example.demo.entity.LeadDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadDetailsRepository extends JpaRepository<LeadDetail, Long>
{


}