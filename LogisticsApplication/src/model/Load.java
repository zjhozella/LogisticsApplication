/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author zjhoz
 */
public class Load {
    // Default constructor
    int truckNum   = 0;
    int trailerNum = 0;
    int storeNum   = 0;
    int sealNum    = 0;
    int driverNum  = 0;
    boolean loadComplete = false;
    //Need to input timestamps


    // Constructor for load class
    public Load (int truckNum, int trailerNum, int storeNum, int sealNum, int driverNum, boolean loadComplete){
        this.trailerNum   = newTrailerNum;
        this.truckNum     = newTruckNum;
        this.storeNum     = newStoreNum;
        this.sealNum      = newSealNum;
        this.driverNum    = newDriverNum;
        this.loadComplete = newLoadComplete;


    }
}
