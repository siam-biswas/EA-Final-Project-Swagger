/*
 * EAFinalProjectLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost8089.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import localhost8089.ApiHelper;
import localhost8089.EAFinalProjectClient;
import localhost8089.exceptions.ApiException;
import localhost8089.models.AddSeriesRequest;
import localhost8089.models.UpdateSeriesRequest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SeriesServiceControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static EAFinalProjectClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static SeriesServiceController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getSeriesServiceController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Test case for Get Serieses.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetSerieses() throws Exception {

        // Set callback and perform API call
        try {
            controller.getSerieses();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Get Series.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetSeries() throws Exception {

        // Set callback and perform API call
        try {
            controller.getSeries();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Filter Seriess.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testFilterSeriess() throws Exception {
        // Parameters for the API call
        String filterType = 
                "DIRECTOR";
        String value = 
                "Woody Allen";

        // Set callback and perform API call
        try {
            controller.filterSeriess(filterType, value);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Update Series.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUpdateSeries() throws Exception {
        // Parameters for the API call
        UpdateSeriesRequest body = ApiHelper.deserialize(
                "{\r\n  \"id\": 1,\r\n  \"durationInMinutes\": 162,\r\n  \"genre\": \"Drama\",\r\n "
                + " \"director\": \"Frank Darabont\",\r\n  \"releaseDate\": \"1994-09-10\",\r\n  "
                + "\"title\": \"The Shawshank Redemption\"\r\n}",
                UpdateSeriesRequest.class);

        // Set callback and perform API call
        try {
            controller.updateSeries(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Delete Series.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDeleteSeries() throws Exception {

        // Set callback and perform API call
        try {
            controller.deleteSeries();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Test case for Add Series.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testAddSeries() throws Exception {
        // Parameters for the API call
        AddSeriesRequest body = ApiHelper.deserialize(
                "{\r\n  \"title\": \"Annie Hall\",\r\n  \"numberOfSeasons\": 2,\r\n  \"numberOfEpis"
                + "odes\": 15,\r\n  \"durationInMinutes\": 150,\r\n  \"genre\": \"Action\",\r\n  "
                + "\"director\": \"Woody Allen\",\r\n  \"releaseDate\": \"2002-12-23\"\r\n}",
                AddSeriesRequest.class);

        // Set callback and perform API call
        try {
            controller.addSeries(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

}
