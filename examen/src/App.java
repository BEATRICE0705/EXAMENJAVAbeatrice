import java.util.List;
import java.util.Scanner;

import entities.cours;
import entities.module;
import services.CourService;
import services.ModuleService;
import services.ProfesseurService;

public class App {
        public static void main(String[] args) throws Exception {
           int choix;
             Scanner sc=new Scanner(System.in);
            
            CourService courService=new CourService();
            ModuleService moduleService=new ModuleService();
            ProfesseurService professeurService=new ProfesseurService();
           
            do {
                System.out.println("1-Ajouter un module");
                System.out.println("2-Lister les modules"); 
                System.out.println("3-Creer un  Cour");
                System.out.println("4-Lister les cours"); 
                System.out.println("5-lister les cours d'un module et d'un professeur");
                System.out.println("6-Quitter"); 
                 choix=sc.nextInt();
                 sc.nextLine();
                 switch (choix) {
                case 1:
                     
                     System.out.println("nomModule");
                     String nomModule=sc.nextLine();    
                     module ml=new module();
                      
                      ml.setNomModule(nomModule);
                      moduleService.Ajoutermodule(ml);
                    break;
                
                case 2:
                    List<Module> modules=  moduleService.listerModule();
                     for (Module module: modules) {
                          System.out.println("nommodule"+ module.getName());
                          
                          System.out.println("=================================");
                     }
                    break;

                case 3:
                System.out.println("Entrer une date");
                String date=sc.nextLine();   
                System.out.println("Entrer le debut");
                String debut=sc.nextLine();
                System.out.println("Entrer la fin");
                String fin=sc.nextLine();
                cours cours=new cours();
                  cours.setDate(date);
                  cours.setFin(fin);
                  cours.setDebut(debut);
                  courService.creercours(cours);
               break;
            case 4:
               List<cours> Cour=  courService.listerCours();
               for ( cours cour: Cour) {
                    System.out.println("id "+ cour.getId());
                    System.out.println("date"+ cour.getDate());
                    System.out.println("fin"+ cour.getFin());
                    System.out.println("debut"+ cour.getDebut());
                    System.out.println("=================================");
               }
              break;
                 
            }           
           }  while (choix!=10);
        }
    }



