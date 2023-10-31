package com.pointsApp.demo.dao;

import com.pointsApp.demo.model.Merchant;

import java.util.List;

public class JdbcMerchantDao implements MerchantDao{

    @Override
    public List<Merchant> getMerchants() {
        return null;
    }

    @Override
    public Merchant getMerchantById() {
        return null;
    }

    @Override
    public Merchant createMerchant(Merchant merchant) {
        return null;
    }

    @Override
    public Merchant linkMerchantToRewardProgram(int merchantId, int rewardProgId) {
        return null;
    }

    @Override
    public Merchant updateMerchant(Merchant merchant) {
        return null;
    }

    @Override
    public Merchant deleteMerchant(Merchant merchant) {
        return null;
    }
}
