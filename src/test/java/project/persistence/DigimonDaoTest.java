package project.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigimonDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    DigimonDao digimonDao;

    /**
     * Runs before each test
     * Refreshes the object
     */
    @BeforeEach
    void setUp() {
        digimonDao = new DigimonDao();
    }

    /**
     * Retrieves the digimon by its name
     */
    @Test
    void getCardByNameSuccess() {
        logger.info(digimonDao.getCardByName("MetalGreymon").get(0));
        assertEquals("MetalGreymon", digimonDao.getCardByName("MetalGreymon").get(0).getDigimonName());
    }

    /**
     * Retrieves all the digimons
     */
    @Test
    void getAllDigimonsSuccess() {
        logger.info(digimonDao.getAllDigimons().get(0).getDigimonName());
        assertEquals("Koromon", digimonDao.getAllDigimons().get(0).getDigimonName());
    }
}
