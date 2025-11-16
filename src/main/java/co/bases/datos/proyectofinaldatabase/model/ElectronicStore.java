package co.bases.datos.proyectofinaldatabase.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ElectronicStore {
    private static ElectronicStore singleton;
    private User currentUser;

    public static ElectronicStore getSingleton() {
        if(singleton == null){
            singleton = new ElectronicStore();
        }
        return singleton;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public static void setSingleton(ElectronicStore singleton) {
        ElectronicStore.singleton = singleton;
    }
}
