package SandBox.Language;

class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers,String regionsSpoken, String wordOrder ) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;

    }

    public void getInfo() {
        System.out.println(this.name+" is spoken by " +this.numSpeakers+" people mainly in" +this.regionsSpoken+".");

        System.out.println("The language follows the word order: "+this.wordOrder+".");
    }


    public static void main(String[] args) {
        Language langu = new Language("Имя", 7686, "Регион", "Язык региона" );
        Mayan may = new Mayan("Maya", 2342);


        langu.getInfo();
        may.getInfo();

    }

}