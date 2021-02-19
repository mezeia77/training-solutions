package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> findPostsFor(String user){
        List<Post> result = new ArrayList<>();
        for (Post post:posts){
            if(post.getOwner().equals(user) && post.getPublishedAt().isBefore(LocalDate.now()) && !post.getContent().isEmpty() && !post.getTitle().isEmpty()){
                result.add(post);
            }
        }
        return result;
    }

}
//    Adott az alábbi osztály:

//public class Post {
//    private String title;
//    private LocalDate publishedAt;
//    private String content;
//    private String owner;
//}
//    Implementáljunk a PostFinder osztályban egy public List<Post> findPostsFor(String user) metódust az alábbi módon:
//
//        Csak olyan Post-ot adjunk vissza, amelynek az owner-e megegyezik a megadott user-rel
//        A Post publishedAt dátuma korábbi kell, hogy legyen, mint a LocalDate.now()
//        A content és a title nem lehet üres
//        Tároljunk egy List<Post> objektumot a PostFinder osztályban, melyet konstruktor paraméterként kap meg és ezt használjuk!