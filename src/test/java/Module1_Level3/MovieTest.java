package Module1_Level3;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class MovieTest {
        private static String MOVIE_FIELD_ERROR = "The movie's actual %s field value is:'%s', the expected value is:'%s'";

        @Test
        public void movieTest() {
            Movie matri = new Movie("The Matrix", "Keanu Reeves", 1999);
            Movie titanic = new Movie("Titanic", "Leonardo di Caprio", 1997);

            String expectedTitle = "The Matrix";
            assertThat(matri.getTitle()).withFailMessage(MOVIE_FIELD_ERROR, "title",matri.getTitle(), expectedTitle).isEqualTo(expectedTitle);
        }
    }

