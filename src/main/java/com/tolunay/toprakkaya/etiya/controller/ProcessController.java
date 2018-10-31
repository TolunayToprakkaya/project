package com.tolunay.toprakkaya.etiya.controller;

import com.tolunay.toprakkaya.etiya.model.Process;
import com.tolunay.toprakkaya.etiya.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/processes")
public class ProcessController {

    @Autowired
    @Qualifier("processService")
    private ProcessService processService;

    //FindAll
    @RequestMapping(method = RequestMethod.GET)
    public List<Process> findAll() {
        return processService.findAll();
    }

    //Save
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody Process process){
        processService.save(process);
    }

    //Update
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody Process process){
        processService.update(process);
    }

    //Delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        processService.delete(id);
    }

}
