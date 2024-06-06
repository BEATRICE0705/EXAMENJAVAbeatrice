package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.cours;

public class CoursRepositories {
    private List<cours> tCours=new ArrayList<>();
    
    public  List<cours> selectAll(){
       return tCours;

    

    }

    public  void insert(cours cours){
        tCours.add(cours);
     }
}
