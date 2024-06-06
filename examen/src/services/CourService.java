package services;

import java.util.List;

import entities.cours;
import repositories.CoursRepositories;

public class CourService {
    public class courService {
    private CoursRepositories coursRepositories=new CoursRepositories();
    
  public List<cours> listerCours(){
      return coursRepositories.selectAll();
   }
   
   public void cours(cours cours){
    coursRepositories.insert(cours);
   }

}

    public List<cours> listerCours() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listerCours'");
    }

    public void creercours(cours cours) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creercours'");
    }

    
     
}
