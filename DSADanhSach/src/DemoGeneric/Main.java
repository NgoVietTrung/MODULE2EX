package DemoGeneric;

public class Main {
    public static void main(String[] args) {
        Translate<String,String> translate = new Translate<String,String>("Study","Hoc");
        String english=translate.getEng();
        String vietnamese=translate.getViet();
        System.out.println(english+":"+vietnamese);
    }
}
