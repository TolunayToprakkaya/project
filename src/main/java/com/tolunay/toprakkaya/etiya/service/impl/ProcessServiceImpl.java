package com.tolunay.toprakkaya.etiya.service.impl;

import com.tolunay.toprakkaya.etiya.model.Process;
import com.tolunay.toprakkaya.etiya.repository.ProcessRepository;
import com.tolunay.toprakkaya.etiya.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("processService")
public class ProcessServiceImpl implements ProcessService {

    @Autowired
    private ProcessRepository processRepository;

    @Override
    public List<Process> findAll() {
        return this.processRepository.findAll();
    }

    @Override
    public Optional<Process> findOneById(String id) {
        return this.processRepository.findById(id);
    }

    @Transactional
    @Override
    public Process save(Process process) {
        return this.processRepository.save(process);
    }

    @Transactional
    @Override
    public Process update(Process process) {
        return this.processRepository.save(process);
    }

    @Transactional
    @Override
    public void delete(String id) {
        this.processRepository.deleteById(id);
    }
}
