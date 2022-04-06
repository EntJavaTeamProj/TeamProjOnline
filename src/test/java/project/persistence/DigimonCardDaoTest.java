package project.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
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
        logger.info(cardDao.getCardByName("MetalGreymon").getCardNumber());
        assertEquals("BO-01", cardDao.getCardByName("MetalGreymon").getCardNumber());
    }

    /**
     * Retrieves the card by number
     */
    @Test
    void getCardByNumberSuccess() {
        logger.info(cardDao.getCardByName("MetalGreymon").getCardNumber());
        assertEquals("BO-01", cardDao.getCardByNumber("BO-01").getCardNumber());
    }

    /**
     * Retrieves all cards
     */
    @Test
    void getAllCardsSuccess() {
    }
}