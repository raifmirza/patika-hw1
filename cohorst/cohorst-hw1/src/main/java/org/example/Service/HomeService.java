package org.example.Service;

import org.example.Structures.BaseStructure;
import org.example.Structures.Flat;
import org.example.Structures.Resort;
import org.example.Structures.Villa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeService{
    private BaseService<Flat> flatService;
    private BaseService<Resort> resortService;
    private BaseService<Villa> villaService;

    private StructureBuilderService builds;

    public HomeService(BaseService<Flat> flatService, BaseService<Resort> resortService, BaseService<Villa> villaService, StructureBuilderService builds) {
        this.flatService = flatService;
        this.resortService = resortService;
        this.villaService = villaService;
        this.builds = builds;
    }

    public Integer flatSumPrice(){
        return flatService.sumPrice(builds.getFlatList());
    }
    public Integer resortSumPrice(){
        return resortService.sumPrice(builds.getResortList());
    }
    public Integer villaSumPrice(){
        return villaService.sumPrice(builds.getVillaList());
    }

    public Integer sumPrice(){
        return flatSumPrice()+resortSumPrice()+villaSumPrice();
    }

    public Double flatAvgSquareMeters(){
        return flatService.avgSquareMeter(builds.getFlatList());
    }
    public Double resortAvgSquareMeters(){
        return resortService.avgSquareMeter(builds.getResortList());
    }
    public Double villaAvgSquareMeters(){
        return villaService.avgSquareMeter(builds.getVillaList());
    }
    public Double avgSquareMeters(){
        return (flatAvgSquareMeters()+resortAvgSquareMeters()+villaAvgSquareMeters()) / 3;
    }
    public List<BaseStructure> filterByRoomAndLounge(int roomNumber, int loungeNumber){
        List<BaseStructure> filteredHouseList = new ArrayList<>();
        for (BaseStructure home : Stream.of(builds.getFlatList(),builds.getResortList(),builds.getVillaList()).flatMap(Collection::stream).collect(Collectors.toList())) {
            if (home.getLoungeNumber() == loungeNumber && home.getRoomNumber() == roomNumber) {
                filteredHouseList.add(home);
            }
        }
        return filteredHouseList;
    }

}
