package project.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigimonCardDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    DigimonCardDao cardDao;

    /**
     * Runs before each test
     * Refreshes the object
     */
    @BeforeEach
    void setUp() {
        cardDao = new DigimonCardDao();
    }

    /**
     * Retrieves the card by name
     */
    @Test
    void getCardByNameSuccess() {
        logger.info(cardDao.getCardByParameter("n=", "MetalGreymon").get(0).getCardNumber());
        assertEquals("BO-01", cardDao.getCardByParameter("n=","MetalGreymon").get(0).getCardNumber());
    }

    /**
     * Retrieves the card by number
     */
    @Test
    void getCardByNumberSuccess() {
        logger.info(cardDao.getCardByParameter("card=","BO-01").get(0).getCardName());
        assertEquals("A Blazing Storm of Metal!", cardDao.getCardByParameter("card=", "BT5-103").get(0).getCardName());
    }

    /**
     * Retrieves all cards
     */
    @Test
    void getAllCardsSuccess() {
    }
}