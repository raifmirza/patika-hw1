package org.example.Service;

import org.example.Structures.Flat;
import org.example.Structures.Resort;
import org.example.Structures.Villa;

import java.util.ArrayList;
import java.util.List;



public class StructureBuilderService {
    private List<Flat> flatList;
    private List<Resort> resortList;
    private List<Villa> villaList;

    public StructureBuilderService(){
        flatList = new ArrayList<>();
        resortList = new ArrayList<>();
        villaList = new ArrayList<>();
        flatList.add(new Flat(5,100,1,233232,13));
        flatList.add(new Flat(3,113,0,212345,9));
        flatList.add(new Flat(2,1003,2,100000,1));
        resortList.add(new Resort(12,13212,4,250000,true));
        resortList.add(new Resort(15,11234,3,2750000,false));
        resortList.add(new Resort(13,4343,6,450000,true));
        villaList.add(new Villa(23,7643,5,1250000,true));
        villaList.add(new Villa(28,76433,12,2250000,false));
        villaList.add(new Villa(13,8532,6,3250000,true));
    }

    public List<Flat> getFlatList(){
        return flatList;
    }
    public List<Resort> getResortList(){
        return resortList;
    }

    public List<Villa> getVillaList(){
        return villaList;
    }

}



