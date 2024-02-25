package org.example;

import org.example.Service.BaseService;
import org.example.Service.HomeService;
import org.example.Service.StructureBuilderService;
import org.example.Structures.Flat;
import org.example.Structures.Resort;
import org.example.Structures.Villa;

public class Main {
    public static void main(String[] args) {
        BaseService<Flat> flatService = new BaseService<>();
        BaseService<Resort> resortService = new BaseService<>();
        BaseService<Villa> villaService = new BaseService<>();
        StructureBuilderService builderService = new StructureBuilderService();
        HomeService homeService = new HomeService(flatService,resortService,villaService,builderService);

        System.out.println("Flats sum price: " + homeService.flatSumPrice());
        System.out.println("Resorts sum price: " + homeService.resortSumPrice());
        System.out.println("Villas sum price: " + homeService.villaSumPrice());
        System.out.println("Sum prices: " + homeService.sumPrice());
        System.out.println("Flats avg square meters: " + homeService.flatAvgSquareMeters());
        System.out.println("Resorts avg square meters: " + homeService.resortAvgSquareMeters());
        System.out.println("Villas avg square meters: " + homeService.villaAvgSquareMeters());
        System.out.println("Avg square meters: " + homeService.avgSquareMeters());

    }


}