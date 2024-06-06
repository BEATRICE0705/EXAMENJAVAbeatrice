package entities;

public class cours {
    private int id;
    private String date; 
    private String debut;
    public String getFin() {
        return fin;
    }
    public void setFin(String fin) {
        this.fin = fin;
    }
    private String fin;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDebut() {
        return debut;
    }
    public void setDebut(String debut) {
        this.debut = debut;
    } 
}
