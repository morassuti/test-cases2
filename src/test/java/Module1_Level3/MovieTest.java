package Module1_Level3;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class MovieTest {
    @Test
        public void movieTest() {
            Movie matrix = new Movie("The Matrix", "Keanu Reeves", 1999);

            String expectedTitle = "The Matrix";
            String MOVIE_FIELD_ERROR = "The movie's actual %s field value is:'%s', the expected value is:'%s'";
            assertThat(matrix.getTitle()).withFailMessage(MOVIE_FIELD_ERROR, "title",matrix.getTitle(), expectedTitle).isEqualTo(expectedTitle);
        }
    }

