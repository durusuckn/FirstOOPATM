public class Boss extends Worker{
    private int numberOfPersonsResponsible;

    public Boss(String name, String lastName, int id, int numberOfPersonsResponsible){
        super(name,lastName,id);
        this.numberOfPersonsResponsible=numberOfPersonsResponsible;
    }

    public int getNumberOfPersonsResponsible() {
        return numberOfPersonsResponsible;
    }

    public void setNumberOfPersonsResponsible(int numberOfPersonsResponsible) {
        this.numberOfPersonsResponsible = numberOfPersonsResponsible;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Number of Person Responsible: "+this.numberOfPersonsResponsible);
    }
    public void makeRaise(int raise){
        System.out.println(getName()+" çalışanlara "+raise+" kadar zam yapıyor...");
    }
}
