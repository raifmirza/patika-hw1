package org.example.Structures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Flat extends BaseStructure{
    private int floorNumber;
    public Flat(Integer roomNumber,
    Integer squareMeter,
    Integer loungeNumber,Integer price,int floorNumber){
        super(roomNumber,squareMeter,loungeNumber,price);
        this.floorNumber=floorNumber;
    }
}
