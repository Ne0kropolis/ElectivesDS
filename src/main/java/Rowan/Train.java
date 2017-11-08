/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rowan;

/**
 *
 * @author dajew
 */
public class Train {
    String trainModel;
    int trainID;
    boolean trainAvailable;
    
    
    public Train(){
    
    }
    
    public Train(String model,int id,boolean avail){
    trainModel=model;
    trainID=id;
    trainAvailable=avail;
    }
    public void setTrainModel(String model){
    trainModel=model;
    }
    public void setTrainID(int id){
     trainID=id;
    }
    public void setTrainAvailable(boolean avail)
    {
    trainAvailable=avail;
    }
    public String getTrainModel()
    {
    return trainModel;
    }
    public int getTrainID(){
    return trainID;
    }
    public boolean getTrainAvailable()
    {
    return trainAvailable;
    }
   
}
