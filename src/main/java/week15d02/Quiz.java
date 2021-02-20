package week15d02;

public class Quiz {

    private String question;
    private String answer;
    private int score;
    private String topic;

    public Quiz(String question, String answer, int score, String topic) {
        this.question = question;
        this.answer = answer;
        this.score = score;
        this.topic = topic;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getScore() {
        return score;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", score=" + score +
                ", topic='" + topic + '\'' +
                '}';
    }

}
//    Adott egy vetélkedő kérdésbankja egy fájlban. A fálban az egy kérdéshez tartozó adatok két sorban helyezkednek el.
//        Első sorban a kérdés, a második sorban a válasz a pontszám és a téma szóközzel elválasztava.
//        Olvasd be a fájl tartalmát a memóriába, majd oldjátok meg a lenti feladatokat.
//        Mikor volt a mohacsi vesz?
//        1526 1 tortenelem
//        Melyik evben bomlott fel a Nyugat-Romai Birodalom?
//        476 1 tortenelem
//        Melyik a legkisebb primszam?
//        2 1 matematika
//        Mennyi 64 kobgyoke?
//        4 2 matematika
//        Hany atloja van a szabalyos nyolcszognek?
//        24 2 matematika
//        Melyik evben kezdodott a Honfoglalas?
//        895 1 tortenelem
//        Mikor adtak ki az Aranybullat?
//        1222 1 tortenelem
//        Melyik evben adtak ki Angliaban a Magna Chartat?
//        1215 3 tortenelem
//        ```
//        1. Írj egy metódust, melynek paramétere a téma és add vissza, az összes kérdést abban a témában. (Csak a kérdéseket)
//        2. Írj egy metódust, ami random sorsol ki egy kérdést, és adja vissza annak összes adatát.
//        3. Készíts egy metódust ami rendszerezi a kérdéseket témakörönként. Visszatér egy adatszerkezetben amelyben témánként megtalálható az összes kérdés.
//        4. Az előző feladat segítségével határozd meg, hogy melyik téma kérdései érik a legtöbb pontot (összpontszám)!
