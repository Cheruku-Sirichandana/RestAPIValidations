package com.SpringBoot.RestAPIValidations.Repository;


import com.SpringBoot.RestAPIValidations.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
