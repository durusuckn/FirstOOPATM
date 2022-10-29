public class Worker {
    private String name;
    private String lastName;
    private int id;

    public Worker(String name,String lastName,int id){
        this.id=id;
        this.lastName=lastName;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void showInformation(){
        System.out.println("*********** INFORMATION ***********\n" +
                "Name: "+this.name + "\nLast Name: "+this.lastName+"\nID: "+this.id);
    }


}
