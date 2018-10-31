package com.tolunay.toprakkaya.etiya.repository;

import com.tolunay.toprakkaya.etiya.model.Process;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "processes", collectionResourceRel = "processes", exported = false)
public interface ProcessRepository extends JpaRepository<Process, String> {
}
