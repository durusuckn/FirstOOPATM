public class Developer extends Worker {
    private String language;

    public Developer(String name, String lastName, int id, String language){
        super(name,lastName,id);
        this.language=language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public void formatting(String OS){
        System.out.println(getName()+" "+ OS+ "commited");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Languages:"+this.language);
    }
}
