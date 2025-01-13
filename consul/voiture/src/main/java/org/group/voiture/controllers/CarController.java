package org.group.voiture.controllers;

import  org.group.voiture.models.CarResponse;
import org.group.voiture.services.CarFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/voiture")
public class CarController {

    @Autowired
    private CarFeignService carFeignService;

    @GetMapping("/all")
    public List<CarResponse> findAllFeignClient() {
        return carFeignService.findAll ();
    }

    @GetMapping("/{id}")
    public CarResponse findByIdFeignClient(@PathVariable Long id) throws Exception{
        return carFeignService.findById (id);
    }

}