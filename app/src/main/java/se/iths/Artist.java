package se.iths;

public class Artist {
    private final long id;

    private String name;

    public Artist(long id, String name){
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return id + " -> " + name;
    }
}

