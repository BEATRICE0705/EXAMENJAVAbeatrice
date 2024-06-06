package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.cours;
import entities.module;

public class ModuleRepositories {
    public  void insert(module module){
        tmodules.add(module);

     
     }   
        private List<module> tmodules=new ArrayList<>();
    //select
    public  List<module> selectAll(){
       return tmodules;
     }
}
