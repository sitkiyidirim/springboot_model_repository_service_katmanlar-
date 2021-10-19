package com.sha.springbootbookseller.repository;

import com.sha.springbootbookseller.model.PurchaseHistory;
import com.sha.springbootbookseller.repository.projection.IPurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPurchaseHistoryRepository extends JpaRepository<PurchaseHistory,Long> {

     @Query("select b.title as title, ph.price as price, ph.purchaseTime as purchaseTime from PurchaseHistory ph left join Book b " +
             "on ph.bookId=b.id " +
             "where ph.userId =:userId")
    List<IPurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);
}
