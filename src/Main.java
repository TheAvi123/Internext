public class Main {

    static HTMLSource source;
    static HTMLtoPlainText plainText;

    public static void main(String[] args) {
        source = new HTMLSource();
        plainText = new HTMLtoPlainText();

        String url = "https://en.wikipedia.org/wiki/List_of_richest_people_in_the_world";
        String html = source.getHTMLcode(url);
        System.out.println(html);
        System.out.println(plainText.getPlainText(html));
    }
}
