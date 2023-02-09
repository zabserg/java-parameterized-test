import com.example.s3_git_extra.Program;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckIsAdultTest {

    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals(true, isAdult, "Должно вернуться true, так как пользователь совершеннолетний");
    }

    // Напиши код здесь
    @Test
    public void checkIsAdultWhenAgeIsLessThan18False () {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        assertEquals(false, isAdult, "Должно вернуться false, так как пользователь не совершеннолетний");
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        assertEquals(true, isAdult, "Должно вернуться true, так как пользователь совершеннолетний");
    }

}

