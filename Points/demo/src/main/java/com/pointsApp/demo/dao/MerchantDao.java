package com.pointsApp.demo.dao;

import com.pointsApp.demo.model.Merchant;

import java.util.List;

public interface MerchantDao {

    List<Merchant> getMerchants();
    /** ^^^
     * gets all merchants from the datastore.
     *
     * @return all merchants as Merchant objects in a List. If there are no results, returns an empty list
     */
    Merchant getMerchantById();
    /** ^^^
     * gets a merchant from the datastore that belongs to the given id.
     * If the id is not found, return null.
     *
     * @param id the merchant id to get from the datastore
     * @return a filled out merchant object.
     */
    Merchant createMerchant(Merchant merchant);
    /** ^^^
     * inserts a new merchant into the datastore.
     *
     * @param merchant the merchant object to insert
     * @return the merchant object with its new id filled in
     */
    Merchant linkMerchantToRewardProgram(int merchantId, int rewardProgId);
    /** ^^^
     * Link a merchant to a reward program that users can exchange points on.
     *
     * @param projectId the project to put the employee on
     * @param employeeId the employee to assign
     */
    Merchant updateMerchant(Merchant merchant);
    /** ^^^
     * Updates an existing merchant in the datastore.
     *
     * @param merchant the merchant object to update
     * @return the merchant object with its updated fields
     */
    Merchant deleteMerchant(Merchant merchant);
    /** ^^^
     * Removes a merchant from the datastore, which requires deleting
     * records from multiple tables: merchant, reward_program
     *
     * @param id the id of the project to remove
     * @return the number of projects deleted
     */

}
