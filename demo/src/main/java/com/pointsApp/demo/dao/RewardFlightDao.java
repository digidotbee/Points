package com.pointsApp.demo.dao;

import com.pointsApp.demo.model.RewardFlight;

import java.util.List;

public interface RewardFlightDao {
    List<RewardFlight> getRewardFlights();
    /** ^^^
     * gets all reward_flights from the datastore.
     *
     * @return all reward_flights as RewardFlight objects in a List. If there are no results, returns an empty list
     */
    RewardFlight getRewardFlightById();
    /** ^^^
     * gets a reward_flight from the datastore that belongs to the given id.
     * If the id is not found, return null.
     *
     * @param id the reward_flight id to get from the datastore
     * @return a filled out reward_flight object.
     */
    RewardFlight createRewardFlight(RewardFlight reward_flight);
    /** ^^^
     * inserts a new reward_flight into the datastore.
     *
     * @param reward_flight the reward_flight object to insert
     * @return the reward_flight object with its new id filled in
     */
    RewardFlight linkRewardFlightToRewardProgram(int reward_flightId, int rewardProgId);
    /** ^^^
     * Link a reward_flight to a reward program that users can exchange points on.
     *
     * @param projectId the project to put the employee on
     * @param employeeId the employee to assign
     */
    RewardFlight updateRewardFlight(RewardFlight reward_flight);
    /** ^^^
     * Updates an existing reward_flight in the datastore.
     *
     * @param reward_flight the reward_flight object to update
     * @return the reward_flight object with its updated fields
     */
    RewardFlight deleteRewardFlight(RewardFlight reward_flight);
    /** ^^^
     * Removes a reward_flight from the datastore, which requires deleting
     * records from multiple tables: reward_flight, reward_program
     *
     * @param id the id of the project to remove
     * @return the number of projects deleted
     */
}
