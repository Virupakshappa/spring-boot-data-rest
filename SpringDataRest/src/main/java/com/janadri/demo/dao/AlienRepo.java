package com.janadri.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.janadri.demo.model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens",path="alien")
public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
