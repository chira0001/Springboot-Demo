package com.demo.demo.service;

import com.demo.demo.model.Restuarent;
import com.demo.demo.repository.RestuarentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestuarentService {

    @Autowired
    private RestuarentRepository restuarentRepository;

    public List<Restuarent> getAllRestuarent (){
        return restuarentRepository.findAll();
    }

    public Restuarent getRestuarentById(Integer id){
        return restuarentRepository.findById(id).orElse(null);
    }

    public void deleteRestuarentById(Integer id){
        restuarentRepository.deleteById(id);
    }

    public void saveRestuarent(Restuarent restuarent){
        restuarentRepository.save(restuarent);
    }
}
