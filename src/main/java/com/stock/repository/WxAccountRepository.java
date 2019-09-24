package com.stock.repository;

import com.stock.domain.entity.WxAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by EalenXie on 2018/11/26 10:32.
 */
public interface WxAccountRepository extends JpaRepository<WxAccount, Integer> {

    /**
     * 根据OpenId查询用户信息
     */
    WxAccount findByWxOpenid(String wxOpenId);

    @Query("select wxAccount from WxAccount wxAccount where wxAccount.wxOpenid = :wxOpenId")
    List<WxAccount> listByWxOpenId(String wxOpenId);
}
