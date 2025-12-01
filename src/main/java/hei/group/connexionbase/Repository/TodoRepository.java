package hei.group.connexionbase.Repository;

import hei.group.connexionbase.connexionbase.DataBaseConnexion;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {
private DataBaseConnexion db;

    public TodoRepository(DataBaseConnexion db) {
        this.db = db;
    }

}
