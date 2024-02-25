package org.example.Structures;

import lombok.*;

@Getter
@Setter
public class Resort extends BaseStructure{
    private boolean havePool;
    public Resort(Integer roomNumber, Integer squareMeter, Integer loungeNumber,Integer price,boolean havePool){
        super(roomNumber,squareMeter,loungeNumber,price);
        this.havePool=havePool;
    }

}
