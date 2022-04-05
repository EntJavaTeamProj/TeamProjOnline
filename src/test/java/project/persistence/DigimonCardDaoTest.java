package project.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigimonCardDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Test
    void getCardByNameSuccess() {
        DigimonCardDao dao = new DigimonCardDao();
        assertEquals("BO-01", dao.getCardByName("MetalGreymon").getCardnumber());
    }

    @Test
    void getCardByNumberSuccess() {
    }

    @Test
    void getAllCardsSuccess() {
    }
}