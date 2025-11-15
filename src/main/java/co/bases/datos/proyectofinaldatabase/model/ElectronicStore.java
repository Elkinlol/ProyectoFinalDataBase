package co.bases.datos.proyectofinaldatabase.model;

public class ElectronicStore {
    private static ElectronicStore singleton;
    private SystemUser currentUser;

    public static ElectronicStore getSingleton() {
        if(singleton == null){
            singleton = new ElectronicStore();
        }
        return singleton;
    }

    public SystemUser getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(SystemUser currentUser) {
        this.currentUser = currentUser;
    }

    public static void setSingleton(ElectronicStore singleton) {
        ElectronicStore.singleton = singleton;
    }
}
