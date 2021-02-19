package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {

    @Test
    void finderTest(){
            List<Post> posts = List.of(
                    new Post("Kék madár törött szárnnyal", LocalDate.of(1987, 2, 23), "A fiatalok lakásgondjairól", "Kiss G. János"),
                    new Post("Egri csillagok", LocalDate.of(1901, 1, 1), "Egervár védőinek története", "Gárdonyi Géza"),
                    new Post("Isten rabjai", LocalDate.of(1899, 1, 1), "Szent Margit legendája", "Gárdonyi Géza"),
                    new Post("Made in Japan", LocalDate.of(1993, 5, 8), "A Sony corp. története", "Morita Akio"),
                    new Post("The history of AI", LocalDate.of(2093, 5, 8), "#IQ", "MZ/X"));

            assertEquals("A fiatalok lakásgondjairól",new PostFinder(posts).findPostsFor("Kiss G. János").get(0).getContent());
            assertEquals(2,new PostFinder(posts).findPostsFor("Gárdonyi Géza").size());
            assertEquals(0,new PostFinder(posts).findPostsFor("MZ/X").size());
        }

        @Test
    void emptyAndNullTest(){
            assertThrows(IllegalArgumentException.class, ()->new Post("", LocalDate.of(1901, 1, 1), "Egervár védőinek története", "Gárdonyi Géza"));
            assertThrows(IllegalArgumentException.class, ()->new Post("Isten rabjai", LocalDate.of(1899, 1, 1), null, "Gárdonyi Géza"));
            assertEquals("Empty or null not allowed", assertThrows(IllegalArgumentException.class,
                    ()->new Post("Isten rabjai", LocalDate.of(1899, 1, 1), null, "Gárdonyi Géza")).getMessage());
        }

    }