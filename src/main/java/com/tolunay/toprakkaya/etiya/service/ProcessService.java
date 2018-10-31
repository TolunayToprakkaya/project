package com.tolunay.toprakkaya.etiya.service;

import com.tolunay.toprakkaya.etiya.model.Process;

import java.util.List;
import java.util.Optional;

public interface ProcessService {

    List<Process> findAll();
    Optional<Process> findOneById(String id);
    Process save(Process process);
    Process update(Process process);
    void delete(String id);

}
