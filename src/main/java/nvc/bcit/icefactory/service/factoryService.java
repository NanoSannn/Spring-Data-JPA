package nvc.bcit.icefactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.icefactory.model.factory;
import nvc.bcit.icefactory.repository.factoryRepository;

@Service
public class factoryService {
    @Autowired
    factoryRepository repository;

    public List<factory>findAll(){
        return repository.findAll();
    }

    public factory getById(int id){
        return repository.getById(id);
    }
}
